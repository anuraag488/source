package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class x91 implements vq4 {
    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Class superclass = cs4Var.f16429a;
        if (Enum.class.isAssignableFrom(superclass) && superclass != Enum.class) {
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            y91 y91Var = new y91();
            HashMap map = new HashMap();
            y91Var.f35038a = map;
            y91Var.f35039b = new HashMap();
            y91Var.f35040c = new HashMap();
            try {
                Field[] declaredFields = superclass.getDeclaredFields();
                int i = 0;
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        declaredFields[i] = field;
                        i++;
                    }
                }
                Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
                AccessibleObject.setAccessible(fieldArr, true);
                for (Field field2 : fieldArr) {
                    Enum r5 = (Enum) field2.get(null);
                    String strName = r5.name();
                    String string = r5.toString();
                    s24 s24Var = (s24) field2.getAnnotation(s24.class);
                    if (s24Var != null) {
                        strName = s24Var.value();
                        for (String str : s24Var.alternate()) {
                            map.put(str, r5);
                        }
                    }
                    map.put(strName, r5);
                    y91Var.f35039b.put(string, r5);
                    y91Var.f35040c.put(r5, strName);
                }
                VarHandle.storeStoreFence();
                return y91Var;
            } catch (IllegalAccessException e) {
                C1077qn.m9985k(e);
            }
        }
        return null;
    }
}
