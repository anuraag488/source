package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hy3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20944t = 0;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f20945u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f20946v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy3(long j, wm0 wm0Var, sw2 sw2Var) {
        super(2, wm0Var);
        this.f20946v = sw2Var;
        this.f20945u = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f20944t) {
            case 0:
                hy3 hy3Var = new hy3(this.f20945u, wm0Var);
                hy3Var.f20946v = obj;
                return hy3Var;
            default:
                return new hy3(this.f20945u, wm0Var, (sw2) this.f20946v);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20944t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((hy3) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4Var);
                break;
            default:
                ((hy3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f20944t;
        ju4 ju4Var = ju4.f22634a;
        long j = this.f20945u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                vy3 vy3Var = ((ty3) this.f20946v).f31538a;
                vy3Var.m12031d(vy3Var.f32968k, j, 1);
                break;
            default:
                sw2 sw2Var = (sw2) this.f20946v;
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                if (((ff3) sw2Var.getValue()) != null) {
                    sw2Var.setValue(null);
                }
                sw2Var.setValue(new ff3(j));
                break;
        }
        return ju4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy3(long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20945u = j;
    }
}
