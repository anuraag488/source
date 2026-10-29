package p000;

import ads_mobile_sdk.yz0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29313t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f29314u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f29315v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri2(Object obj, int i, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f29313t = b;
        this.f29315v = obj;
        this.f29314u = i;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f29313t;
        int i = this.f29314u;
        Object obj2 = this.f29315v;
        switch (b) {
            case 0:
                return new ri2((si2) obj2, i, wm0Var, (byte) 0);
            default:
                return new ri2((yz0) obj2, i, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29313t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((ri2) create((wm0) obj2, (tx3) obj)).invokeSuspend(ju4Var);
                break;
            default:
                new ri2((yz0) this.f29315v, this.f29314u, (wm0) obj2, (byte) 1).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f29313t;
        ju4 ju4Var = ju4.f22634a;
        int i = this.f29314u;
        Object obj2 = this.f29315v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                ((si2) obj2).m10791j(i, 0, true);
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                yz0 yz0Var = (yz0) obj2;
                yz0Var.mo1415a(i);
                yz0Var.m2786o();
                break;
        }
        return ju4Var;
    }
}
