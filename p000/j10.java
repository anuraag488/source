package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j10 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21945a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ d64 f21946b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ zo0 f21947c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ wp1 f21948d;

    public /* synthetic */ j10(byte b) {
        this.f21945a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f21945a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                d64 d64Var = this.f21946b;
                wp1 wp1Var = this.f21948d;
                zo0 zo0Var = this.f21947c;
                int iOrdinal = d64Var.m4386c().ordinal();
                if (iOrdinal == 1) {
                    wp1Var.invoke();
                } else if (iOrdinal == 2) {
                    lb5.m7910S(zo0Var, null, null, new t10(d64Var, null, (byte) 2), 3);
                } else {
                    lb5.m7910S(zo0Var, null, null, new t10(d64Var, null, (byte) 3), 3);
                }
                break;
            default:
                d64 d64Var2 = this.f21946b;
                zo0 zo0Var2 = this.f21947c;
                wp1 wp1Var2 = this.f21948d;
                if (((Boolean) d64Var2.f16819c.invoke(e64.f17842a)).booleanValue()) {
                    t82 t82VarM7910S = lb5.m7910S(zo0Var2, null, null, new t10(d64Var2, null, (byte) 6), 3);
                    l10 l10Var = new l10((byte) 0);
                    l10Var.f23692b = d64Var2;
                    l10Var.f23693c = wp1Var2;
                    VarHandle.storeStoreFence();
                    ((e92) t82VarM7910S).mo4972C(l10Var);
                }
                break;
        }
        return ju4Var;
    }
}
