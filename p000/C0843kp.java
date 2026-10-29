package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: kp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0843kp implements si1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23305a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ si1 f23306b;

    public /* synthetic */ C0843kp(byte b) {
        this.f23305a = b;
    }

    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) {
        byte b = this.f23305a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                si1 si1Var = this.f23306b;
                C0806jp c0806jp = new C0806jp((byte) 0);
                c0806jp.f22476b = ti1Var;
                VarHandle.storeStoreFence();
                Object objCollect = si1Var.collect(c0806jp, wm0Var);
                return objCollect == ap0.f14763a ? objCollect : ju4Var;
            default:
                si1 si1Var2 = this.f23306b;
                C0806jp c0806jp2 = new C0806jp((byte) 1);
                c0806jp2.f22476b = ti1Var;
                VarHandle.storeStoreFence();
                Object objCollect2 = si1Var2.collect(c0806jp2, wm0Var);
                return objCollect2 == ap0.f14763a ? objCollect2 : ju4Var;
        }
    }
}
