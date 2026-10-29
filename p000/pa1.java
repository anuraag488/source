package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f27476t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ int f27477u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa1(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f27476t = b;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        int i = 2;
        switch (this.f27476t) {
            case 0:
                pa1 pa1Var = new pa1(i, wm0Var, (byte) 0);
                pa1Var.f27477u = ((Number) obj).intValue();
                return pa1Var;
            default:
                pa1 pa1Var2 = new pa1(i, wm0Var, (byte) 1);
                pa1Var2.f27477u = ((Number) obj).intValue();
                return pa1Var2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27476t;
        ju4 ju4Var = ju4.f22634a;
        int iIntValue = ((Number) obj).intValue();
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((pa1) create(wm0Var, Integer.valueOf(iIntValue))).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f27476t;
        int i = this.f27477u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(i > 0);
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(i > 0);
        }
    }
}
