package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fx2 implements a70, yy4 {

    /* JADX INFO: renamed from: a */
    public b70 f19375a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gx2 f19376b;

    @Override // p000.yy4
    /* JADX INFO: renamed from: a */
    public final void mo3483a(a04 a04Var, int i) {
        this.f19375a.mo3483a(a04Var, i);
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: b */
    public final boolean mo112b() {
        return this.f19375a.m3496t() instanceof s13;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f19375a.f15139e;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.a70
    /* JADX INFO: renamed from: h */
    public final void mo113h(Object obj, nq1 nq1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gx2.f20171i;
        gx2 gx2Var = this.f19376b;
        atomicReferenceFieldUpdater.set(gx2Var, null);
        b70 b70Var = this.f19375a;
        b71 b71Var = new b71((byte) 17);
        b71Var.f15141b = gx2Var;
        VarHandle.storeStoreFence();
        int i = b70Var.f20971c;
        C0928n c0928n = new C0928n((byte) 2);
        c0928n.f25353b = b71Var;
        VarHandle.storeStoreFence();
        b70Var.m3480C(ju4.f22634a, i, c0928n);
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: j */
    public final C0641f8 mo114j(Object obj, nq1 nq1Var) {
        b70 b70Var = this.f19375a;
        gx2 gx2Var = this.f19376b;
        C0928n c0928n = new C0928n((byte) 13);
        c0928n.f25353b = gx2Var;
        VarHandle.storeStoreFence();
        C0641f8 c0641f8M3482F = b70Var.m3482F((ju4) obj, c0928n);
        if (c0641f8M3482F != null) {
            gx2.f20171i.set(gx2Var, null);
        }
        return c0641f8M3482F;
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: m */
    public final boolean mo115m(Throwable th) {
        return this.f19375a.mo115m(th);
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        this.f19375a.resumeWith(obj);
    }

    @Override // p000.a70
    /* JADX INFO: renamed from: s */
    public final void mo116s(Object obj) {
        this.f19375a.mo116s(obj);
    }
}
