package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v90 {

    /* JADX INFO: renamed from: c */
    public static final v90 f32473c;

    /* JADX INFO: renamed from: a */
    public HashMap f32474a;

    /* JADX INFO: renamed from: b */
    public HashMap f32475b;

    static {
        v90 v90Var = new v90();
        v90Var.f32474a = new HashMap();
        v90Var.f32475b = new HashMap();
        VarHandle.storeStoreFence();
        f32473c = v90Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m11768b(HashMap map, u90 u90Var, ek2 ek2Var, Class cls) {
        ek2 ek2Var2 = (ek2) map.get(u90Var);
        if (ek2Var2 == null || ek2Var == ek2Var2) {
            if (ek2Var2 == null) {
                map.put(u90Var, ek2Var);
            }
        } else {
            String name = u90Var.f31737b.getName();
            String name2 = cls.getName();
            C1077qn.m9987m(c75.m3881m(zi4.m13625y("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(ek2Var2), ", new value ", String.valueOf(ek2Var)));
        }
    }

    /* JADX INFO: renamed from: a */
    public final t90 m11769a(Class cls, Method[] methodArr) {
        int i;
        HashMap map = this.f32474a;
        Class superclass = cls.getSuperclass();
        HashMap map2 = new HashMap();
        if (superclass != null) {
            t90 t90VarM11769a = (t90) map.get(superclass);
            if (t90VarM11769a == null) {
                t90VarM11769a = m11769a(superclass, null);
            }
            map2.putAll(t90VarM11769a.f31007b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            t90 t90VarM11769a2 = (t90) map.get(cls2);
            if (t90VarM11769a2 == null) {
                t90VarM11769a2 = m11769a(cls2, null);
            }
            for (Map.Entry entry : t90VarM11769a2.f31007b.entrySet()) {
                m11768b(map2, (u90) entry.getKey(), (ek2) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            b43 b43Var = (b43) method.getAnnotation(b43.class);
            if (b43Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!lk2.class.isAssignableFrom(parameterTypes[0])) {
                        C1077qn.m9987m("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ek2 ek2VarValue = b43Var.value();
                if (parameterTypes.length > 1) {
                    if (!ek2.class.isAssignableFrom(parameterTypes[1])) {
                        C1077qn.m9987m("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ek2VarValue != ek2.ON_ANY) {
                        C1077qn.m9987m("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    C1077qn.m9987m("cannot have more than 2 params");
                    return null;
                }
                u90 u90Var = new u90();
                u90Var.f31736a = i;
                u90Var.f31737b = method;
                method.setAccessible(true);
                VarHandle.storeStoreFence();
                m11768b(map2, u90Var, ek2VarValue, cls);
                z = true;
            }
        }
        t90 t90Var = new t90();
        t90Var.f31007b = map2;
        HashMap map3 = new HashMap();
        t90Var.f31006a = map3;
        for (Map.Entry entry2 : map2.entrySet()) {
            ek2 ek2Var = (ek2) entry2.getValue();
            List arrayList = (List) map3.get(ek2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map3.put(ek2Var, arrayList);
            }
            arrayList.add((u90) entry2.getKey());
        }
        VarHandle.storeStoreFence();
        map.put(cls, t90Var);
        this.f32475b.put(cls, Boolean.valueOf(z));
        return t90Var;
    }
}
