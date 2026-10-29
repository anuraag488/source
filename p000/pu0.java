package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public ol3 f27990t;

    /* JADX INFO: renamed from: u */
    public byte f27991u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ol3 f27992v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ru0 f27993w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ sf1 f27994x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f27995y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f27996z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu0(ol3 ol3Var, ru0 ru0Var, sf1 sf1Var, Object obj, boolean z, wm0 wm0Var) {
        super(1, wm0Var);
        this.f27992v = ol3Var;
        this.f27993w = ru0Var;
        this.f27994x = sf1Var;
        this.f27995y = obj;
        this.f27996z = z;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Object obj2 = this.f27995y;
        boolean z = this.f27996z;
        return new pu0(this.f27992v, this.f27993w, this.f27994x, obj2, z, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r10 == r0) goto L21;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        ol3 ol3Var;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f27991u;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f27995y;
        ru0 ru0Var = this.f27993w;
        ol3 ol3Var2 = this.f27992v;
        if (b == 0) {
            k43.m7376J(obj);
            c74 c74VarM10430c = ru0Var.m10430c();
            this.f27990t = ol3Var2;
            this.f27991u = (byte) 1;
            Integer num = new Integer(((AtomicInteger) c74VarM10430c.f15861b.f22555a).incrementAndGet());
            if (num != ap0Var) {
                obj = num;
                ol3Var = ol3Var2;
            }
            return ap0Var;
        }
        if (b == 1) {
            ol3Var = this.f27990t;
            k43.m7376J(obj);
        } else {
            if (b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        if (this.f27996z) {
            ru0Var.f29632h.m10918c(new at0(obj2 != null ? obj2.hashCode() : 0, ol3Var2.f26851a, obj2));
        }
        return ju4Var;
        ol3Var.f26851a = ((Number) obj).intValue();
        this.f27990t = null;
        this.f27991u = (byte) 2;
        sf1 sf1Var = this.f27994x;
        if (sf1Var.f15235c.get()) {
            C1077qn.m9989o("This scope has already been closed.");
            return null;
        }
        Object objM4691T = dt0.m4691T(sf1Var.f15233a, new hn0(sf1Var, obj2, null), this);
        if (objM4691T != ap0Var) {
            objM4691T = ju4Var;
        }
    }
}
