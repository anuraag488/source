package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d31 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f16760t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d31(int i, wm0 wm0Var, byte b) {
        super(i, wm0Var);
        this.f16760t = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f16760t;
        ju4 ju4Var = ju4.f22634a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((b33) obj2).f15059a;
                new d31(i, (wm0) obj3, (byte) 0).invokeSuspend(ju4Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new d31(i, (wm0) obj3, (byte) 1).invokeSuspend(ju4Var);
                break;
            default:
                long j2 = ((b33) obj2).f15059a;
                new d31(i, (wm0) obj3, (byte) 2).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f16760t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                break;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                break;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                break;
        }
        return ju4Var;
    }
}
