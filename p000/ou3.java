package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ou3 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f27125a = new nc4(new nu3(0));

    /* JADX INFO: renamed from: a */
    public static final mu3 m9279a(Map map, yp1 yp1Var) {
        lw2 lw2Var;
        mu3 mu3Var = new mu3();
        mu3Var.f25222a = yp1Var;
        if (map == null || map.isEmpty()) {
            lw2Var = null;
        } else {
            lw2Var = new lw2(map.size());
            for (Map.Entry entry : map.entrySet()) {
                lw2Var.m8138m(entry.getKey(), entry.getValue());
            }
        }
        mu3Var.f25223b = lw2Var;
        VarHandle.storeStoreFence();
        return mu3Var;
    }
}
