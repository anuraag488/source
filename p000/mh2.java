package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24913a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ hi2 f24914b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f24915c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f24916d;

    public /* synthetic */ mh2(byte b) {
        this.f24913a = b;
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
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24913a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                hi2 hi2Var = this.f24914b;
                int i = this.f24915c;
                Object obj3 = this.f24916d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    hi2Var.m6407a(i, obj3, ir1Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.f24914b.m6407a(this.f24915c, this.f24916d, (mi0) obj, vd6.m11838V(1));
                break;
        }
        return ju4Var;
    }
}
