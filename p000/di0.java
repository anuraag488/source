package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class di0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ pg0 f17073a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ b70 f17074b;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Number) obj2).intValue();
        b70 b70Var = this.f17074b;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            pg0 pg0Var = this.f17073a;
            boolean zM6894i = ir1Var.m6894i(b70Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                ci0 ci0Var = new ci0((byte) 0);
                ci0Var.f16041b = b70Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ci0Var);
                obj3 = ci0Var;
            }
            obj3 = objM6869O;
            pg0Var.invoke((yp1) obj3, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
