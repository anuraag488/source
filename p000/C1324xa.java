package p000;

/* JADX INFO: renamed from: xa */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1324xa extends of4 implements oq1 {

    /* JADX INFO: renamed from: t */
    public boolean f34085t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ C0903mb f34086u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ uv0 f34087v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f34088w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0940nb f34089x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1407zj f34090y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324xa(C0940nb c0940nb, InterfaceC1407zj interfaceC1407zj, wm0 wm0Var) {
        super(4, wm0Var);
        this.f34089x = c0940nb;
        this.f34090y = interfaceC1407zj;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        C1324xa c1324xa = new C1324xa(this.f34089x, this.f34090y, (wm0) obj4);
        c1324xa.f34086u = (C0903mb) obj;
        c1324xa.f34087v = (uv0) obj2;
        c1324xa.f34088w = obj3;
        return c1324xa.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f34085t;
        if (!z) {
            k43.m7376J(obj);
            C0903mb c0903mb = this.f34086u;
            uv0 uv0Var = this.f34087v;
            Object obj2 = this.f34088w;
            C0940nb c0940nb = this.f34089x;
            float fM13399h = ((z73) c0940nb.f25613j).m13399h();
            this.f34086u = null;
            this.f34087v = null;
            this.f34085t = true;
            if (AbstractC0485bb.m3536c(c0940nb, fM13399h, c0903mb, uv0Var, obj2, this.f34090y, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
