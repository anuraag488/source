package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: jx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0814jx extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f22707t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ l22 f22708u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f22709v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22710w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0814jx(l22 l22Var, float f, int i, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22708u = l22Var;
        this.f22709v = f;
        this.f22710w = i;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new C0814jx(this.f22708u, this.f22709v, this.f22710w, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((C0814jx) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f22707t;
        ju4 ju4Var = ju4.f22634a;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        l22 l22Var = this.f22708u;
        C0910mi c0910mi = l22Var.f23730A;
        if (c0910mi != null) {
            float f = this.f22709v;
            Float f2 = new Float(f);
            float f3 = f + 1.0f;
            Float f4 = new Float(f3);
            sq4 sq4Var = c0910mi.f24927a;
            AbstractC0654fk abstractC0654fk = (AbstractC0654fk) sq4Var.f30508a.invoke(f2);
            if (abstractC0654fk == null) {
                abstractC0654fk = c0910mi.f24934h;
            }
            AbstractC0654fk abstractC0654fk2 = (AbstractC0654fk) sq4Var.f30508a.invoke(f4);
            if (abstractC0654fk2 == null) {
                abstractC0654fk2 = c0910mi.f24935i;
            }
            int iMo4034b = abstractC0654fk.mo4034b();
            byte b = 0;
            for (int i = 0; i < iMo4034b; i++) {
                if (abstractC0654fk.mo3608a(i) > abstractC0654fk2.mo3608a(i)) {
                    md3.m8285b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC0654fk + " is greater than upper bound " + abstractC0654fk2 + " on index " + i);
                }
            }
            c0910mi.f24936j = abstractC0654fk;
            c0910mi.f24937k = abstractC0654fk2;
            if (!c0910mi.m8329e()) {
                Object objM8326b = c0910mi.m8326b(c0910mi.m8328d());
                if (!z62.m13387o(objM8326b, c0910mi.m8328d())) {
                    c0910mi.f24929c.f14572b.setValue(objM8326b);
                }
            }
            Float f5 = new Float(f3);
            rq4 rq4VarM10016K = qq2.m10016K(this.f22710w, 0, h51.f20398c, 2);
            sn3 sn3Var = sn3.f30409a;
            e32 e32VarM10037u = qq2.m10037u(rq4VarM10016K, 4);
            C0777ix c0777ix = new C0777ix(b);
            c0777ix.f21854b = l22Var;
            VarHandle.storeStoreFence();
            this.f22707t = true;
            if (C0910mi.m8325a(c0910mi, f5, e32VarM10037u, c0777ix, this, 4) == ap0Var) {
                return ap0Var;
            }
        }
        return ju4Var;
    }
}
