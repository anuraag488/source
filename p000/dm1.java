package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm1 {

    /* JADX INFO: renamed from: a */
    public static final pq3 f17185a;

    /* JADX INFO: renamed from: b */
    public static final jp0 f17186b;

    static {
        pq3 pq3Var = new pq3((byte) 4);
        pq3Var.f27896b = new f70((byte) 19);
        pq3Var.f27897c = new bp2(16);
        VarHandle.storeStoreFence();
        f17185a = pq3Var;
        jp0 jp0Var = new jp0((byte) 9, false);
        jp0Var.f22481b = new bp2(16);
        long[] jArr = tv3.f31472a;
        jp0Var.f22482c = new lw2();
        jp0Var.f22483d = new f70((byte) 19);
        VarHandle.storeStoreFence();
        f17186b = jp0Var;
    }
}
