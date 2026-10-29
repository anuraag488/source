package com.materialkolor;

import com.materialkolor.ktx.DynamicColorKt;
import com.materialkolor.ktx.DynamicSchemeKt;
import java.lang.invoke.VarHandle;
import p000.C0499bp;
import p000.C0633f0;
import p000.ad0;
import p000.an0;
import p000.cd0;
import p000.d55;
import p000.dc0;
import p000.dd0;
import p000.ir1;
import p000.jq2;
import p000.ki0;
import p000.m73;
import p000.mi0;
import p000.mq4;
import p000.o41;
import p000.pb0;
import p000.pc0;
import p000.r50;
import p000.rc0;
import p000.sc0;
import p000.tc0;
import p000.uc0;
import p000.vc0;
import p000.wc0;
import p000.x41;
import p000.xc0;
import p000.y41;
import p000.yp1;
import p000.zc0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class DynamicColorSchemeKt {
    /* JADX INFO: renamed from: dynamicColorScheme-N98v4SY, reason: not valid java name */
    public static final dc0 m13901dynamicColorSchemeN98v4SY(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, pb0 pb0Var6, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var) {
        return toColorScheme(DynamicSchemeKt.m13938DynamicSchemedtSySfE(j, z, pb0Var, pb0Var2, pb0Var3, pb0Var4, pb0Var5, pb0Var6, m73Var, d, pc0Var, x41Var), z2, yp1Var);
    }

    /* JADX INFO: renamed from: dynamicColorScheme-N98v4SY$default, reason: not valid java name */
    public static dc0 m13902dynamicColorSchemeN98v4SY$default(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, pb0 pb0Var6, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var, int i, Object obj) {
        double d2;
        pc0 pc0Var2;
        x41 x41Var2;
        boolean z3 = (i & 4) != 0 ? false : z2;
        pb0 pb0Var7 = (i & 8) != 0 ? null : pb0Var;
        pb0 pb0Var8 = (i & 16) != 0 ? null : pb0Var2;
        pb0 pb0Var9 = (i & 32) != 0 ? null : pb0Var3;
        pb0 pb0Var10 = (i & 64) != 0 ? null : pb0Var4;
        pb0 pb0Var11 = (i & 128) != 0 ? null : pb0Var5;
        pb0 pb0Var12 = (i & 256) != 0 ? null : pb0Var6;
        m73 m73Var2 = (i & 512) != 0 ? m73.f24710a : m73Var;
        if ((i & 1024) != 0) {
            an0[] an0VarArr = an0.f14634a;
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i & 2048) != 0) {
            pc0.f27516a.getClass();
            pc0Var2 = pc0.f27517b;
        } else {
            pc0Var2 = pc0Var;
        }
        if ((i & 4096) != 0) {
            x41.f33972a.getClass();
            x41Var2 = x41.f33973b;
        } else {
            x41Var2 = x41Var;
        }
        return m13901dynamicColorSchemeN98v4SY(j, z, z3, pb0Var7, pb0Var8, pb0Var9, pb0Var10, pb0Var11, pb0Var12, m73Var2, d2, pc0Var2, x41Var2, (i & 8192) != 0 ? null : yp1Var);
    }

    /* JADX INFO: renamed from: dynamicColorScheme-onzyBm0, reason: not valid java name */
    public static final dc0 m13903dynamicColorSchemeonzyBm0(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var) {
        return m13901dynamicColorSchemeN98v4SY(j, z, z2, pb0.m9462a(j), pb0Var, pb0Var2, pb0Var3, pb0Var4, pb0Var5, m73Var, d, pc0Var, x41Var, yp1Var);
    }

    /* JADX INFO: renamed from: dynamicColorScheme-onzyBm0$default, reason: not valid java name */
    public static dc0 m13904dynamicColorSchemeonzyBm0$default(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var, int i, Object obj) {
        double d2;
        pc0 pc0Var2;
        x41 x41Var2;
        boolean z3 = (i & 4) != 0 ? false : z2;
        pb0 pb0Var6 = (i & 8) != 0 ? null : pb0Var;
        pb0 pb0Var7 = (i & 16) != 0 ? null : pb0Var2;
        pb0 pb0Var8 = (i & 32) != 0 ? null : pb0Var3;
        pb0 pb0Var9 = (i & 64) != 0 ? null : pb0Var4;
        pb0 pb0Var10 = (i & 128) != 0 ? null : pb0Var5;
        m73 m73Var2 = (i & 256) != 0 ? m73.f24710a : m73Var;
        if ((i & 512) != 0) {
            an0[] an0VarArr = an0.f14634a;
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i & 1024) != 0) {
            pc0.f27516a.getClass();
            pc0Var2 = pc0.f27517b;
        } else {
            pc0Var2 = pc0Var;
        }
        if ((i & 2048) != 0) {
            x41.f33972a.getClass();
            x41Var2 = x41.f33973b;
        } else {
            x41Var2 = x41Var;
        }
        return m13903dynamicColorSchemeonzyBm0(j, z, z3, pb0Var6, pb0Var7, pb0Var8, pb0Var9, pb0Var10, m73Var2, d2, pc0Var2, x41Var2, (i & 4096) != 0 ? null : yp1Var);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188  */
    /* JADX WARN: Code duplicated, block: B:122:0x0196  */
    /* JADX WARN: Code duplicated, block: B:124:0x019c  */
    /* JADX WARN: Code duplicated, block: B:125:0x019f  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:152:0x0201  */
    /* JADX WARN: Code duplicated, block: B:154:0x020f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0213  */
    /* JADX WARN: Code duplicated, block: B:157:0x0216  */
    /* JADX WARN: Code duplicated, block: B:160:0x0222  */
    /* JADX WARN: Code duplicated, block: B:162:0x0226  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f A[PHI: r21
  0x008f: PHI (r21v9 pb0) = (r21v2 pb0), (r21v10 pb0) binds: [B:53:0x008d, B:49:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5 A[PHI: r5 r24
  0x00b5: PHI (r5v7 boolean) = (r5v5 boolean), (r5v8 boolean) binds: [B:64:0x00b3, B:61:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r24v5 boolean) = (r24v1 boolean), (r24v6 boolean) binds: [B:64:0x00b3, B:61:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd A[PHI: r21
  0x00fd: PHI (r21v7 pb0) = (r21v4 pb0), (r21v8 pb0) binds: [B:83:0x00fb, B:80:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    /* JADX INFO: renamed from: rememberDynamicColorScheme-CdFb-wI, reason: not valid java name */
    public static final dc0 m13905rememberDynamicColorSchemeCdFbwI(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var, mi0 mi0Var, int i, int i2, int i3) {
        double d2;
        pc0 pc0Var2;
        x41 x41Var2;
        pb0 pb0Var6;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        pb0 pb0Var7;
        pb0 pb0Var8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ir1 ir1Var;
        Object objM6869O;
        boolean z13 = (i3 & 4) != 0 ? false : z2;
        pb0 pb0Var9 = (i3 & 8) != 0 ? null : pb0Var;
        pb0 pb0Var10 = (i3 & 16) != 0 ? null : pb0Var2;
        pb0 pb0Var11 = (i3 & 32) != 0 ? null : pb0Var3;
        pb0 pb0Var12 = (i3 & 64) != 0 ? null : pb0Var4;
        pb0 pb0Var13 = (i3 & 128) != 0 ? null : pb0Var5;
        m73 m73Var2 = (i3 & 256) != 0 ? m73.f24710a : m73Var;
        if ((i3 & 512) != 0) {
            an0[] an0VarArr = an0.f14634a;
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i3 & 1024) != 0) {
            pc0.f27516a.getClass();
            pc0Var2 = pc0.f27517b;
        } else {
            pc0Var2 = pc0Var;
        }
        if ((i3 & 2048) != 0) {
            x41.f33972a.getClass();
            x41Var2 = x41.f33973b;
        } else {
            x41Var2 = x41Var;
        }
        yp1 yp1Var2 = (i3 & 4096) == 0 ? yp1Var : null;
        if (((i & 14) ^ 6) > 4) {
            pb0Var6 = pb0Var9;
            if (((ir1) mi0Var).m6888f(j)) {
                z3 = true;
            }
            if (((i & 112) ^ 48) > 32) {
                z4 = z;
                if (!((ir1) mi0Var).m6892h(z4)) {
                    z5 = z3;
                }
                z6 = true;
                boolean z14 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
                z7 = z13;
                if (((i & 7168) ^ 3072) > 2048) {
                    pb0Var7 = pb0Var6;
                    if (!((ir1) mi0Var).m6890g(pb0Var7)) {
                        pb0Var8 = pb0Var7;
                    }
                    z8 = true;
                    boolean z15 = z8 | z14 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
                    if (((234881024 & i) ^ 100663296) > 67108864) {
                        if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                            z9 = true;
                        } else if ((i & 100663296) == 67108864) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ((i & 100663296) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z16 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z15 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
                    if (((i2 & 14) ^ 6) > 4) {
                        if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                            z10 = true;
                        } else if ((i2 & 6) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ((i2 & 6) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z17 = z16 | z10;
                    if (((i2 & 112) ^ 48) > 32) {
                        if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                            z11 = true;
                        } else if ((i2 & 48) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if ((i2 & 48) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z17 | z11;
                    ir1Var = (ir1) mi0Var;
                    objM6869O = ir1Var.m6869O();
                    if (z12 || objM6869O == ki0.f23136a) {
                        objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                        ir1Var.m6905n0(objM6869O);
                    }
                    return (dc0) objM6869O;
                }
                pb0Var7 = pb0Var6;
                pb0Var8 = pb0Var7;
                if ((i & 3072) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z18 = z8 | z14 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
                if (((234881024 & i) ^ 100663296) > 67108864) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 100663296) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z19 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z18 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
                if (((i2 & 14) ^ 6) > 4) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 6) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z19 | z10;
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 48) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z110 | z11;
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            z4 = z;
            z5 = z3;
            if ((i & 48) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z111 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
            z7 = z13;
            if (((i & 7168) ^ 3072) > 2048) {
                pb0Var7 = pb0Var6;
                if (!((ir1) mi0Var).m6890g(pb0Var7)) {
                    pb0Var8 = pb0Var7;
                }
                z8 = true;
                boolean z112 = z8 | z111 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
                if (((234881024 & i) ^ 100663296) > 67108864) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 100663296) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z113 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z112 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
                if (((i2 & 14) ^ 6) > 4) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 6) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z114 = z113 | z10;
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 48) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z114 | z11;
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            pb0Var7 = pb0Var6;
            pb0Var8 = pb0Var7;
            if ((i & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z115 = z8 | z111 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
            if (((234881024 & i) ^ 100663296) > 67108864) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 100663296) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z116 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z115 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
            if (((i2 & 14) ^ 6) > 4) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z117 = z116 | z10;
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                    z11 = true;
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z117 | z11;
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        pb0Var6 = pb0Var9;
        if ((i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((i & 112) ^ 48) > 32) {
            z4 = z;
            if (!((ir1) mi0Var).m6892h(z4)) {
                z5 = z3;
            }
            z6 = true;
            boolean z118 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
            z7 = z13;
            if (((i & 7168) ^ 3072) > 2048) {
                pb0Var7 = pb0Var6;
                if (!((ir1) mi0Var).m6890g(pb0Var7)) {
                    pb0Var8 = pb0Var7;
                }
                z8 = true;
                boolean z119 = z8 | z118 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
                if (((234881024 & i) ^ 100663296) > 67108864) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 100663296) == 67108864) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z1110 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z119 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
                if (((i2 & 14) ^ 6) > 4) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 6) == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z1111 = z1110 | z10;
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 48) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z1111 | z11;
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            pb0Var7 = pb0Var6;
            pb0Var8 = pb0Var7;
            if ((i & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z1112 = z8 | z118 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
            if (((234881024 & i) ^ 100663296) > 67108864) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 100663296) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z1113 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z1112 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
            if (((i2 & 14) ^ 6) > 4) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z1114 = z1113 | z10;
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                    z11 = true;
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z1114 | z11;
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        z4 = z;
        z5 = z3;
        if ((i & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z1115 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
        z7 = z13;
        if (((i & 7168) ^ 3072) > 2048) {
            pb0Var7 = pb0Var6;
            if (!((ir1) mi0Var).m6890g(pb0Var7)) {
                pb0Var8 = pb0Var7;
            }
            z8 = true;
            boolean z1116 = z8 | z1115 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
            if (((234881024 & i) ^ 100663296) > 67108864) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 100663296) == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 100663296) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z1117 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z1116 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
            if (((i2 & 14) ^ 6) > 4) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z1118 = z1117 | z10;
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                    z11 = true;
                } else if ((i2 & 48) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z1118 | z11;
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        pb0Var7 = pb0Var6;
        pb0Var8 = pb0Var7;
        if ((i & 3072) == 2048) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z1119 = z8 | z1115 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var10)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 12582912) == 8388608);
        if (((234881024 & i) ^ 100663296) > 67108864) {
            if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                z9 = true;
            } else if ((i & 100663296) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
        } else if ((i & 100663296) == 67108864) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11110 = ((((1879048192 & i) ^ 805306368) <= 536870912 && ((ir1) mi0Var).m6882c(d2)) || (i & 805306368) == 536870912) | z1119 | z9 | ((((i2 & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 384) == 256);
        if (((i2 & 14) ^ 6) > 4) {
            if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                z10 = true;
            } else if ((i2 & 6) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if ((i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11111 = z11110 | z10;
        if (((i2 & 112) ^ 48) > 32) {
            if (!((ir1) mi0Var).m6886e(x41Var2.ordinal())) {
                z11 = true;
            } else if ((i2 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else if ((i2 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        z12 = z11111 | z11;
        ir1Var = (ir1) mi0Var;
        objM6869O = ir1Var.m6869O();
        if (z12) {
            objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
            ir1Var.m6905n0(objM6869O);
        } else {
            objM6869O = m13903dynamicColorSchemeonzyBm0(j, z4, z7, pb0Var8, pb0Var10, pb0Var11, pb0Var12, pb0Var13, m73Var2, d2, pc0Var2, x41Var2, yp1Var2);
            ir1Var.m6905n0(objM6869O);
        }
        return (dc0) objM6869O;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0192  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01db  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:150:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:153:0x0201  */
    /* JADX WARN: Code duplicated, block: B:156:0x020b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x021d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0220  */
    /* JADX WARN: Code duplicated, block: B:164:0x022a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0234  */
    /* JADX WARN: Code duplicated, block: B:172:0x0247  */
    /* JADX WARN: Code duplicated, block: B:174:0x024b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099 A[PHI: r22
  0x0099: PHI (r22v8 pb0) = (r22v2 pb0), (r22v9 pb0) binds: [B:57:0x0097, B:53:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf A[PHI: r5 r25
  0x00bf: PHI (r5v7 boolean) = (r5v5 boolean), (r5v8 boolean) binds: [B:68:0x00bd, B:65:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r25v5 boolean) = (r25v1 boolean), (r25v6 boolean) binds: [B:68:0x00bd, B:65:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107 A[PHI: r22
  0x0107: PHI (r22v6 pb0) = (r22v4 pb0), (r22v7 pb0) binds: [B:87:0x0105, B:84:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX INFO: renamed from: rememberDynamicColorScheme-UQznLDA, reason: not valid java name */
    public static final dc0 m13906rememberDynamicColorSchemeUQznLDA(long j, boolean z, boolean z2, pb0 pb0Var, pb0 pb0Var2, pb0 pb0Var3, pb0 pb0Var4, pb0 pb0Var5, pb0 pb0Var6, m73 m73Var, double d, pc0 pc0Var, x41 x41Var, yp1 yp1Var, mi0 mi0Var, int i, int i2, int i3) {
        double d2;
        pc0 pc0Var2;
        x41 x41Var2;
        pb0 pb0Var7;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        pb0 pb0Var8;
        pb0 pb0Var9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ir1 ir1Var;
        Object objM6869O;
        boolean z13 = (i3 & 4) != 0 ? false : z2;
        pb0 pb0Var10 = (i3 & 8) != 0 ? null : pb0Var;
        pb0 pb0Var11 = (i3 & 16) != 0 ? null : pb0Var2;
        pb0 pb0Var12 = (i3 & 32) != 0 ? null : pb0Var3;
        pb0 pb0Var13 = (i3 & 64) != 0 ? null : pb0Var4;
        pb0 pb0Var14 = (i3 & 128) != 0 ? null : pb0Var5;
        pb0 pb0Var15 = (i3 & 256) != 0 ? null : pb0Var6;
        m73 m73Var2 = (i3 & 512) != 0 ? m73.f24710a : m73Var;
        if ((i3 & 1024) != 0) {
            an0[] an0VarArr = an0.f14634a;
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i3 & 2048) != 0) {
            pc0.f27516a.getClass();
            pc0Var2 = pc0.f27517b;
        } else {
            pc0Var2 = pc0Var;
        }
        if ((i3 & 4096) != 0) {
            x41.f33972a.getClass();
            x41Var2 = x41.f33973b;
        } else {
            x41Var2 = x41Var;
        }
        yp1 yp1Var2 = (i3 & 8192) == 0 ? yp1Var : null;
        x41 x41Var3 = x41Var2;
        if (((i & 14) ^ 6) > 4) {
            pb0Var7 = pb0Var10;
            if (((ir1) mi0Var).m6888f(j)) {
                z3 = true;
            }
            if (((i & 112) ^ 48) > 32) {
                z4 = z;
                if (!((ir1) mi0Var).m6892h(z4)) {
                    z5 = z3;
                }
                z6 = true;
                boolean z14 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
                z7 = z13;
                if (((i & 7168) ^ 3072) > 2048) {
                    pb0Var8 = pb0Var7;
                    if (!((ir1) mi0Var).m6890g(pb0Var8)) {
                        pb0Var9 = pb0Var8;
                    }
                    z8 = true;
                    boolean z15 = z8 | z14 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
                    if (((1879048192 & i) ^ 805306368) > 536870912) {
                        if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                            z9 = true;
                        } else if ((i & 805306368) == 536870912) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else if ((i & 805306368) == 536870912) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z16 = z9 | z15 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
                    if (((i2 & 112) ^ 48) > 32) {
                        if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                            z10 = true;
                        } else if ((i2 & 48) == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ((i2 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z17 = z16 | z10;
                    if (((i2 & 896) ^ 384) > 256) {
                        if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                            z11 = true;
                        } else if ((i2 & 384) == 256) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if ((i2 & 384) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z17 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
                    ir1Var = (ir1) mi0Var;
                    objM6869O = ir1Var.m6869O();
                    if (z12 || objM6869O == ki0.f23136a) {
                        objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                        ir1Var.m6905n0(objM6869O);
                    }
                    return (dc0) objM6869O;
                }
                pb0Var8 = pb0Var7;
                pb0Var9 = pb0Var8;
                if ((i & 3072) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z18 = z8 | z14 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
                if (((1879048192 & i) ^ 805306368) > 536870912) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 805306368) == 536870912) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z19 = z9 | z18 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z19 | z10;
                if (((i2 & 896) ^ 384) > 256) {
                    if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 384) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z110 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            z4 = z;
            z5 = z3;
            if ((i & 48) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z111 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
            z7 = z13;
            if (((i & 7168) ^ 3072) > 2048) {
                pb0Var8 = pb0Var7;
                if (!((ir1) mi0Var).m6890g(pb0Var8)) {
                    pb0Var9 = pb0Var8;
                }
                z8 = true;
                boolean z112 = z8 | z111 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
                if (((1879048192 & i) ^ 805306368) > 536870912) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 805306368) == 536870912) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z113 = z9 | z112 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z114 = z113 | z10;
                if (((i2 & 896) ^ 384) > 256) {
                    if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 384) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z114 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            pb0Var8 = pb0Var7;
            pb0Var9 = pb0Var8;
            if ((i & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z115 = z8 | z111 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
            if (((1879048192 & i) ^ 805306368) > 536870912) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 805306368) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z116 = z9 | z115 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z117 = z116 | z10;
            if (((i2 & 896) ^ 384) > 256) {
                if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                    z11 = true;
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 384) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z117 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        pb0Var7 = pb0Var10;
        if ((i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((i & 112) ^ 48) > 32) {
            z4 = z;
            if (!((ir1) mi0Var).m6892h(z4)) {
                z5 = z3;
            }
            z6 = true;
            boolean z118 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
            z7 = z13;
            if (((i & 7168) ^ 3072) > 2048) {
                pb0Var8 = pb0Var7;
                if (!((ir1) mi0Var).m6890g(pb0Var8)) {
                    pb0Var9 = pb0Var8;
                }
                z8 = true;
                boolean z119 = z8 | z118 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
                if (((1879048192 & i) ^ 805306368) > 536870912) {
                    if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                        z9 = true;
                    } else if ((i & 805306368) == 536870912) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z1110 = z9 | z119 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
                if (((i2 & 112) ^ 48) > 32) {
                    if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                        z10 = true;
                    } else if ((i2 & 48) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z1111 = z1110 | z10;
                if (((i2 & 896) ^ 384) > 256) {
                    if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                        z11 = true;
                    } else if ((i2 & 384) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z1111 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
                ir1Var = (ir1) mi0Var;
                objM6869O = ir1Var.m6869O();
                if (z12) {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                } else {
                    objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                    ir1Var.m6905n0(objM6869O);
                }
                return (dc0) objM6869O;
            }
            pb0Var8 = pb0Var7;
            pb0Var9 = pb0Var8;
            if ((i & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z1112 = z8 | z118 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
            if (((1879048192 & i) ^ 805306368) > 536870912) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 805306368) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z1113 = z9 | z1112 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z1114 = z1113 | z10;
            if (((i2 & 896) ^ 384) > 256) {
                if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                    z11 = true;
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 384) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z1114 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        z4 = z;
        z5 = z3;
        if ((i & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z1115 = z5 | z6 | ((((i & 896) ^ 384) <= 256 && ((ir1) mi0Var).m6892h(z13)) || (i & 384) == 256);
        z7 = z13;
        if (((i & 7168) ^ 3072) > 2048) {
            pb0Var8 = pb0Var7;
            if (!((ir1) mi0Var).m6890g(pb0Var8)) {
                pb0Var9 = pb0Var8;
            }
            z8 = true;
            boolean z1116 = z8 | z1115 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
            if (((1879048192 & i) ^ 805306368) > 536870912) {
                if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                    z9 = true;
                } else if ((i & 805306368) == 536870912) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else if ((i & 805306368) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z1117 = z9 | z1116 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
            if (((i2 & 112) ^ 48) > 32) {
                if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                    z10 = true;
                } else if ((i2 & 48) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if ((i2 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z1118 = z1117 | z10;
            if (((i2 & 896) ^ 384) > 256) {
                if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                    z11 = true;
                } else if ((i2 & 384) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else if ((i2 & 384) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z1118 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
            ir1Var = (ir1) mi0Var;
            objM6869O = ir1Var.m6869O();
            if (z12) {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            } else {
                objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
                ir1Var.m6905n0(objM6869O);
            }
            return (dc0) objM6869O;
        }
        pb0Var8 = pb0Var7;
        pb0Var9 = pb0Var8;
        if ((i & 3072) == 2048) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z1119 = z8 | z1115 | ((((57344 & i) ^ 24576) <= 16384 && ((ir1) mi0Var).m6890g(pb0Var11)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) <= 131072 && ((ir1) mi0Var).m6890g(pb0Var12)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) <= 1048576 && ((ir1) mi0Var).m6890g(pb0Var13)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) <= 8388608 && ((ir1) mi0Var).m6890g(pb0Var14)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) <= 67108864 && ((ir1) mi0Var).m6890g(pb0Var15)) || (i & 100663296) == 67108864);
        if (((1879048192 & i) ^ 805306368) > 536870912) {
            if (!((ir1) mi0Var).m6886e(m73Var2.ordinal())) {
                z9 = true;
            } else if ((i & 805306368) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
        } else if ((i & 805306368) == 536870912) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11110 = z9 | z1119 | ((((i2 & 14) ^ 6) <= 4 && ((ir1) mi0Var).m6882c(d2)) || (i2 & 6) == 4);
        if (((i2 & 112) ^ 48) > 32) {
            if (!((ir1) mi0Var).m6886e(pc0Var2.ordinal())) {
                z10 = true;
            } else if ((i2 & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if ((i2 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11111 = z11110 | z10;
        if (((i2 & 896) ^ 384) > 256) {
            if (!((ir1) mi0Var).m6886e(x41Var3.ordinal())) {
                z11 = true;
            } else if ((i2 & 384) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else if ((i2 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        z12 = z11111 | z11 | ((((i2 & 7168) ^ 3072) <= 2048 && ((ir1) mi0Var).m6890g(yp1Var2)) || (i2 & 3072) == 2048);
        ir1Var = (ir1) mi0Var;
        objM6869O = ir1Var.m6869O();
        if (z12) {
            objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
            ir1Var.m6905n0(objM6869O);
        } else {
            objM6869O = m13901dynamicColorSchemeN98v4SY(j, z4, z7, pb0Var9, pb0Var11, pb0Var12, pb0Var13, pb0Var14, pb0Var15, m73Var2, d2, pc0Var2, x41Var3, yp1Var2);
            ir1Var.m6905n0(objM6869O);
        }
        return (dc0) objM6869O;
    }

    public static final dc0 toColorScheme(y41 y41Var, boolean z, yp1 yp1Var) {
        long jM4362g;
        dc0 dc0Var;
        boolean z2 = y41Var.f34848c;
        dd0 dd0Var = jq2.f22514a;
        long color = (z && z2) ? pb0.f27495b : DynamicColorKt.getColor(dd0Var.mo4455a(), y41Var);
        long color2 = DynamicColorKt.getColor(dd0Var.mo4456b(), y41Var);
        long color3 = DynamicColorKt.getColor(dd0Var.mo4457c(), y41Var);
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = "inverse_on_surface";
        mq4Var.f25142c = new ad0((byte) 6);
        ad0 ad0Var = new ad0((byte) 7);
        VarHandle.storeStoreFence();
        mq4Var.f25145f = ad0Var;
        byte b = 8;
        mq4Var.f25147h = new ad0((byte) 8);
        o41 o41VarM8369a = mq4Var.m8369a();
        mq4 mq4Var2 = new mq4();
        mq4Var2.f25141b = "inverse_on_surface";
        byte b2 = 0;
        mq4Var2.f25142c = new uc0(b2);
        mq4Var2.f25143d = new uc0((byte) 1);
        byte b3 = 2;
        uc0 uc0Var = new uc0(b3);
        VarHandle.storeStoreFence();
        mq4Var2.f25145f = uc0Var;
        byte b4 = 3;
        mq4Var2.f25147h = new uc0(b4);
        mq4 mq4VarM8942b = mq4Var2.m8369a().m8942b();
        r50 r50Var = pc0.f27516a;
        long color4 = DynamicColorKt.getColor(mq4VarM8942b.m8371c(o41VarM8369a).m8369a(), y41Var);
        mq4 mq4Var3 = new mq4();
        mq4Var3.f25141b = "inverse_primary";
        byte b5 = 25;
        mq4Var3.f25142c = new zc0((byte) 25);
        mq4Var3.f25143d = new zc0((byte) 26);
        zc0 zc0Var = new zc0((byte) 27);
        VarHandle.storeStoreFence();
        mq4Var3.f25145f = zc0Var;
        mq4Var3.f25147h = new zc0((byte) 28);
        o41 o41VarM8369a2 = mq4Var3.m8369a();
        mq4 mq4Var4 = new mq4();
        mq4Var4.f25141b = "inverse_primary";
        mq4Var4.f25142c = new uc0((byte) 29);
        mq4Var4.f25143d = new vc0(b2);
        vc0 vc0Var = new vc0((byte) 1);
        VarHandle.storeStoreFence();
        mq4Var4.f25145f = vc0Var;
        mq4Var4.f25147h = new vc0(b3);
        long jM4362g2 = d55.m4362g(mq4Var4, o41VarM8369a2, y41Var);
        long color5 = DynamicColorKt.getColor(dd0Var.mo4466m(), y41Var);
        byte b6 = 21;
        byte b7 = 20;
        byte b8 = 19;
        byte b9 = 22;
        if (z && z2) {
            jM4362g = pb0.f27497d;
        } else {
            mq4 mq4VarM8942b2 = dd0Var.m4448D().m8942b();
            mq4VarM8942b2.f25141b = "on_background";
            xc0 xc0Var = new xc0((byte) 6);
            VarHandle.storeStoreFence();
            mq4VarM8942b2.f25143d = xc0Var;
            o41 o41VarM8369a3 = mq4VarM8942b2.m8369a();
            mq4 mq4Var5 = new mq4();
            mq4Var5.f25141b = "on_background";
            mq4Var5.f25142c = new tc0(b8);
            mq4Var5.f25143d = new tc0(b7);
            tc0 tc0Var = new tc0(b6);
            VarHandle.storeStoreFence();
            mq4Var5.f25145f = tc0Var;
            mq4Var5.f25147h = new tc0(b9);
            jM4362g = d55.m4362g(mq4Var5, o41VarM8369a3, y41Var);
        }
        mq4 mq4Var6 = new mq4();
        mq4Var6.f25141b = "on_error";
        mq4Var6.f25142c = new xc0((byte) 15);
        xc0 xc0Var2 = new xc0((byte) 16);
        VarHandle.storeStoreFence();
        mq4Var6.f25145f = xc0Var2;
        mq4Var6.f25147h = new xc0((byte) 17);
        o41 o41VarM8369a4 = mq4Var6.m8369a();
        mq4 mq4Var7 = new mq4();
        mq4Var7.f25141b = "on_error";
        mq4Var7.f25142c = new tc0(b);
        mq4Var7.f25143d = new tc0((byte) 9);
        tc0 tc0Var2 = new tc0((byte) 10);
        VarHandle.storeStoreFence();
        mq4Var7.f25145f = tc0Var2;
        byte b10 = 11;
        mq4Var7.f25147h = new tc0(b10);
        long jM4362g3 = d55.m4362g(mq4Var7, o41VarM8369a4, y41Var);
        mq4 mq4Var8 = new mq4();
        mq4Var8.f25141b = "on_error_container";
        mq4Var8.f25142c = new cd0((byte) 16);
        cd0 cd0Var = new cd0((byte) 17);
        VarHandle.storeStoreFence();
        mq4Var8.f25145f = cd0Var;
        mq4Var8.f25147h = new cd0((byte) 18);
        o41 o41VarM8369a5 = mq4Var8.m8369a();
        mq4 mq4Var9 = new mq4();
        mq4Var9.f25141b = "on_error_container";
        mq4Var9.f25142c = new rc0(b9);
        mq4Var9.f25143d = new rc0((byte) 23);
        byte b11 = 24;
        rc0 rc0Var = new rc0(b11);
        VarHandle.storeStoreFence();
        mq4Var9.f25145f = rc0Var;
        mq4Var9.f25147h = new rc0(b5);
        long jM4362g4 = d55.m4362g(mq4Var9, o41VarM8369a5, y41Var);
        mq4 mq4Var10 = new mq4();
        mq4Var10.f25141b = "on_primary";
        mq4Var10.f25142c = new xc0((byte) 2);
        xc0 xc0Var3 = new xc0((byte) 3);
        VarHandle.storeStoreFence();
        mq4Var10.f25145f = xc0Var3;
        byte b12 = 4;
        mq4Var10.f25147h = new xc0((byte) 4);
        o41 o41VarM8369a6 = mq4Var10.m8369a();
        mq4 mq4Var11 = new mq4();
        mq4Var11.f25141b = "on_primary";
        mq4Var11.f25142c = new uc0(b);
        mq4Var11.f25143d = new uc0((byte) 9);
        uc0 uc0Var2 = new uc0((byte) 10);
        VarHandle.storeStoreFence();
        mq4Var11.f25145f = uc0Var2;
        mq4Var11.f25147h = new uc0(b10);
        long jM4362g5 = d55.m4362g(mq4Var11, o41VarM8369a6, y41Var);
        mq4 mq4Var12 = new mq4();
        mq4Var12.f25141b = "on_primary_container";
        mq4Var12.f25142c = new vc0(b7);
        vc0 vc0Var2 = new vc0((byte) 21);
        VarHandle.storeStoreFence();
        mq4Var12.f25145f = vc0Var2;
        mq4Var12.f25147h = new vc0(b9);
        o41 o41VarM8369a7 = mq4Var12.m8369a();
        mq4 mq4Var13 = new mq4();
        mq4Var13.f25141b = "on_primary_container";
        mq4Var13.f25142c = new tc0(b11);
        tc0 tc0Var3 = new tc0(b5);
        VarHandle.storeStoreFence();
        mq4Var13.f25143d = tc0Var3;
        tc0 tc0Var4 = new tc0((byte) 26);
        VarHandle.storeStoreFence();
        mq4Var13.f25145f = tc0Var4;
        mq4Var13.f25147h = new tc0((byte) 27);
        long jM4362g6 = d55.m4362g(mq4Var13, o41VarM8369a7, y41Var);
        mq4 mq4Var14 = new mq4();
        mq4Var14.f25141b = "on_secondary";
        byte b13 = 19;
        mq4Var14.f25142c = new xc0((byte) 19);
        zc0 zc0Var2 = new zc0((byte) 0);
        VarHandle.storeStoreFence();
        mq4Var14.f25145f = zc0Var2;
        mq4Var14.f25147h = new zc0((byte) 8);
        o41 o41VarM8369a8 = mq4Var14.m8369a();
        mq4 mq4Var15 = new mq4();
        mq4Var15.f25141b = "on_secondary";
        mq4Var15.f25142c = new vc0(b4);
        mq4Var15.f25143d = new vc0((byte) 5);
        vc0 vc0Var3 = new vc0((byte) 6);
        VarHandle.storeStoreFence();
        mq4Var15.f25145f = vc0Var3;
        mq4Var15.f25147h = new vc0((byte) 7);
        long jM4362g7 = d55.m4362g(mq4Var15, o41VarM8369a8, y41Var);
        mq4 mq4Var16 = new mq4();
        mq4Var16.f25141b = "on_secondary_container";
        mq4Var16.f25142c = new ad0((byte) 9);
        ad0 ad0Var2 = new ad0((byte) 10);
        VarHandle.storeStoreFence();
        mq4Var16.f25145f = ad0Var2;
        mq4Var16.f25147h = new ad0((byte) 11);
        o41 o41VarM8369a9 = mq4Var16.m8369a();
        mq4 mq4Var17 = new mq4();
        mq4Var17.f25141b = "on_secondary_container";
        mq4Var17.f25142c = new uc0(b5);
        uc0 uc0Var3 = new uc0((byte) 26);
        VarHandle.storeStoreFence();
        mq4Var17.f25143d = uc0Var3;
        uc0 uc0Var4 = new uc0((byte) 27);
        VarHandle.storeStoreFence();
        mq4Var17.f25145f = uc0Var4;
        mq4Var17.f25147h = new uc0((byte) 28);
        long jM4362g8 = d55.m4362g(mq4Var17, o41VarM8369a9, y41Var);
        long color6 = (z && z2) ? pb0.f27497d : DynamicColorKt.getColor(dd0Var.m4448D(), y41Var);
        mq4 mq4Var18 = new mq4();
        mq4Var18.f25141b = "on_surface_variant";
        mq4Var18.f25142c = new vc0((byte) 27);
        mq4Var18.f25144e = new vc0((byte) 28);
        vc0 vc0Var4 = new vc0((byte) 29);
        VarHandle.storeStoreFence();
        mq4Var18.f25145f = vc0Var4;
        mq4Var18.f25147h = new xc0((byte) 0);
        o41 o41VarM8369a10 = mq4Var18.m8369a();
        mq4 mq4Var19 = new mq4();
        mq4Var19.f25141b = "on_surface_variant";
        mq4Var19.f25142c = new sc0(b);
        mq4Var19.f25143d = new sc0((byte) 9);
        byte b14 = 17;
        mq4Var19.f25145f = new C0633f0(1, dd0Var, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 6);
        mq4Var19.f25147h = new sc0((byte) 10);
        long jM4362g9 = d55.m4362g(mq4Var19, o41VarM8369a10, y41Var);
        mq4 mq4Var20 = new mq4();
        mq4Var20.f25141b = "on_tertiary";
        mq4Var20.f25142c = new vc0(b14);
        vc0 vc0Var5 = new vc0((byte) 18);
        VarHandle.storeStoreFence();
        mq4Var20.f25145f = vc0Var5;
        mq4Var20.f25147h = new vc0(b13);
        o41 o41VarM8369a11 = mq4Var20.m8369a();
        mq4 mq4Var21 = new mq4();
        mq4Var21.f25141b = "on_tertiary";
        mq4Var21.f25142c = new sc0(b12);
        mq4Var21.f25143d = new sc0((byte) 5);
        sc0 sc0Var = new sc0((byte) 6);
        VarHandle.storeStoreFence();
        mq4Var21.f25145f = sc0Var;
        mq4Var21.f25147h = new sc0((byte) 7);
        long jM4362g10 = d55.m4362g(mq4Var21, o41VarM8369a11, y41Var);
        mq4 mq4Var22 = new mq4();
        mq4Var22.f25141b = "on_tertiary_container";
        mq4Var22.f25142c = new ad0((byte) 15);
        ad0 ad0Var3 = new ad0((byte) 16);
        VarHandle.storeStoreFence();
        mq4Var22.f25145f = ad0Var3;
        mq4Var22.f25147h = new ad0((byte) 17);
        o41 o41VarM8369a12 = mq4Var22.m8369a();
        mq4 mq4Var23 = new mq4();
        mq4Var23.f25141b = "on_tertiary_container";
        mq4Var23.f25142c = new rc0((byte) 18);
        rc0 rc0Var2 = new rc0(b13);
        VarHandle.storeStoreFence();
        mq4Var23.f25143d = rc0Var2;
        rc0 rc0Var3 = new rc0((byte) 20);
        VarHandle.storeStoreFence();
        mq4Var23.f25145f = rc0Var3;
        mq4Var23.f25147h = new rc0((byte) 21);
        long jM4362g11 = d55.m4362g(mq4Var23, o41VarM8369a12, y41Var);
        mq4 mq4Var24 = new mq4();
        mq4Var24.f25141b = "outline";
        mq4Var24.f25142c = new cd0((byte) 23);
        mq4Var24.f25144e = new cd0((byte) 24);
        cd0 cd0Var2 = new cd0((byte) 25);
        VarHandle.storeStoreFence();
        mq4Var24.f25145f = cd0Var2;
        mq4Var24.f25147h = new cd0((byte) 26);
        o41 o41VarM8369a13 = mq4Var24.m8369a();
        mq4 mq4Var25 = new mq4();
        mq4Var25.f25141b = "outline";
        mq4Var25.f25142c = new uc0((byte) 15);
        mq4Var25.f25143d = new uc0((byte) 16);
        mq4Var25.f25145f = new C0633f0(1, dd0Var, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 7);
        mq4Var25.f25147h = new uc0(b14);
        long jM4362g12 = d55.m4362g(mq4Var25, o41VarM8369a13, y41Var);
        mq4 mq4Var26 = new mq4();
        mq4Var26.f25141b = "outline_variant";
        mq4Var26.f25142c = new xc0((byte) 18);
        mq4Var26.f25144e = new xc0((byte) 20);
        xc0 xc0Var4 = new xc0((byte) 21);
        VarHandle.storeStoreFence();
        mq4Var26.f25145f = xc0Var4;
        mq4Var26.f25147h = new xc0((byte) 22);
        o41 o41VarM8369a14 = mq4Var26.m8369a();
        mq4 mq4Var27 = new mq4();
        mq4Var27.f25141b = "outline_variant";
        mq4Var27.f25142c = new sc0((byte) 21);
        mq4Var27.f25143d = new sc0((byte) 22);
        mq4Var27.f25145f = new C0633f0(1, dd0Var, wc0.class, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 8);
        mq4Var27.f25147h = new sc0((byte) 24);
        long jM4362g13 = d55.m4362g(mq4Var27, o41VarM8369a14, y41Var);
        long color7 = DynamicColorKt.getColor(dd0Var.mo4467o(), y41Var);
        long color8 = DynamicColorKt.getColor(dd0Var.mo4468p(), y41Var);
        mq4 mq4Var28 = new mq4();
        mq4Var28.f25141b = "scrim";
        mq4Var28.f25142c = new C0499bp((byte) 11);
        mq4Var28.f25143d = new sc0((byte) 23);
        long color9 = DynamicColorKt.getColor(mq4Var28.m8369a(), y41Var);
        long color10 = DynamicColorKt.getColor(dd0Var.mo4471s(), y41Var);
        long color11 = DynamicColorKt.getColor(dd0Var.mo4472t(), y41Var);
        long color12 = (z && z2) ? pb0.f27495b : DynamicColorKt.getColor(dd0Var.m4451G(), y41Var);
        mq4 mq4VarM8942b3 = dd0Var.mo4467o().m8942b();
        mq4VarM8942b3.f25141b = "surface_tint";
        o41 o41VarM8369a15 = mq4VarM8942b3.m8369a();
        mq4 mq4Var29 = new mq4();
        mq4Var29.f25141b = "surface_tint";
        mq4Var29.f25142c = new uc0((byte) 14);
        mq4Var29.f25143d = new uc0((byte) 24);
        mq4Var29.f25140a = true;
        long jM4362g14 = d55.m4362g(mq4Var29, o41VarM8369a15, y41Var);
        long color13 = DynamicColorKt.getColor(dd0Var.mo4475w(), y41Var);
        long color14 = DynamicColorKt.getColor(dd0Var.mo4476x(), y41Var);
        mq4 mq4Var30 = new mq4();
        mq4Var30.f25141b = "surface_container";
        mq4Var30.f25142c = new ad0((byte) 25);
        mq4Var30.f25143d = new ad0((byte) 26);
        mq4Var30.f25140a = true;
        mq4Var30.f25144e = new ad0((byte) 27);
        o41 o41VarM8369a16 = mq4Var30.m8369a();
        mq4 mq4Var31 = new mq4();
        mq4Var31.f25141b = "surface_container";
        mq4Var31.f25142c = new uc0((byte) 12);
        mq4Var31.f25143d = new uc0((byte) 13);
        mq4Var31.f25140a = true;
        long jM4362g15 = d55.m4362g(mq4Var31, o41VarM8369a16, y41Var);
        long color15 = DynamicColorKt.getColor(dd0Var.m4452H(), y41Var);
        long color16 = DynamicColorKt.getColor(dd0Var.m4453I(), y41Var);
        mq4 mq4Var32 = new mq4();
        mq4Var32.f25141b = "surface_container_low";
        mq4Var32.f25142c = new cd0((byte) 5);
        mq4Var32.f25143d = new cd0((byte) 6);
        mq4Var32.f25140a = true;
        mq4Var32.f25144e = new cd0((byte) 7);
        o41 o41VarM8369a17 = mq4Var32.m8369a();
        mq4 mq4Var33 = new mq4();
        mq4Var33.f25141b = "surface_container_low";
        mq4Var33.f25142c = new rc0((byte) 5);
        mq4Var33.f25143d = new rc0((byte) 6);
        mq4Var33.f25140a = true;
        long jM4362g16 = d55.m4362g(mq4Var33, o41VarM8369a17, y41Var);
        mq4 mq4Var34 = new mq4();
        mq4Var34.f25141b = "surface_container_lowest";
        mq4Var34.f25142c = new ad0((byte) 4);
        mq4Var34.f25143d = new ad0((byte) 5);
        mq4Var34.f25140a = true;
        o41 o41VarM8369a18 = mq4Var34.m8369a();
        mq4 mq4Var35 = new mq4();
        mq4Var35.f25141b = "surface_container_lowest";
        mq4Var35.f25142c = new sc0((byte) 25);
        mq4Var35.f25143d = new sc0((byte) 26);
        mq4Var35.f25140a = true;
        long jM4362g17 = d55.m4362g(mq4Var35, o41VarM8369a18, y41Var);
        mq4 mq4VarM8942b4 = dd0Var.m4453I().m8942b();
        mq4VarM8942b4.f25141b = "surface_variant";
        o41 o41VarM8369a19 = mq4VarM8942b4.m8369a();
        mq4 mq4Var36 = new mq4();
        mq4Var36.f25141b = "surface_variant";
        mq4Var36.f25142c = new tc0((byte) 23);
        mq4Var36.f25143d = new uc0((byte) 4);
        mq4Var36.f25140a = true;
        long jM4362g18 = d55.m4362g(mq4Var36, o41VarM8369a19, y41Var);
        long color17 = DynamicColorKt.getColor(dd0Var.mo4477y(), y41Var);
        long color18 = DynamicColorKt.getColor(dd0Var.mo4478z(), y41Var);
        long color19 = DynamicColorKt.getColor(dd0Var.mo4469q(), y41Var);
        long color20 = DynamicColorKt.getColor(dd0Var.mo4470r(), y41Var);
        mq4 mq4Var37 = new mq4();
        mq4Var37.f25141b = "on_primary_fixed";
        mq4Var37.f25142c = new cd0((byte) 2);
        cd0 cd0Var3 = new cd0((byte) 3);
        VarHandle.storeStoreFence();
        mq4Var37.f25145f = cd0Var3;
        mq4Var37.f25147h = new cd0((byte) 4);
        o41 o41VarM8369a20 = mq4Var37.m8369a();
        mq4 mq4Var38 = new mq4();
        mq4Var38.f25141b = "on_primary_fixed";
        mq4Var38.f25142c = new sc0((byte) 11);
        mq4Var38.f25143d = new sc0((byte) 13);
        sc0 sc0Var2 = new sc0((byte) 14);
        VarHandle.storeStoreFence();
        mq4Var38.f25145f = sc0Var2;
        sc0 sc0Var3 = new sc0((byte) 15);
        VarHandle.storeStoreFence();
        mq4Var38.f25146g = sc0Var3;
        mq4Var38.f25147h = new sc0((byte) 16);
        long jM4362g19 = d55.m4362g(mq4Var38, o41VarM8369a20, y41Var);
        mq4 mq4Var39 = new mq4();
        mq4Var39.f25141b = "on_primary_fixed_variant";
        mq4Var39.f25142c = new vc0((byte) 23);
        vc0 vc0Var6 = new vc0((byte) 24);
        VarHandle.storeStoreFence();
        mq4Var39.f25145f = vc0Var6;
        mq4Var39.f25147h = new vc0((byte) 25);
        o41 o41VarM8369a21 = mq4Var39.m8369a();
        mq4 mq4Var40 = new mq4();
        mq4Var40.f25141b = "on_primary_fixed_variant";
        mq4Var40.f25142c = new C0499bp((byte) 23);
        mq4Var40.f25143d = new C0499bp((byte) 24);
        C0499bp c0499bp = new C0499bp((byte) 25);
        VarHandle.storeStoreFence();
        mq4Var40.f25145f = c0499bp;
        C0499bp c0499bp2 = new C0499bp((byte) 26);
        VarHandle.storeStoreFence();
        mq4Var40.f25146g = c0499bp2;
        mq4Var40.f25147h = new C0499bp((byte) 27);
        long jM4362g20 = d55.m4362g(mq4Var40, o41VarM8369a21, y41Var);
        long color21 = DynamicColorKt.getColor(dd0Var.mo4473u(), y41Var);
        long color22 = DynamicColorKt.getColor(dd0Var.mo4474v(), y41Var);
        mq4 mq4Var41 = new mq4();
        mq4Var41.f25141b = "on_secondary_fixed";
        mq4Var41.f25142c = new xc0((byte) 29);
        zc0 zc0Var3 = new zc0((byte) 1);
        VarHandle.storeStoreFence();
        mq4Var41.f25145f = zc0Var3;
        mq4Var41.f25147h = new zc0((byte) 2);
        o41 o41VarM8369a22 = mq4Var41.m8369a();
        mq4 mq4Var42 = new mq4();
        mq4Var42.f25141b = "on_secondary_fixed";
        mq4Var42.f25142c = new tc0((byte) 2);
        mq4Var42.f25143d = new tc0((byte) 4);
        tc0 tc0Var5 = new tc0((byte) 5);
        VarHandle.storeStoreFence();
        mq4Var42.f25145f = tc0Var5;
        tc0 tc0Var6 = new tc0((byte) 6);
        VarHandle.storeStoreFence();
        mq4Var42.f25146g = tc0Var6;
        mq4Var42.f25147h = new tc0((byte) 7);
        long jM4362g21 = d55.m4362g(mq4Var42, o41VarM8369a22, y41Var);
        mq4 mq4Var43 = new mq4();
        mq4Var43.f25141b = "on_secondary_fixed_variant";
        mq4Var43.f25142c = new cd0((byte) 13);
        cd0 cd0Var4 = new cd0((byte) 14);
        VarHandle.storeStoreFence();
        mq4Var43.f25145f = cd0Var4;
        mq4Var43.f25147h = new cd0((byte) 15);
        o41 o41VarM8369a23 = mq4Var43.m8369a();
        mq4 mq4Var44 = new mq4();
        mq4Var44.f25141b = "on_secondary_fixed_variant";
        mq4Var44.f25142c = new C0499bp((byte) 17);
        mq4Var44.f25143d = new C0499bp((byte) 18);
        C0499bp c0499bp3 = new C0499bp((byte) 19);
        VarHandle.storeStoreFence();
        mq4Var44.f25145f = c0499bp3;
        C0499bp c0499bp4 = new C0499bp((byte) 20);
        VarHandle.storeStoreFence();
        mq4Var44.f25146g = c0499bp4;
        mq4Var44.f25147h = new C0499bp((byte) 22);
        long jM4362g22 = d55.m4362g(mq4Var44, o41VarM8369a23, y41Var);
        long color23 = DynamicColorKt.getColor(dd0Var.mo4445A(), y41Var);
        long color24 = DynamicColorKt.getColor(dd0Var.mo4446B(), y41Var);
        mq4 mq4Var45 = new mq4();
        mq4Var45.f25141b = "on_tertiary_fixed";
        mq4Var45.f25142c = new vc0((byte) 26);
        xc0 xc0Var5 = new xc0((byte) 5);
        VarHandle.storeStoreFence();
        mq4Var45.f25145f = xc0Var5;
        mq4Var45.f25147h = new xc0((byte) 12);
        o41 o41VarM8369a24 = mq4Var45.m8369a();
        mq4 mq4Var46 = new mq4();
        mq4Var46.f25141b = "on_tertiary_fixed";
        mq4Var46.f25142c = new rc0((byte) 28);
        mq4Var46.f25143d = new rc0((byte) 29);
        sc0 sc0Var4 = new sc0((byte) 0);
        VarHandle.storeStoreFence();
        mq4Var46.f25145f = sc0Var4;
        sc0 sc0Var5 = new sc0((byte) 2);
        VarHandle.storeStoreFence();
        mq4Var46.f25146g = sc0Var5;
        mq4Var46.f25147h = new sc0((byte) 3);
        long jM4362g23 = d55.m4362g(mq4Var46, o41VarM8369a24, y41Var);
        mq4 mq4Var47 = new mq4();
        mq4Var47.f25141b = "on_tertiary_fixed_variant";
        mq4Var47.f25142c = new xc0((byte) 26);
        xc0 xc0Var6 = new xc0((byte) 27);
        VarHandle.storeStoreFence();
        mq4Var47.f25145f = xc0Var6;
        mq4Var47.f25147h = new xc0((byte) 28);
        o41 o41VarM8369a25 = mq4Var47.m8369a();
        mq4 mq4Var48 = new mq4();
        mq4Var48.f25141b = "on_tertiary_fixed_variant";
        mq4Var48.f25142c = new rc0((byte) 13);
        mq4Var48.f25143d = new rc0((byte) 14);
        rc0 rc0Var4 = new rc0((byte) 15);
        VarHandle.storeStoreFence();
        mq4Var48.f25145f = rc0Var4;
        rc0 rc0Var5 = new rc0((byte) 16);
        VarHandle.storeStoreFence();
        mq4Var48.f25146g = rc0Var5;
        mq4Var48.f25147h = new rc0((byte) 17);
        dc0 dc0Var2 = new dc0(color7, jM4362g5, color8, jM4362g6, jM4362g2, color10, jM4362g7, color11, jM4362g8, color17, jM4362g10, color18, jM4362g11, color, jM4362g, color12, color6, jM4362g18, jM4362g9, jM4362g14, color5, color4, color2, jM4362g3, color3, jM4362g4, jM4362g12, jM4362g13, color9, color13, color14, jM4362g15, color15, color16, jM4362g16, jM4362g17, color19, color20, jM4362g19, jM4362g20, color21, color22, jM4362g21, jM4362g22, color23, color24, jM4362g23, d55.m4362g(mq4Var48, o41VarM8369a25, y41Var));
        return (yp1Var == null || (dc0Var = (dc0) yp1Var.invoke(dc0Var2)) == null) ? dc0Var2 : dc0Var;
    }

    public static /* synthetic */ dc0 toColorScheme$default(y41 y41Var, boolean z, yp1 yp1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            yp1Var = null;
        }
        return toColorScheme(y41Var, z, yp1Var);
    }
}
