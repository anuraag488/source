package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xm2 {

    /* JADX INFO: renamed from: a */
    public static final xh3 f34419a;

    static {
        Object objM7389n;
        try {
            Method method = av3.class.getClassLoader().loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof xh3) {
                        objM7389n = (xh3) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof sy0)) {
                    i++;
                }
                objM7389n = null;
                break;
            }
        } catch (Throwable th) {
            objM7389n = k43.m7389n(th);
        }
        xh3 nc4Var = (xh3) (objM7389n instanceof cp3 ? null : objM7389n);
        if (nc4Var == null) {
            nc4Var = new nc4(new da2((byte) 9));
        }
        f34419a = nc4Var;
    }
}
