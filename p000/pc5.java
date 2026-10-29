package p000;

import ads_mobile_sdk.l24;
import ads_mobile_sdk.m24;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc5 implements uq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ m24 f27526a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f27527b;

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
    @Override // p000.uq1
    public final Object apply(Object obj) {
        m24 m24Var = this.f27526a;
        int i = this.f27527b;
        if (m24Var.f7090f && i < m24Var.f7091g) {
            ti5 ti5Var = m24Var.f7089e;
            RunnableC1222uk runnableC1222uk = new RunnableC1222uk((byte) 1);
            runnableC1222uk.f31944c = m24Var;
            runnableC1222uk.f31943b = i;
            VarHandle.storeStoreFence();
            ti5Var.mo306a(runnableC1222uk, m24Var.f7092h * ((long) Math.pow(2.0d, i)));
        }
        return l24.f6675f;
    }
}
