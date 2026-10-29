package p000;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0781j0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21914t;

    /* JADX INFO: renamed from: u */
    public byte f21915u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ nv2 f21916v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ff3 f21917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0892m0 f21918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0781j0(nv2 nv2Var, ff3 ff3Var, AbstractC0892m0 abstractC0892m0, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21914t = b;
        this.f21916v = nv2Var;
        this.f21917w = ff3Var;
        this.f21918x = abstractC0892m0;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f21914t) {
            case 0:
                return new C0781j0(this.f21916v, this.f21917w, this.f21918x, wm0Var, (byte) 0);
            default:
                return new C0781j0(this.f21916v, this.f21917w, this.f21918x, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21914t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((C0781j0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.m8860a(r8, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r3.m8860a(r8, r10) == r0) goto L31;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.f21914t;
        ju4 ju4Var = ju4.f22634a;
        AbstractC0892m0 abstractC0892m0 = this.f21918x;
        nv2 nv2Var = this.f21916v;
        ff3 ff3Var = this.f21917w;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f21915u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    long j = aa0.f202a;
                    this.f21915u = (byte) 1;
                    if (d24.m4317r(j, this) != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                abstractC0892m0.f24496G = ff3Var;
                return ju4Var;
                this.f21915u = (byte) 2;
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f21915u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    long j2 = aa0.f202a;
                    this.f21915u = (byte) 1;
                    if (d24.m4317r(j2, this) != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                abstractC0892m0.f24492C = ff3Var;
                return ju4Var;
                this.f21915u = (byte) 2;
                break;
        }
    }
}
