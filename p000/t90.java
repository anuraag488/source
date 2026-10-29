package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t90 {

    /* JADX INFO: renamed from: a */
    public HashMap f31006a;

    /* JADX INFO: renamed from: b */
    public HashMap f31007b;

    /* JADX INFO: renamed from: a */
    public static void m10994a(List list, lk2 lk2Var, ek2 ek2Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                u90 u90Var = (u90) list.get(size);
                Method method = u90Var.f31737b;
                try {
                    int i = u90Var.f31736a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, lk2Var);
                    } else if (i == 2) {
                        method.invoke(obj, lk2Var, ek2Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    xy4.m12785n("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
