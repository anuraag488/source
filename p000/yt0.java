package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yt0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f35512t = 1;

    /* JADX INFO: renamed from: u */
    public byte f35513u;

    /* JADX INFO: renamed from: v */
    public Object f35514v;

    /* JADX INFO: renamed from: w */
    public Object f35515w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f35516x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(co4 co4Var, xw2 xw2Var, C1020p3 c1020p3, wm0 wm0Var) {
        super(1, wm0Var);
        this.f35514v = co4Var;
        this.f35515w = xw2Var;
        this.f35516x = c1020p3;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f35512t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f35516x;
        wm0 wm0Var = (wm0) obj;
        switch (b) {
            case 0:
                return new yt0((ru0) this.f35515w, (ks2) obj2, wm0Var).invokeSuspend(ju4Var);
            case 1:
                return new yt0((bf1) obj2, wm0Var).invokeSuspend(ju4Var);
            default:
                return new yt0((co4) this.f35514v, (xw2) this.f35515w, (C1020p3) obj2, wm0Var).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0159  */
    /* JADX WARN: Code duplicated, block: B:101:0x015e  */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (p000.se0.m10723g0(1500, r14, r13) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (r14 == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r14 == r6) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
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
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        gh3 gh3Var;
        ks2 ks2Var;
        cf0 cf0Var;
        Throwable th;
        cf0 cf0Var2;
        Throwable thM4638b;
        boolean zM4989U;
        byte b = this.f35512t;
        ?? r1 = "call to 'resume' before 'invoke' with coroutine";
        Object obj2 = this.f35516x;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ru0 ru0Var = (ru0) this.f35515w;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f35513u;
                wm0 wm0Var2 = null;
                try {
                    if (b2 != 0) {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cf0Var2 = (cf0) this.f35514v;
                            try {
                                k43.m7376J(obj);
                            } catch (Throwable th2) {
                                th = th2;
                                obj = k43.m7389n(th);
                            }
                            break;
                        } else {
                            k43.m7376J(obj);
                        }
                        thM4638b = dp3.m4638b(obj);
                        if (thM4638b == null) {
                            zM4989U = cf0Var2.m4989U(obj);
                        } else {
                            cf0Var2.getClass();
                            zM4989U = cf0Var2.m4989U(new ff0(thM4638b, false));
                        }
                        return Boolean.valueOf(zM4989U);
                    }
                    k43.m7376J(obj);
                    this.f35513u = (byte) 1;
                    obj = null;
                    ro0 ro0VarPlus = ks2Var.f23382d.plus(getContext());
                    C1199ty c1199ty = new C1199ty(ru0Var, ks2Var, gh3Var, wm0Var2, (byte) 3);
                    this.f35514v = cf0Var;
                    this.f35513u = (byte) 2;
                    Object objM7921b0 = lb5.m7921b0(ro0VarPlus, c1199ty, this);
                    if (objM7921b0 == ap0Var) {
                        return ap0Var;
                    }
                    obj = objM7921b0;
                    cf0Var2 = cf0Var;
                    thM4638b = dp3.m4638b(obj);
                    if (thM4638b == null) {
                        zM4989U = cf0Var2.m4989U(obj);
                    } else {
                        cf0Var2.getClass();
                        zM4989U = cf0Var2.m4989U(new ff0(thM4638b, false));
                    }
                    return Boolean.valueOf(zM4989U);
                } catch (Throwable th3) {
                    th = th3;
                    cf0Var2 = cf0Var;
                    obj = k43.m7389n(th);
                }
                gh3Var = (gh3) obj;
                ks2Var = (ks2) obj2;
                cf0Var = ks2Var.f23380b;
                break;
            case 1:
                bf1 bf1Var = (bf1) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f35513u;
                try {
                    try {
                        try {
                            try {
                                if (b3 == 0) {
                                    k43.m7376J(obj);
                                    FileInputStream fileInputStream = new FileInputStream(bf1Var.f15233a);
                                    t24 t24Var = bf1Var.f15234b;
                                    this.f35514v = fileInputStream;
                                    this.f35515w = null;
                                    this.f35513u = (byte) 1;
                                    obj = t24Var.readFrom(fileInputStream);
                                    r1 = fileInputStream;
                                } else {
                                    if (b3 != 1) {
                                        if (b3 != 2) {
                                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        FileInputStream fileInputStream2 = (FileInputStream) this.f35515w;
                                        k43.m7376J(obj);
                                        r1 = fileInputStream2;
                                        lb5.m7941v(r1, null);
                                        return obj;
                                    }
                                    FileInputStream fileInputStream3 = (FileInputStream) this.f35514v;
                                    k43.m7376J(obj);
                                    r1 = fileInputStream3;
                                }
                                lb5.m7941v(r1, null);
                                break;
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    lb5.m7941v(r1, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                lb5.m7941v(r1, th6);
                                throw th7;
                            }
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw AbstractC1356y5.m12905N(bf1Var.f15233a.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } catch (FileNotFoundException unused) {
                    File file = bf1Var.f15233a;
                    t24 t24Var2 = bf1Var.f15234b;
                    if (!file.exists()) {
                        return t24Var2.getDefaultValue();
                    }
                    FileInputStream fileInputStream4 = new FileInputStream(bf1Var.f15233a);
                    this.f35514v = null;
                    this.f35515w = fileInputStream4;
                    this.f35513u = (byte) 2;
                    obj = t24Var2.readFrom(fileInputStream4);
                    r1 = fileInputStream4;
                    break;
                }
                return obj;
            default:
                C1020p3 c1020p3 = (C1020p3) obj2;
                xw2 xw2Var = (xw2) this.f35515w;
                co4 co4Var = (co4) this.f35514v;
                ap0 ap0Var3 = ap0.f14763a;
                byte b4 = this.f35513u;
                try {
                    if (b4 == 0) {
                        k43.m7376J(obj);
                        if (xw2Var != xw2.f34666b) {
                            C0982og c0982og = new C0982og((Object) c1020p3, wm0Var, (byte) 29);
                            this.f35513u = (byte) 2;
                        } else {
                            this.f35513u = (byte) 1;
                            if (c1020p3.invoke(this) == ap0Var3) {
                                return ap0Var3;
                            }
                        }
                        break;
                    } else {
                        if (b4 != 1 && b4 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    if (xw2Var != xw2.f34667c) {
                        co4Var.m4053a();
                    }
                    return ju4.f22634a;
                } catch (Throwable th8) {
                    if (xw2Var == xw2.f34667c) {
                        throw th8;
                    }
                    co4Var.m4053a();
                    throw th8;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(bf1 bf1Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f35516x = bf1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt0(ru0 ru0Var, ks2 ks2Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f35515w = ru0Var;
        this.f35516x = ks2Var;
    }
}
