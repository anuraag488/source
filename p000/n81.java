package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n81 {

    /* JADX INFO: renamed from: b */
    public static final n81 f25513b = new n81(new i50(6));

    /* JADX INFO: renamed from: c */
    public static final n81 f25514c;

    /* JADX INFO: renamed from: d */
    public static final n81 f25515d;

    /* JADX INFO: renamed from: e */
    public static final n81 f25516e;

    /* JADX INFO: renamed from: f */
    public static final n81 f25517f;

    /* JADX INFO: renamed from: a */
    public final m81 f25518a;

    static {
        byte b = 7;
        f25514c = new n81(new h50(b));
        f25515d = new n81(new q50(b));
        f25516e = new n81(new i50(b));
        byte b2 = 6;
        new n81(new q50(b2));
        new n81(new f70(b2));
        f25517f = new n81(new r50(b2));
    }

    public n81(w81 w81Var) {
        if (cn4.m4052a()) {
            l81 l81Var = new l81((byte) 1);
            l81Var.f23843b = w81Var;
            VarHandle.storeStoreFence();
            this.f25518a = l81Var;
            return;
        }
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            l81 l81Var2 = new l81((byte) 0);
            l81Var2.f23843b = w81Var;
            VarHandle.storeStoreFence();
            this.f25518a = l81Var2;
            return;
        }
        ar3 ar3Var = new ar3((byte) 25);
        ar3Var.f14813b = w81Var;
        VarHandle.storeStoreFence();
        this.f25518a = ar3Var;
    }
}
