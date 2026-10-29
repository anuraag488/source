package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 implements si1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35235a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ si1 f35236b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ nq1 f35237c;

    public /* synthetic */ yi1(byte b) {
        this.f35235a = b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        if (r12 == r4) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [yi1] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [ym0] */
    /* JADX WARN: Type inference failed for: r11v6, types: [ym0] */
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
    @Override // p000.si1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        xi1 xi1Var;
        bj1 bj1Var;
        byte b = this.f35235a;
        ju4 ju4Var = ju4.f22634a;
        int i = 0;
        switch (b) {
            case 0:
                nq1 nq1Var = this.f35237c;
                if (wm0Var instanceof xi1) {
                    xi1Var = (xi1) wm0Var;
                    int i2 = xi1Var.f34301u;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xi1Var.f34301u = i2 - Integer.MIN_VALUE;
                    } else {
                        xi1Var = new xi1(this, wm0Var);
                    }
                } else {
                    xi1Var = new xi1(this, wm0Var);
                }
                Object obj = xi1Var.f34300t;
                ap0 ap0Var = ap0.f14763a;
                int i3 = xi1Var.f34301u;
                try {
                    try {
                        if (i3 == 0) {
                            k43.m7376J(obj);
                            si1 si1Var = this.f35236b;
                            xi1Var.f34303w = ti1Var;
                            xi1Var.f34305y = 0;
                            xi1Var.f34301u = 1;
                            if (si1Var.collect(ti1Var, xi1Var) != ap0Var) {
                            }
                            return ap0Var;
                        }
                        if (i3 == 1) {
                            i = xi1Var.f34305y;
                            ti1Var = xi1Var.f34303w;
                            k43.m7376J(obj);
                        } else {
                            if (i3 == 2) {
                                Throwable th = (Throwable) xi1Var.f34304x;
                                k43.m7376J(obj);
                                throw th;
                            }
                            if (i3 != 3) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rt3 rt3Var = (rt3) xi1Var.f34304x;
                            k43.m7376J(obj);
                            this = rt3Var;
                        }
                        this.releaseIntercepted();
                        return ju4Var;
                        rt3 rt3Var2 = new rt3(ti1Var, xi1Var.getContext());
                        xi1Var.f34303w = null;
                        xi1Var.f34304x = rt3Var2;
                        xi1Var.f34305y = i;
                        xi1Var.f34301u = 3;
                        Object objInvoke = nq1Var.invoke(rt3Var2, null, xi1Var);
                        this = rt3Var2;
                    } catch (Throwable th2) {
                        om4 om4Var = new om4();
                        om4Var.f26891a = th2;
                        VarHandle.storeStoreFence();
                        xi1Var.f34303w = null;
                        xi1Var.f34304x = th2;
                        xi1Var.f34305y = i;
                        xi1Var.f34301u = 2;
                        if (i25.m6627w(om4Var, nq1Var, th2, xi1Var) != ap0Var) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    this.releaseIntercepted();
                    throw th3;
                }
                break;
            default:
                if (wm0Var instanceof bj1) {
                    bj1Var = (bj1) wm0Var;
                    int i4 = bj1Var.f15326u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bj1Var.f15326u = i4 - Integer.MIN_VALUE;
                    } else {
                        bj1Var = new bj1(this, wm0Var);
                    }
                } else {
                    bj1Var = new bj1(this, wm0Var);
                }
                Object objM73k = bj1Var.f15325t;
                Object obj2 = ap0.f14763a;
                int i5 = bj1Var.f15326u;
                if (i5 == 0) {
                    k43.m7376J(objM73k);
                    si1 si1Var2 = this.f35236b;
                    bj1Var.f15328w = ti1Var;
                    bj1Var.f15329x = 0;
                    bj1Var.f15326u = 1;
                    objM73k = C0006a5.m73k(si1Var2, ti1Var, bj1Var);
                    if (objM73k != obj2) {
                    }
                    return obj2;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        k43.m7376J(objM73k);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = bj1Var.f15329x;
                ti1Var = bj1Var.f15328w;
                k43.m7376J(objM73k);
                Throwable th4 = (Throwable) objM73k;
                if (th4 == null) {
                    return ju4Var;
                }
                nq1 nq1Var2 = this.f35237c;
                bj1Var.f15328w = null;
                bj1Var.f15329x = i;
                bj1Var.f15326u = 2;
                if (nq1Var2.invoke(ti1Var, th4, bj1Var) != obj2) {
                    return ju4Var;
                }
                return obj2;
        }
    }
}
