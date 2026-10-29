package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sh0 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30267t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f30268u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh0(Object obj, wm0 wm0Var, byte b) {
        super(3, wm0Var);
        this.f30267t = b;
        this.f30268u = obj;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f30267t;
        ju4 ju4Var = ju4.f22634a;
        Object obj4 = this.f30268u;
        switch (b) {
            case 0:
                new sh0((ml3) obj4, (wm0) obj3, (byte) 0).invokeSuspend(ju4Var);
                break;
            default:
                long j = ((b33) obj2).f15059a;
                new sh0((k84) obj4, (wm0) obj3, (byte) 1).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f30267t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f30268u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                ((ml3) obj2).f25002a = true;
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                ((k84) obj2).m7427d(true);
                break;
        }
        return ju4Var;
    }
}
