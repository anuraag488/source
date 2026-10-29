package p000;

import java.lang.annotation.Annotation;
import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qa2 {

    /* JADX INFO: renamed from: a */
    public static final q50 f28340a = new q50((byte) 5);

    /* JADX INFO: renamed from: a */
    public static final int m9804a(g24 g24Var, i92 i92Var, String str) {
        m9807d(i92Var, g24Var);
        int iMo4430a = g24Var.mo4430a(str);
        if (iMo4430a != -3) {
            return iMo4430a;
        }
        js1 js1Var = i92Var.f21189b;
        jp1 jp1Var = new jp1((byte) 3);
        jp1Var.f22485b = g24Var;
        jp1Var.f22486c = i92Var;
        VarHandle.storeStoreFence();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) js1Var.f22555a;
        Map map = (Map) concurrentHashMap.get(g24Var);
        q50 q50Var = f28340a;
        Object obj = map != null ? map.get(q50Var) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = jp1Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(g24Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(g24Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(q50Var, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: b */
    public static final int m9805b(g24 g24Var, i92 i92Var, String str, String str2) {
        int iM9804a = m9804a(g24Var, i92Var, str);
        if (iM9804a != -3) {
            return iM9804a;
        }
        throw new o24(g24Var.mo3641b() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m9806c(i92 i92Var, g24 g24Var) {
        if (i92Var.f21188a.f30009b) {
            return true;
        }
        List annotations = g24Var.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof ja2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m9807d(i92 i92Var, g24 g24Var) {
        z62.m13387o(g24Var.mo4431c(), rd4.f29188j);
    }
}
