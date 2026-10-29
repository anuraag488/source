package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 {

    /* JADX INFO: renamed from: b */
    public static final x64 f35354b = new x64(0);

    /* JADX INFO: renamed from: a */
    public /* synthetic */ eo1 f35355a;

    /* JADX INFO: renamed from: b */
    public static Class m13178b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        x64 x64Var = f35354b;
        x64 x64Var2 = (x64) x64Var.get(classLoader);
        if (x64Var2 == null) {
            x64Var2 = new x64(0);
            x64Var.put(classLoader, x64Var2);
        }
        Class cls = (Class) x64Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        x64Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: c */
    public static Class m13179c(ClassLoader classLoader, String str) {
        try {
            return m13178b(classLoader, str);
        } catch (ClassCastException e) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final pn1 m13180a(String str) {
        try {
            return (pn1) m13179c(this.f35355a.f18326w.f29431v.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new gf0(zi4.m13621u("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
