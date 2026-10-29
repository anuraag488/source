package p000;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wm3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public byte f33490A;

    /* JADX INFO: renamed from: B */
    public /* synthetic */ Object f33491B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ wp1 f33492C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ wp1 f33493D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ xn2 f33494E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ i92 f33495F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f33496G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f33497H;

    /* JADX INFO: renamed from: t */
    public wg1 f33498t;

    /* JADX INFO: renamed from: u */
    public xn2 f33499u;

    /* JADX INFO: renamed from: v */
    public i92 f33500v;

    /* JADX INFO: renamed from: w */
    public String f33501w;

    /* JADX INFO: renamed from: x */
    public jc2 f33502x;

    /* JADX INFO: renamed from: y */
    public lg3 f33503y;

    /* JADX INFO: renamed from: z */
    public boolean f33504z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm3(wp1 wp1Var, wp1 wp1Var2, xn2 xn2Var, i92 i92Var, String str, boolean z, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33492C = wp1Var;
        this.f33493D = wp1Var2;
        this.f33494E = xn2Var;
        this.f33495F = i92Var;
        this.f33496G = str;
        this.f33497H = z;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        wm3 wm3Var = new wm3(this.f33492C, this.f33493D, this.f33494E, this.f33495F, this.f33496G, this.f33497H, wm0Var);
        wm3Var.f33491B = obj;
        return wm3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((wm3) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0123 A[Catch: all -> 0x00b1, Exception -> 0x014e, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0135 A[Catch: all -> 0x00b1, Exception -> 0x014e, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0156 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0168 A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x018a A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x019c  */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1 A[Catch: all -> 0x00b1, TryCatch #1 {all -> 0x00b1, blocks: (B:42:0x011f, B:44:0x0123, B:46:0x0135, B:56:0x017c, B:59:0x018a, B:72:0x01b2, B:76:0x01d8, B:78:0x01dc, B:80:0x01fe, B:79:0x01e1, B:53:0x0156, B:55:0x0168, B:38:0x00fa, B:23:0x008c, B:25:0x0098, B:29:0x00b6, B:32:0x00c1, B:34:0x00ce, B:33:0x00ca), top: B:97:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x020e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0215  */
    /* JADX WARN: Code duplicated, block: B:89:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x0235  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0135, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0168, please report this as an issue */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        wp1 wp1Var;
        Object objM10807c;
        boolean z;
        Throwable th;
        String strM12721a;
        k44 k44Var;
        xn2 xn2Var;
        boolean z2;
        i92 i92Var;
        wg1 wg1Var;
        jc2 jc2Var;
        String str;
        jc2 jc2Var2;
        String str2;
        wg1 wg1Var2;
        Object objM13388p;
        String strM12721a2;
        k44 k44Var2;
        String str3;
        byte b;
        aa2 aa2VarM3929b;
        String strM12721a3;
        k44 k44Var3;
        String str4;
        String str5;
        Boolean bool;
        String strM12721a4;
        k44 k44Var4;
        lg3 lg3Var = (lg3) this.f33491B;
        ap0 ap0Var = ap0.f14763a;
        byte b2 = this.f33490A;
        String str6 = this.f33496G;
        xn2 xn2Var2 = this.f33494E;
        wp1 wp1Var2 = this.f33493D;
        try {
            try {
                if (b2 == 0) {
                    k43.m7376J(obj);
                    wg1 wg1VarM11935a = ((vm3) hg1.m6386c().m6389b(vm3.class)).m11935a();
                    wp1 wp1Var3 = this.f33492C;
                    i92 i92Var2 = this.f33495F;
                    jc2 jc2Var3 = (jc2) wp1Var3.invoke();
                    Object objInvoke = wp1Var2.invoke();
                    if (xn2Var2 != null) {
                        String strM12721a5 = xn2Var2.m12721a();
                        k44 k44Var5 = k44.f22883b;
                        wp1Var = wp1Var2;
                        try {
                            if (xn2Var2.f34459a.m8274a().compareTo(k44Var5) <= 0) {
                                xn2Var2.m12722b(k44Var5, strM12721a5, "load " + str6 + " default: " + objInvoke, null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sc6.m10643O(th);
                            objM10807c = sj3.m10807c(th);
                        }
                    } else {
                        wp1Var = wp1Var2;
                    }
                    aa2 aa2VarM6699b = i92Var2.m6699b(jc2Var3, objInvoke);
                    boolean z3 = this.f33497H;
                    nr6 nr6VarM12305d = wg1VarM11935a.m12305d(Collections.singletonMap(str6, z3 ? ca2.m3930c(aa2VarM6699b).mo5629a() : String.valueOf(aa2VarM6699b)));
                    this.f33491B = null;
                    this.f33498t = wg1VarM11935a;
                    this.f33499u = xn2Var2;
                    this.f33500v = i92Var2;
                    this.f33501w = str6;
                    this.f33502x = jc2Var3;
                    this.f33503y = lg3Var;
                    this.f33504z = z3;
                    this.f33490A = (byte) 1;
                    if (z62.m13388p(nr6VarM12305d, this) != ap0Var) {
                        xn2Var = xn2Var2;
                        z2 = z3;
                        i92Var = i92Var2;
                        wg1Var = wg1VarM11935a;
                        jc2Var = jc2Var3;
                        str = str6;
                    }
                    return ap0Var;
                }
                if (b2 != 1) {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = this.f33504z;
                    lg3Var = this.f33503y;
                    jc2Var2 = this.f33502x;
                    str2 = this.f33501w;
                    i92Var = this.f33500v;
                    xn2Var = this.f33499u;
                    wg1Var2 = this.f33498t;
                    try {
                        k43.m7376J(obj);
                        objM13388p = obj;
                        wp1Var = wp1Var2;
                        try {
                            bool = (Boolean) objM13388p;
                            if (xn2Var != null) {
                                strM12721a4 = xn2Var.m12721a();
                                k44Var4 = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                                    xn2Var.m12722b(k44Var4, strM12721a4, "fetched " + str2 + " activated: " + bool, null);
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            if (xn2Var != null) {
                                strM12721a2 = xn2Var.m12721a();
                                k44Var2 = k44.f22884c;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                    xn2Var.m12722b(k44Var2, strM12721a2, "fetch " + str2 + " failed", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        wp1Var = wp1Var2;
                        if (xn2Var != null) {
                            strM12721a2 = xn2Var.m12721a();
                            k44Var2 = k44.f22884c;
                            if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                xn2Var.m12722b(k44Var2, strM12721a2, "fetch " + str2 + " failed", e);
                            }
                        }
                        ch1 ch1VarM12303b = wg1Var2.m12303b(str2);
                        str3 = (String) ch1VarM12303b.f16016b;
                        b = ch1VarM12303b.f16015a;
                        if (xn2Var != null) {
                            strM12721a3 = xn2Var.m12721a();
                            k44Var3 = k44.f22883b;
                            if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                if (b != 1) {
                                    str4 = "default";
                                } else if (b != 2) {
                                    str4 = "static";
                                } else {
                                    str4 = "remote";
                                }
                                if (b == 0) {
                                    str5 = "";
                                } else {
                                    str5 = str3;
                                }
                                xn2Var.m12722b(k44Var3, strM12721a3, "value " + str2 + ": " + str5 + " source: " + str4, null);
                            }
                        }
                        if (b == 0) {
                            str3 = "";
                        }
                        jc2 jc2Var4 = jc2Var2;
                        if (z2) {
                            aa2VarM3929b = ca2.m3929b(str3);
                        } else {
                            i92Var.getClass();
                            ea2 ea2Var = ea2.f17925a;
                            dd4 dd4VarM13883r = zy5.m13883r(i92Var, str3);
                            Object objMo6942b = new wc4(i92Var, bk2.OBJ, dd4VarM13883r, ea2Var.mo15d()).mo6942b(ea2Var);
                            dd4VarM13883r.m7805p();
                            aa2VarM3929b = (aa2) objMo6942b;
                        }
                        objM10807c = i92Var.m6698a(jc2Var4, aa2VarM3929b);
                        z = objM10807c instanceof yc1;
                        if (z) {
                            th = ((yc1) objM10807c).f35112a;
                            if (xn2Var2 != null) {
                                strM12721a = xn2Var2.m12721a();
                                k44Var = k44.f22884c;
                                if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                    xn2Var2.m12722b(k44Var, strM12721a, zi4.m13621u("failed to load ", str6, ", using default"), th);
                                }
                            }
                        }
                        if (z) {
                            objM10807c = wp1Var.invoke();
                        }
                        lg3Var.setValue(objM10807c);
                        return ju4.f22634a;
                    }
                    ch1 ch1VarM12303b2 = wg1Var2.m12303b(str2);
                    str3 = (String) ch1VarM12303b2.f16016b;
                    b = ch1VarM12303b2.f16015a;
                    if (xn2Var != null) {
                        strM12721a3 = xn2Var.m12721a();
                        k44Var3 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                            if (b != 1) {
                                str4 = "default";
                            } else if (b != 2) {
                                str4 = "static";
                            } else {
                                str4 = "remote";
                            }
                            if (b == 0) {
                                str5 = "";
                            } else {
                                str5 = str3;
                            }
                            xn2Var.m12722b(k44Var3, strM12721a3, "value " + str2 + ": " + str5 + " source: " + str4, null);
                        }
                    }
                    if (b == 0) {
                        str3 = "";
                    }
                    jc2 jc2Var5 = jc2Var2;
                    if (z2) {
                        aa2VarM3929b = ca2.m3929b(str3);
                    } else {
                        i92Var.getClass();
                        ea2 ea2Var2 = ea2.f17925a;
                        dd4 dd4VarM13883r2 = zy5.m13883r(i92Var, str3);
                        Object objMo6942b2 = new wc4(i92Var, bk2.OBJ, dd4VarM13883r2, ea2Var2.mo15d()).mo6942b(ea2Var2);
                        dd4VarM13883r2.m7805p();
                        aa2VarM3929b = (aa2) objMo6942b2;
                    }
                    objM10807c = i92Var.m6698a(jc2Var5, aa2VarM3929b);
                    z = objM10807c instanceof yc1;
                    if (z) {
                        th = ((yc1) objM10807c).f35112a;
                        if (xn2Var2 != null) {
                            strM12721a = xn2Var2.m12721a();
                            k44Var = k44.f22884c;
                            if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                xn2Var2.m12722b(k44Var, strM12721a, zi4.m13621u("failed to load ", str6, ", using default"), th);
                            }
                        }
                    }
                    if (z) {
                        objM10807c = wp1Var.invoke();
                    }
                    lg3Var.setValue(objM10807c);
                    return ju4.f22634a;
                }
                z2 = this.f33504z;
                lg3Var = this.f33503y;
                jc2Var = this.f33502x;
                str = this.f33501w;
                i92Var = this.f33500v;
                xn2Var = this.f33499u;
                wg1Var = this.f33498t;
                k43.m7376J(obj);
                wp1Var = wp1Var2;
                nr6 nr6VarM12302a = wg1Var.m12302a();
                this.f33491B = null;
                this.f33498t = wg1Var;
                this.f33499u = xn2Var;
                this.f33500v = i92Var;
                this.f33501w = str;
                this.f33502x = jc2Var;
                this.f33503y = lg3Var;
                this.f33504z = z2;
                this.f33490A = (byte) 2;
                objM13388p = z62.m13388p(nr6VarM12302a, this);
                if (objM13388p != ap0Var) {
                    jc2Var2 = jc2Var;
                    str2 = str;
                    wg1Var2 = wg1Var;
                    bool = (Boolean) objM13388p;
                    if (xn2Var != null) {
                        strM12721a4 = xn2Var.m12721a();
                        k44Var4 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                            xn2Var.m12722b(k44Var4, strM12721a4, "fetched " + str2 + " activated: " + bool, null);
                        }
                    }
                    ch1 ch1VarM12303b3 = wg1Var2.m12303b(str2);
                    str3 = (String) ch1VarM12303b3.f16016b;
                    b = ch1VarM12303b3.f16015a;
                    if (xn2Var != null) {
                        strM12721a3 = xn2Var.m12721a();
                        k44Var3 = k44.f22883b;
                        if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                            if (b != 1) {
                                str4 = "default";
                            } else if (b != 2) {
                                str4 = "static";
                            } else {
                                str4 = "remote";
                            }
                            if (b == 0) {
                                str5 = "";
                            } else {
                                str5 = str3;
                            }
                            xn2Var.m12722b(k44Var3, strM12721a3, "value " + str2 + ": " + str5 + " source: " + str4, null);
                        }
                    }
                    if (b == 0) {
                        str3 = "";
                    }
                    jc2 jc2Var6 = jc2Var2;
                    if (z2) {
                        aa2VarM3929b = ca2.m3929b(str3);
                    } else {
                        i92Var.getClass();
                        ea2 ea2Var3 = ea2.f17925a;
                        dd4 dd4VarM13883r3 = zy5.m13883r(i92Var, str3);
                        Object objMo6942b3 = new wc4(i92Var, bk2.OBJ, dd4VarM13883r3, ea2Var3.mo15d()).mo6942b(ea2Var3);
                        dd4VarM13883r3.m7805p();
                        aa2VarM3929b = (aa2) objMo6942b3;
                    }
                    objM10807c = i92Var.m6698a(jc2Var6, aa2VarM3929b);
                    z = objM10807c instanceof yc1;
                    if (z) {
                        th = ((yc1) objM10807c).f35112a;
                        if (xn2Var2 != null) {
                            strM12721a = xn2Var2.m12721a();
                            k44Var = k44.f22884c;
                            if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                xn2Var2.m12722b(k44Var, strM12721a, zi4.m13621u("failed to load ", str6, ", using default"), th);
                            }
                        }
                    }
                    if (z) {
                        objM10807c = wp1Var.invoke();
                    }
                    lg3Var.setValue(objM10807c);
                    return ju4.f22634a;
                }
                return ap0Var;
            } catch (Exception e3) {
                e = e3;
                jc2Var2 = jc2Var;
                str2 = str;
                wg1Var2 = wg1Var;
                if (xn2Var != null) {
                    strM12721a2 = xn2Var.m12721a();
                    k44Var2 = k44.f22884c;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                        xn2Var.m12722b(k44Var2, strM12721a2, "fetch " + str2 + " failed", e);
                    }
                }
                ch1 ch1VarM12303b4 = wg1Var2.m12303b(str2);
                str3 = (String) ch1VarM12303b4.f16016b;
                b = ch1VarM12303b4.f16015a;
                if (xn2Var != null) {
                    strM12721a3 = xn2Var.m12721a();
                    k44Var3 = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                        if (b != 1) {
                            str4 = "default";
                        } else if (b != 2) {
                            str4 = "static";
                        } else {
                            str4 = "remote";
                        }
                        if (b == 0) {
                            str5 = "";
                        } else {
                            str5 = str3;
                        }
                        xn2Var.m12722b(k44Var3, strM12721a3, "value " + str2 + ": " + str5 + " source: " + str4, null);
                    }
                }
                if (b == 0) {
                    str3 = "";
                }
                jc2 jc2Var7 = jc2Var2;
                if (z2) {
                    aa2VarM3929b = ca2.m3929b(str3);
                } else {
                    i92Var.getClass();
                    ea2 ea2Var4 = ea2.f17925a;
                    dd4 dd4VarM13883r4 = zy5.m13883r(i92Var, str3);
                    Object objMo6942b4 = new wc4(i92Var, bk2.OBJ, dd4VarM13883r4, ea2Var4.mo15d()).mo6942b(ea2Var4);
                    dd4VarM13883r4.m7805p();
                    aa2VarM3929b = (aa2) objMo6942b4;
                }
                objM10807c = i92Var.m6698a(jc2Var7, aa2VarM3929b);
                z = objM10807c instanceof yc1;
                if (z) {
                    th = ((yc1) objM10807c).f35112a;
                    if (xn2Var2 != null) {
                        strM12721a = xn2Var2.m12721a();
                        k44Var = k44.f22884c;
                        if (xn2Var2.f34459a.m8274a().compareTo(k44Var) <= 0) {
                            xn2Var2.m12722b(k44Var, strM12721a, zi4.m13621u("failed to load ", str6, ", using default"), th);
                        }
                    }
                }
                if (z) {
                    objM10807c = wp1Var.invoke();
                }
                lg3Var.setValue(objM10807c);
                return ju4.f22634a;
            }
        } catch (Throwable th3) {
            th = th3;
            wp1Var = wp1Var2;
        }
    }
}
