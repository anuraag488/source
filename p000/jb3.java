package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb3 {

    /* JADX INFO: renamed from: a */
    public static final Method f22152a;

    /* JADX INFO: renamed from: b */
    public static final Method f22153b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (z62.m13387o(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (z62.m13387o(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        f22152a = method2;
        for (Method method3 : methods) {
            if (z62.m13387o(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f22153b = method;
    }
}
