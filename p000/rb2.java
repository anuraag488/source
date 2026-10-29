package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 extends bp3 implements nq1 {

    /* JADX INFO: renamed from: u */
    public tb2 f29127u;

    /* JADX INFO: renamed from: v */
    public boolean f29128v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ nv0 f29129w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ tb2 f29130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb2(tb2 tb2Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f29130x = tb2Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rb2 rb2Var = new rb2(this.f29130x, (wm0) obj3);
        rb2Var.f29129w = (nv0) obj;
        return rb2Var.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        tb2 tb2Var = this.f29130x;
        short s = tb2Var.f31051b;
        AbstractC0856l1 abstractC0856l1 = tb2Var.f31050a;
        nv0 nv0Var = this.f29129w;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f29128v;
        if (!z) {
            k43.m7376J(obj);
            byte bM7808v = abstractC0856l1.m7808v();
            if (bM7808v == 1) {
                return tb2Var.m11022d(true);
            }
            if (bM7808v == 0) {
                return tb2Var.m11022d(false);
            }
            if (bM7808v != 6) {
                if (bM7808v != 8) {
                    AbstractC0856l1.m7793r(abstractC0856l1, "Can't begin reading element, unexpected token", 0, 6);
                    throw null;
                }
                int i = tb2Var.f31052c + 1;
                tb2Var.f31052c = i;
                if (i >= s) {
                    zc6.m13506C(s);
                    throw null;
                }
                n92 n92VarM11020b = tb2Var.m11020b();
                tb2Var.f31052c--;
                return n92VarM11020b;
            }
            int i2 = tb2Var.f31052c + 1;
            tb2Var.f31052c = i2;
            if (i2 >= s) {
                zc6.m13506C(s);
                throw null;
            }
            this.f29129w = null;
            this.f29127u = tb2Var;
            this.f29128v = true;
            obj = tb2Var.m11021c(nv0Var, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tb2Var = this.f29127u;
            k43.m7376J(obj);
        }
        aa2 aa2Var = (aa2) obj;
        tb2Var.f31052c--;
        return aa2Var;
    }
}
