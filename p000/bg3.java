package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bg3 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f15258a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f15259b;

    static {
        HashMap map = new HashMap();
        f15259b = map;
        map.put(ag3.f14485a, 0);
        map.put(ag3.f14486b, 1);
        map.put(ag3.f14487c, 2);
        for (ag3 ag3Var : map.keySet()) {
            f15258a.append(((Integer) f15259b.get(ag3Var)).intValue(), ag3Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3588a(ag3 ag3Var) {
        Integer num = (Integer) f15259b.get(ag3Var);
        if (num != null) {
            return num.intValue();
        }
        wb1.m12196p(ag3Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static ag3 m3589b(int i) {
        ag3 ag3Var = (ag3) f15258a.get(i);
        if (ag3Var != null) {
            return ag3Var;
        }
        C1077qn.m9987m(c75.m3877i(i, "Unknown Priority for value "));
        return null;
    }
}
