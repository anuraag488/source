package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0095e2;
import ads_mobile_sdk.C0176jd;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0321s2;
import ads_mobile_sdk.EnumC0139h2;
import ads_mobile_sdk.EnumC0157i2;
import ads_mobile_sdk.EnumC0192k2;
import ads_mobile_sdk.EnumC0250nc;
import ads_mobile_sdk.af1;
import ads_mobile_sdk.c93;
import ads_mobile_sdk.fe2;
import ads_mobile_sdk.gw2;
import ads_mobile_sdk.jc3;
import ads_mobile_sdk.jr2;
import ads_mobile_sdk.ls3;
import ads_mobile_sdk.mk2;
import ads_mobile_sdk.ri2;
import ads_mobile_sdk.si2;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.vc2;
import ads_mobile_sdk.wc2;
import android.app.privatecompute.PccSandboxManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.UnaryOperator;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ev0 implements iv0, ri0 {

    /* JADX INFO: renamed from: a */
    public static final pg0 f18493a = new pg0(-931179035, false, new qg0(28));

    /* JADX INFO: renamed from: b */
    public static final pg0 f18494b = new pg0(224649289, false, new jh0(8));

    /* JADX INFO: renamed from: c */
    public static final pg0 f18495c = new pg0(-6766261, false, new jh0(9));

    /* JADX INFO: renamed from: d */
    public static final pg0 f18496d = new pg0(-304490715, false, new jh0(10));

    /* JADX INFO: renamed from: e */
    public static final pg0 f18497e = new pg0(-1553368600, false, new jh0(11));

    /* JADX INFO: renamed from: f */
    public static final uz4 f18498f = new uz4(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: g */
    public static final uz4 f18499g = new uz4(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: h */
    public static final uz4 f18500h = new uz4(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: i */
    public static final uz4 f18501i = new uz4(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: j */
    public static final float[] f18502j = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: k */
    public static final t63 f18503k = new t63(4);

    /* JADX INFO: renamed from: l */
    public static final yg0 f18504l = new yg0(2);

    /* JADX INFO: renamed from: m */
    public static final oh1 f18505m;

    /* JADX INFO: renamed from: n */
    public static final kh5 f18506n;

    /* JADX INFO: renamed from: o */
    public static Boolean f18507o;

    /* JADX INFO: renamed from: p */
    public static C0759ie f18508p;

    /* JADX INFO: renamed from: q */
    public static C1325xb f18509q;

    /* JADX INFO: renamed from: r */
    public static j70 f18510r;

    static {
        oh1 oh1Var = new oh1();
        VarHandle.storeStoreFence();
        f18505m = oh1Var;
        f18506n = new kh5((byte) 0);
    }

    /* JADX INFO: renamed from: A0 */
    public static void m5329A0() {
        PccSandboxManager pccSandboxManagerM11034b;
        if (Build.VERSION.SDK_INT < 37 || f18507o != null) {
            return;
        }
        ry5.m10503a("CronetPccAuditLogger#initialize");
        try {
            int iMyUid = Process.myUid();
            boolean z = true;
            if (!Process.isPrivateComputeCoreUid(iMyUid) && ((pccSandboxManagerM11034b = AbstractC1179te.m11034b(x06.f33904a.getSystemService(AbstractC1179te.m11037e()))) == null || !pccSandboxManagerM11034b.isPrivateComputeServicesUid(iMyUid))) {
                z = false;
            }
            f18507o = Boolean.valueOf(z);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m5330E(dp4 dp4Var, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, yp1 yp1Var2, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(511725103);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(interfaceC0520ca) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(yp1Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1035pi.f27613k;
                ir1Var.m6905n0(objM6869O);
            }
            m5332G(dp4Var, nt2Var, yp1Var, interfaceC0520ca, yp1Var2, (yp1) objM6869O, pg0Var, ir1Var, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | ((i2 << 3) & 3670016));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1109ri(dp4Var, nt2Var, yp1Var, interfaceC0520ca, yp1Var2, pg0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    public static final void m5331F(Object obj, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, String str, yp1 yp1Var2, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        nt2 nt2Var2;
        int i4;
        InterfaceC0520ca interfaceC0520ca2;
        int i5;
        int i6;
        boolean z;
        yp1 yp1Var3;
        nt2 nt2Var3;
        InterfaceC0520ca interfaceC0520ca3;
        String str2;
        yk3 yk3VarM6916v;
        InterfaceC0520ca interfaceC0520ca4;
        Object objM6869O;
        int i7;
        int i8;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? ir1Var.m6890g(obj) : ir1Var.m6894i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                nt2Var2 = nt2Var;
                i3 |= ir1Var.m6890g(nt2Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (ir1Var.m6894i(yp1Var)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    interfaceC0520ca2 = interfaceC0520ca;
                    if (ir1Var.m6890g(interfaceC0520ca2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 221184;
                if ((1572864 & i) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i6 |= i7;
                }
                if ((599187 & i6) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (ir1Var.m6871T(i6 & 1, z)) {
                    if (i9 != 0) {
                        nt2Var3 = kt2.f23428a;
                    } else {
                        nt2Var3 = nt2Var2;
                    }
                    if (i4 != 0) {
                        interfaceC0520ca4 = ig1.f21378b;
                    } else {
                        interfaceC0520ca4 = interfaceC0520ca2;
                    }
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == ki0.f23136a) {
                        objM6869O = C1035pi.f27612j;
                        ir1Var.m6905n0(objM6869O);
                    }
                    yp1 yp1Var4 = (yp1) objM6869O;
                    dp4 dp4VarM13668T = zp0.m13668T(obj, "AnimatedContent", ir1Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                    int i10 = i6 & 8176;
                    int i11 = i6 >> 3;
                    m5330E(dp4VarM13668T, nt2Var3, yp1Var, interfaceC0520ca4, yp1Var4, pg0Var, ir1Var, i10 | (57344 & i11) | (i11 & 458752));
                    str2 = "AnimatedContent";
                    interfaceC0520ca3 = interfaceC0520ca4;
                    yp1Var3 = yp1Var4;
                } else {
                    ir1Var.m6874W();
                    yp1Var3 = yp1Var2;
                    nt2Var3 = nt2Var2;
                    interfaceC0520ca3 = interfaceC0520ca2;
                    str2 = str;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    yk3VarM6916v.f35300d = new C1072qi(obj, nt2Var3, yp1Var, interfaceC0520ca3, str2, yp1Var3, pg0Var, i, i2);
                }
            }
            i3 |= 3072;
            interfaceC0520ca2 = interfaceC0520ca;
            i6 = i3 | 221184;
            if ((1572864 & i) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599187 & i6) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i6 & 1, z)) {
                if (i9 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var2;
                }
                if (i4 != 0) {
                    interfaceC0520ca4 = ig1.f21378b;
                } else {
                    interfaceC0520ca4 = interfaceC0520ca2;
                }
                objM6869O = ir1Var.m6869O();
                if (objM6869O == ki0.f23136a) {
                    objM6869O = C1035pi.f27612j;
                    ir1Var.m6905n0(objM6869O);
                }
                yp1 yp1Var5 = (yp1) objM6869O;
                dp4 dp4VarM13668T2 = zp0.m13668T(obj, "AnimatedContent", ir1Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                int i12 = i6 & 8176;
                int i13 = i6 >> 3;
                m5330E(dp4VarM13668T2, nt2Var3, yp1Var, interfaceC0520ca4, yp1Var5, pg0Var, ir1Var, i12 | (57344 & i13) | (i13 & 458752));
                str2 = "AnimatedContent";
                interfaceC0520ca3 = interfaceC0520ca4;
                yp1Var3 = yp1Var5;
            } else {
                ir1Var.m6874W();
                yp1Var3 = yp1Var2;
                nt2Var3 = nt2Var2;
                interfaceC0520ca3 = interfaceC0520ca2;
                str2 = str;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                yk3VarM6916v.f35300d = new C1072qi(obj, nt2Var3, yp1Var, interfaceC0520ca3, str2, yp1Var3, pg0Var, i, i2);
            }
        }
        i3 |= 48;
        nt2Var2 = nt2Var;
        if ((i & 384) == 0) {
            if (ir1Var.m6894i(yp1Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                interfaceC0520ca2 = interfaceC0520ca;
                if (ir1Var.m6890g(interfaceC0520ca2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 221184;
            if ((1572864 & i) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599187 & i6) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i6 & 1, z)) {
                if (i9 != 0) {
                    nt2Var3 = kt2.f23428a;
                } else {
                    nt2Var3 = nt2Var2;
                }
                if (i4 != 0) {
                    interfaceC0520ca4 = ig1.f21378b;
                } else {
                    interfaceC0520ca4 = interfaceC0520ca2;
                }
                objM6869O = ir1Var.m6869O();
                if (objM6869O == ki0.f23136a) {
                    objM6869O = C1035pi.f27612j;
                    ir1Var.m6905n0(objM6869O);
                }
                yp1 yp1Var6 = (yp1) objM6869O;
                dp4 dp4VarM13668T3 = zp0.m13668T(obj, "AnimatedContent", ir1Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
                int i14 = i6 & 8176;
                int i15 = i6 >> 3;
                m5330E(dp4VarM13668T3, nt2Var3, yp1Var, interfaceC0520ca4, yp1Var6, pg0Var, ir1Var, i14 | (57344 & i15) | (i15 & 458752));
                str2 = "AnimatedContent";
                interfaceC0520ca3 = interfaceC0520ca4;
                yp1Var3 = yp1Var6;
            } else {
                ir1Var.m6874W();
                yp1Var3 = yp1Var2;
                nt2Var3 = nt2Var2;
                interfaceC0520ca3 = interfaceC0520ca2;
                str2 = str;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                yk3VarM6916v.f35300d = new C1072qi(obj, nt2Var3, yp1Var, interfaceC0520ca3, str2, yp1Var3, pg0Var, i, i2);
            }
        }
        i3 |= 3072;
        interfaceC0520ca2 = interfaceC0520ca;
        i6 = i3 | 221184;
        if ((1572864 & i) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i6 |= i7;
        }
        if ((599187 & i6) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (ir1Var.m6871T(i6 & 1, z)) {
            if (i9 != 0) {
                nt2Var3 = kt2.f23428a;
            } else {
                nt2Var3 = nt2Var2;
            }
            if (i4 != 0) {
                interfaceC0520ca4 = ig1.f21378b;
            } else {
                interfaceC0520ca4 = interfaceC0520ca2;
            }
            objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1035pi.f27612j;
                ir1Var.m6905n0(objM6869O);
            }
            yp1 yp1Var7 = (yp1) objM6869O;
            dp4 dp4VarM13668T4 = zp0.m13668T(obj, "AnimatedContent", ir1Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
            int i16 = i6 & 8176;
            int i17 = i6 >> 3;
            m5330E(dp4VarM13668T4, nt2Var3, yp1Var, interfaceC0520ca4, yp1Var7, pg0Var, ir1Var, i16 | (57344 & i17) | (i17 & 458752));
            str2 = "AnimatedContent";
            interfaceC0520ca3 = interfaceC0520ca4;
            yp1Var3 = yp1Var7;
        } else {
            ir1Var.m6874W();
            yp1Var3 = yp1Var2;
            nt2Var3 = nt2Var2;
            interfaceC0520ca3 = interfaceC0520ca2;
            str2 = str;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1072qi(obj, nt2Var3, yp1Var, interfaceC0520ca3, str2, yp1Var3, pg0Var, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final void m5332G(dp4 dp4Var, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, yp1 yp1Var2, yp1 yp1Var3, pg0 pg0Var, mi0 mi0Var, int i) throws Throwable {
        ir1 ir1Var;
        int i2;
        Throwable th;
        Object obj;
        lw2 lw2Var;
        Throwable th2;
        C0727hj c0727hj;
        w94 w94Var;
        w94 w94Var2;
        yo4 yo4Var;
        ir1 ir1Var2;
        boolean z;
        int i3;
        int i4;
        zh0 zh0Var = dp4Var.f17258a;
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6889f0(1935038908);
        int i5 = (i & 6) == 0 ? (ir1Var3.m6890g(dp4Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= ir1Var3.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= ir1Var3.m6894i(yp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= ir1Var3.m6890g(interfaceC0520ca) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= ir1Var3.m6894i(yp1Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= ir1Var3.m6894i(yp1Var3) ? 131072 : 65536;
        }
        pg0 pg0Var2 = pg0Var;
        if ((1572864 & i) == 0) {
            i5 |= ir1Var3.m6894i(pg0Var2) ? 1048576 : 524288;
        }
        if (ir1Var3.m6871T(i5 & 1, (599187 & i5) != 599186)) {
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objM6869O = ir1Var3.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj2 = objM6869O;
            if (z2 || objM6869O == i50Var) {
                C0727hj c0727hj2 = new C0727hj();
                c0727hj2.f20615a = dp4Var;
                c0727hj2.f20616b = interfaceC0520ca;
                c0727hj2.f20617c = k43.m7398w(w52.m12106a(0L));
                long[] jArr = tv3.f31472a;
                c0727hj2.f20618d = new lw2();
                VarHandle.storeStoreFence();
                ir1Var3.m6905n0(c0727hj2);
                obj2 = c0727hj2;
            }
            C0727hj c0727hj3 = (C0727hj) obj2;
            boolean z3 = i6 == 4;
            Object objM6869O2 = ir1Var3.m6869O();
            if (z3 || objM6869O2 == i50Var) {
                Object[] objArr = {zh0Var.mo11188l()};
                w94 w94Var3 = new w94();
                w94Var3.addAll(AbstractC0990oo.m9215j0(objArr));
                ir1Var3.m6905n0(w94Var3);
                objM6869O2 = w94Var3;
            }
            w94 w94Var4 = (w94) objM6869O2;
            d83 d83Var = dp4Var.f17262e;
            d83 d83Var2 = dp4Var.f17261d;
            boolean zM6890g = ir1Var3.m6890g(d83Var.getValue()) | (i6 == 4);
            Object objM6869O3 = ir1Var3.m6869O();
            if (zM6890g || objM6869O3 == i50Var) {
                long[] jArr2 = tv3.f31472a;
                objM6869O3 = new lw2();
                ir1Var3.m6905n0(objM6869O3);
            }
            lw2 lw2Var2 = (lw2) objM6869O3;
            if (!w94Var4.contains(zh0Var.mo11188l())) {
                w94Var4.clear();
                w94Var4.add(zh0Var.mo11188l());
            }
            if (z62.m13387o(zh0Var.mo11188l(), d83Var2.getValue()) && d83Var.getValue() == null) {
                if (w94Var4.size() != 1 || !z62.m13387o(w94Var4.get(0), zh0Var.mo11188l())) {
                    w94Var4.clear();
                    w94Var4.add(zh0Var.mo11188l());
                }
                if (lw2Var2.f24422e != 1 || lw2Var2.m8128c(zh0Var.mo11188l())) {
                    lw2Var2.m8126a();
                }
                c0727hj3.f20616b = interfaceC0520ca;
            }
            Object value = d83Var.getValue();
            if (value == null || value.equals(zh0Var.mo11188l())) {
                i2 = i5;
            } else {
                ListIterator listIterator = w94Var4.listIterator();
                int i7 = 0;
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        i2 = i5;
                        i4 = -1;
                        break;
                    }
                    i2 = i5;
                    if (z62.m13387o(yp1Var2.invoke(ow1Var.next()), yp1Var2.invoke(value))) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                        i5 = i2;
                    }
                }
                if (i4 == -1) {
                    w94Var4.add(value);
                } else if (!z62.m13387o(w94Var4.get(i4), value)) {
                    w94Var4.set(i4, value);
                }
            }
            if (!z62.m13387o(zh0Var.mo11188l(), d83Var2.getValue())) {
                ListIterator listIterator2 = w94Var4.listIterator();
                int i8 = 0;
                while (true) {
                    ow1 ow1Var2 = (ow1) listIterator2;
                    if (!ow1Var2.hasNext()) {
                        i3 = -1;
                        break;
                    } else {
                        if (z62.m13387o(yp1Var2.invoke(ow1Var2.next()), yp1Var2.invoke(d83Var2.getValue()))) {
                            i3 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                if (i3 == -1) {
                    w94Var4.add(d83Var2.getValue());
                } else if (!z62.m13387o(w94Var4.get(i3), d83Var2.getValue()) || i3 != w94Var4.size() - 1) {
                    z62.m13387o(d83Var2.getValue(), w94Var4.get(i3));
                    w94Var4.remove(i3);
                    w94Var4.add(d83Var2.getValue());
                }
            }
            Object value2 = d83Var.getValue();
            boolean zM6890g2 = ir1Var3.m6890g(value2);
            Object objM6869O4 = ir1Var3.m6869O();
            if (zM6890g2 || objM6869O4 == i50Var) {
                objM6869O4 = value2 != null ? new r93(c0727hj3, d83Var2.getValue(), value2) : null;
                ir1Var3.m6905n0(objM6869O4);
            }
            r93 r93Var = (r93) objM6869O4;
            boolean zM6890g3 = ir1Var3.m6890g(r93Var) | ((i2 & 458752) == 131072);
            Object objM6869O5 = ir1Var3.m6869O();
            if (!zM6890g3 && objM6869O5 != i50Var) {
                obj = objM6869O5;
                th = null;
            } else if (r93Var != null && yp1Var3.invoke(r93Var) != null) {
                xy4.m12778e();
                return;
            } else {
                th = null;
                ir1Var3.m6905n0(null);
                obj = null;
            }
            if (obj != null) {
                xy4.m12778e();
                return;
            }
            if (lw2Var2.m8127b(d83Var2.getValue()) && lw2Var2.m8127b(zh0Var.mo11188l()) && (value2 == null || lw2Var2.m8127b(value2))) {
                ir1Var3.m6885d0(-297322234);
                ir1Var3.m6912r(false);
                lw2Var = lw2Var2;
                th2 = th;
                c0727hj = c0727hj3;
                w94Var = w94Var4;
            } else {
                boolean z4 = false;
                ir1Var3.m6885d0(-302069574);
                lw2Var2.m8126a();
                int size = w94Var4.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = w94Var4.get(i9);
                    lw2 lw2Var3 = lw2Var2;
                    Throwable th3 = th;
                    C0727hj c0727hj4 = c0727hj3;
                    w94 w94Var5 = w94Var4;
                    lw2Var3.m8138m(obj3, vd6.m11834R(427839334, new C1332xi(obj3, dp4Var, r93Var, yp1Var, c0727hj4, w94Var5, pg0Var2), ir1Var3));
                    w94Var4 = w94Var5;
                    c0727hj3 = c0727hj4;
                    lw2Var2 = lw2Var3;
                    size = size;
                    th = th3;
                    pg0Var2 = pg0Var;
                    i9++;
                    z4 = false;
                }
                lw2Var = lw2Var2;
                th2 = th;
                c0727hj = c0727hj3;
                w94Var = w94Var4;
                ir1Var3.m6912r(z4);
            }
            boolean zM6890g4 = ir1Var3.m6890g(dp4Var.m4645g()) | ir1Var3.m6890g(c0727hj) | ir1Var3.m6890g(d83Var.getValue());
            Object objM6869O6 = ir1Var3.m6869O();
            if (zM6890g4 || objM6869O6 == i50Var) {
                objM6869O6 = (km0) yp1Var.invoke(c0727hj);
                ir1Var3.m6905n0(objM6869O6);
            }
            km0 km0Var = (km0) objM6869O6;
            dp4 dp4Var2 = c0727hj.f20615a;
            boolean zM6890g5 = ir1Var3.m6890g(c0727hj);
            Object objM6869O7 = ir1Var3.m6869O();
            if (zM6890g5 || objM6869O7 == i50Var) {
                objM6869O7 = k43.m7398w(Boolean.FALSE);
                ir1Var3.m6905n0(objM6869O7);
            }
            sw2 sw2Var = (sw2) objM6869O7;
            sw2 sw2VarM7369C = k43.m7369C(km0Var.f23231d, ir1Var3);
            if (z62.m13387o(dp4Var2.f17258a.mo11188l(), dp4Var2.f17261d.getValue())) {
                sw2Var.setValue(Boolean.FALSE);
            } else if (sw2VarM7369C.getValue() != null) {
                sw2Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) sw2Var.getValue()).booleanValue();
            nt2 nt2Var2 = kt2.f23428a;
            if (zBooleanValue) {
                ir1Var3.m6885d0(1353077497);
                w94Var2 = w94Var;
                ir1 ir1Var4 = ir1Var3;
                yo4 yo4VarM13687s = zp0.m13687s(c0727hj.f20615a, sw4.f30619h, null, ir1Var4, 0, 2);
                boolean zM6890g6 = ir1Var4.m6890g(yo4VarM13687s);
                Object objM6869O8 = ir1Var4.m6869O();
                if (zM6890g6 || objM6869O8 == i50Var) {
                    objM6869O8 = i25.m6620n(nt2Var2);
                    ir1Var4.m6905n0(objM6869O8);
                }
                nt2Var2 = (nt2) objM6869O8;
                ir1Var4.m6912r(false);
                ir1Var2 = ir1Var4;
                yo4Var = yo4VarM13687s;
            } else {
                ir1 ir1Var5 = ir1Var3;
                w94Var2 = w94Var;
                ir1Var5.m6885d0(1353343539);
                ir1Var5.m6912r(false);
                yo4Var = th2;
                ir1Var2 = ir1Var5;
            }
            nt2 nt2Var3 = nt2Var2;
            C0577dj c0577dj = new C0577dj();
            c0577dj.f17093a = yo4Var;
            c0577dj.f17094b = sw2VarM7369C;
            c0577dj.f17095c = c0727hj;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2Var3.mo7630d(c0577dj));
            Object objM6869O9 = ir1Var2.m6869O();
            Object obj4 = objM6869O9;
            if (objM6869O9 == i50Var) {
                C1406zi c1406zi = new C1406zi();
                c1406zi.f36102a = c0727hj;
                c1406zi.f36109h = new C1369yi(c1406zi, (byte) 1);
                c1406zi.f36110i = new C1369yi(c1406zi, (byte) 0);
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c1406zi);
                obj4 = c1406zi;
            }
            C1406zi c1406zi2 = (C1406zi) obj4;
            int iHashCode = Long.hashCode(ir1Var2.f21683T);
            ga3 ga3VarM6902m = ir1Var2.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarMo7630d);
            bi0.f15310ap.getClass();
            if (ir1Var2.f21685a == null) {
                dt0.m4682E();
                throw th2;
            }
            ir1Var2.m6893h0();
            if (ir1Var2.f21682S) {
                ir1Var2.m6900l(wf2.f33290T);
            } else {
                ir1Var2.m6911q0();
            }
            C0006a5.m53I(ir1Var2, ia5.f21216g, c1406zi2);
            C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
            C0006a5.m85w(ir1Var2, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var2);
            C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
            ir1Var2.m6885d0(758586195);
            int size2 = w94Var2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj5 = w94Var2.get(i10);
                ir1Var2.m6879a0(1420119555, yp1Var2.invoke(obj5));
                mq1 mq1Var = (mq1) lw2Var.m8132g(obj5);
                if (mq1Var == null) {
                    ir1Var2.m6885d0(1074069702);
                    z = false;
                } else {
                    z = false;
                    ir1Var2.m6885d0(1420120731);
                    mq1Var.invoke(ir1Var2, 0);
                }
                ir1Var2.m6912r(z);
                ir1Var2.m6912r(z);
            }
            ir1Var2.m6912r(false);
            ir1Var2.m6912r(true);
            ir1Var = ir1Var2;
        } else {
            ir1 ir1Var6 = ir1Var3;
            ir1Var6.m6874W();
            ir1Var = ir1Var6;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1146si(dp4Var, nt2Var, yp1Var, interfaceC0520ca, yp1Var2, yp1Var3, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: H */
    public static f40 m5333H(int i, y30 y30Var, C0633f0 c0633f0, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            y30Var = y30.f34832a;
        }
        if ((i2 & 4) != 0) {
            c0633f0 = null;
        }
        if (i == -2) {
            if (y30Var != y30.f34832a) {
                return new jk0(1, y30Var, c0633f0);
            }
            b80.f15152Yo.getClass();
            return new f40(a80.f161b, c0633f0);
        }
        if (i == -1) {
            if (y30Var == y30.f34832a) {
                return new jk0(1, y30.f34833b, c0633f0);
            }
            C1077qn.m9987m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return y30Var == y30.f34832a ? new f40(0, c0633f0) : new jk0(1, y30Var, c0633f0);
        }
        if (i != Integer.MAX_VALUE) {
            return y30Var == y30.f34832a ? new f40(i, c0633f0) : new jk0(i, y30Var, c0633f0);
        }
        return new f40(Integer.MAX_VALUE, c0633f0);
    }

    /* JADX INFO: renamed from: I */
    public static final nh1 m5334I(float f, float f2, float f3, float f4) {
        nh1 nh1Var = new nh1();
        nh1Var.f25800a = f;
        nh1Var.f25801b = f2;
        nh1Var.f25802c = f3;
        nh1Var.f25803d = f4;
        VarHandle.storeStoreFence();
        return nh1Var;
    }

    /* JADX INFO: renamed from: J */
    public static int m5335J(String str) {
        EnumC0157i2[] enumC0157i2Arr = EnumC0157i2.f4749a;
        if (str.equals("landscape")) {
            return 6;
        }
        return str.equals("portrait") ? 7 : -1;
    }

    /* JADX INFO: renamed from: K */
    public static C0213l2 m5336K(wa2 wa2Var, int i, hx0 hx0Var) {
        C0213l2 c0213l2;
        EnumC0250nc enumC0250nc;
        EnumC0250nc enumC0250ncM10204c;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        vc2 vc2Var;
        double dMo3524c;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        boolean z;
        mk2 mk2Var = mk2.NONE;
        su1 su1Var = su1.f11748a;
        try {
            ArrayList arrayList11 = new ArrayList();
            EnumC0250nc enumC0250nc2 = EnumC0250nc.f7633b;
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            EnumC0139h2 enumC0139h2 = EnumC0139h2.f4232d;
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            ArrayList arrayList17 = new ArrayList();
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = new ArrayList();
            ArrayList arrayList20 = new ArrayList();
            ArrayList arrayList21 = new ArrayList();
            ArrayList arrayList22 = new ArrayList();
            ArrayList arrayList23 = new ArrayList();
            ArrayList arrayList24 = new ArrayList();
            ArrayList arrayList25 = new ArrayList();
            ArrayList arrayList26 = new ArrayList();
            final ql3 ql3Var = new ql3();
            ql3Var.f28555a = new wa2();
            wa2 wa2Var2 = new wa2();
            wa2 wa2Var3 = new wa2();
            r50 r50Var = i41.f21117b;
            ArrayList arrayList27 = arrayList25;
            ArrayList arrayList28 = arrayList26;
            ArrayList arrayList29 = arrayList20;
            ArrayList arrayList30 = arrayList21;
            ArrayList arrayList31 = arrayList22;
            c0213l2 = null;
            try {
                si2 si2Var = new si2(ri2.f10855c, mk2Var, false, "", "");
                EnumC0192k2 enumC0192k2 = EnumC0192k2.f6038d;
                wa2 wa2Var4 = new wa2();
                ArrayList arrayList32 = new ArrayList();
                Bundle bundle = Bundle.EMPTY;
                jc3 jc3Var = new jc3();
                gw2 gw2Var = gw2.f4161c;
                wa2 wa2Var5 = new wa2();
                wa2 wa2Var6 = new wa2();
                Iterator it = wa2Var.m12185y().iterator();
                EnumC0192k2 enumC0192k2M6709a = enumC0192k2;
                String strMo3532s = "";
                String strMo3532s2 = strMo3532s;
                String strMo3532s3 = strMo3532s2;
                String strMo3532s4 = strMo3532s3;
                String strMo3532s5 = strMo3532s4;
                String strMo3532s6 = strMo3532s5;
                String strMo3532s7 = strMo3532s6;
                String strMo3532s8 = strMo3532s7;
                String strMo3532s9 = strMo3532s8;
                wa2 wa2VarM3528l = wa2Var4;
                wa2 wa2VarM3528l2 = wa2Var2;
                wa2 wa2VarM3528l3 = wa2Var3;
                EnumC0250nc enumC0250nc3 = enumC0250nc2;
                jc3 jc3VarM10811g = jc3Var;
                gw2 gw2VarM6223m = gw2Var;
                wa2 wa2VarM3528l4 = wa2Var5;
                wa2 wa2Var7 = wa2Var6;
                si2 si2Var2 = si2Var;
                long jM3238Q = 0;
                long jM3238Q2 = 0;
                long jM3238Q3 = 0;
                double dMo3524c2 = 0.0d;
                C0176jd c0176jdM3251j = null;
                String strMo3532s10 = null;
                af1 af1Var = null;
                String strMo3532s11 = null;
                o92 o92VarM3527g = null;
                c93 c93VarM8495d = null;
                fe2 fe2VarM3813h = null;
                ls3 ls3VarM7934o = null;
                jr2 jr2VarM6611c = null;
                vc2 vc2Var2 = null;
                String strMo3532s12 = null;
                String strMo3532s13 = null;
                String strMo3532s14 = null;
                boolean zMo3523b = false;
                boolean zMo3523b2 = false;
                boolean zMo3523b3 = false;
                boolean zMo3523b4 = false;
                boolean zMo3523b5 = false;
                int iM5335J = -1;
                boolean zMo3523b6 = false;
                boolean zMo3523b7 = false;
                boolean zMo3523b8 = false;
                boolean zMo3523b9 = false;
                boolean zMo3523b10 = false;
                boolean zMo3523b11 = false;
                boolean zMo3523b12 = false;
                boolean zMo3523b13 = false;
                boolean zMo3523b14 = false;
                boolean zMo3523b15 = false;
                boolean z2 = false;
                boolean zMo3523b16 = false;
                boolean zMo3523b17 = false;
                int iMo3526e = 0;
                boolean zMo3523b18 = false;
                String string = strMo3532s9;
                String strMo3532s15 = string;
                String strMo3532s16 = strMo3532s15;
                String strMo3532s17 = strMo3532s16;
                String strMo3532s18 = strMo3532s17;
                String strMo3532s19 = strMo3532s18;
                String strMo3532s20 = strMo3532s19;
                String strMo3532s21 = strMo3532s20;
                Bundle bundleM2268b = bundle;
                EnumC0139h2 enumC0139h2M8987e = enumC0139h2;
                boolean zMo3523b19 = false;
                String strMo3532s22 = strMo3532s21;
                while (((ml2) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((ml2) it).next();
                    String str = (String) entry.getKey();
                    mk2Var = mk2Var;
                    ba2 ba2Var = (ba2) entry.getValue();
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2138196627:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("ad_source_instance_name")) {
                                    strMo3532s18 = ba2Var.mo3532s();
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1980587809:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("debug_signals")) {
                                    wa2VarM3528l2 = ba2Var.m3528l();
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1965512151:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("omid_settings")) {
                                    wa2 wa2VarM3528l5 = ba2Var.m3528l();
                                    int iM2255a = su1.m2255a(wa2VarM3528l5, "media_type", -1);
                                    ri2 ri2Var = iM2255a != 0 ? iM2255a != 1 ? ri2.f10855c : ri2.f10853a : ri2.f10854b;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    si2Var2 = new si2(ri2Var, gf5.f19772a[ri2Var.ordinal()] == 1 ? mk2Var : mk2.JAVASCRIPT, su1.m2267a(wa2VarM3528l5, "javascript_session_service_enabled", true), su1.m2258a(wa2VarM3528l5, "omid_partner_name", ""), su1.m2258a(wa2VarM3528l5, "omid_html", ""));
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1964744830:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("offline_ad_config")) {
                                    fe2VarM3813h = c20.m3813h(ba2Var.m3528l());
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1882692970:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("swipeable_interstitial_ad_config")) {
                                    ls3VarM7934o = lb5.m7934o(ba2Var.m3528l());
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1843156475:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                if (str.equals("is_consent")) {
                                    zMo3523b17 = ba2Var.mo3523b();
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1840512279:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList2 = arrayList27;
                                if (str.equals("presentation_urls")) {
                                    su1 su1Var2 = su1.f11748a;
                                    int i2 = 0;
                                    for (Object obj : ba2Var.m3527g()) {
                                        int i3 = i2 + 1;
                                        if (i2 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri = Uri.parse(((ba2) obj).mo3532s());
                                        if (uri != null) {
                                            arrayList3 = arrayList30;
                                            arrayList3.add(uri);
                                        } else {
                                            arrayList3 = arrayList30;
                                        }
                                        arrayList30 = arrayList3;
                                        i2 = i3;
                                    }
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1828733410:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("network_ping_config")) {
                                    if ((ba2Var instanceof wa2) && ba2Var.m3528l().m12178C()) {
                                        ba2 ba2VarM12186z = ba2Var.m3528l().m12186z("ping_strategy");
                                        ba2VarM12186z.getClass();
                                        if (ba2VarM12186z instanceof wa2) {
                                            wa2 wa2VarM3528l6 = ba2VarM12186z.m3528l();
                                            int iM2255a2 = su1.m2255a(wa2VarM3528l6, "max_attempts", 1);
                                            int iM2255a3 = su1.m2255a(wa2VarM3528l6, "initial_backoff_ms", 0);
                                            boolean zM2267a = su1.m2267a(wa2VarM3528l6, "buffer_after_max_attempts", false);
                                            try {
                                                dMo3524c = wa2VarM3528l6.m12186z("backoff_multiplier").mo3524c();
                                            } catch (Exception unused) {
                                                dMo3524c = 1.0d;
                                            }
                                            vc2Var = new vc2(new wc2(iM2255a2, iM2255a3, zM2267a, dMo3524c));
                                            break;
                                        }
                                        vc2Var2 = vc2Var;
                                        arrayList = arrayList30;
                                        arrayList27 = arrayList2;
                                        arrayList30 = arrayList;
                                        enumC0250nc3 = enumC0250ncM10204c;
                                        arrayList32 = arrayList32;
                                        arrayList11 = arrayList11;
                                        break;
                                    }
                                    vc2Var = null;
                                    vc2Var2 = vc2Var;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1812055556:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("play_prewarm_options")) {
                                    jr2VarM6611c = i25.m6611c(ba2Var.m3528l());
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1785028569:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("parallel_key")) {
                                    strMo3532s11 = ba2Var.mo3532s();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1776946669:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("ad_source_name")) {
                                    strMo3532s22 = ba2Var.mo3532s();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1732897806:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("post_click_lifecycle_interaction_macroed_params")) {
                                    strMo3532s13 = ba2Var.mo3532s();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1620552059:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("preload_sort_type")) {
                                    h50 h50Var = gw2.f4159a;
                                    int iMo3526e2 = ba2Var.mo3526e();
                                    h50Var.getClass();
                                    gw2VarM6223m = h50.m6223m(iMo3526e2);
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1620470467:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("backend_query_id")) {
                                    strMo3532s5 = ba2Var.mo3532s();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1550155393:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("nofill_urls")) {
                                    su1 su1Var3 = su1.f11748a;
                                    int i4 = 0;
                                    for (Object obj2 : ba2Var.m3527g()) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri2 = Uri.parse(((ba2) obj2).mo3532s());
                                        if (uri2 != null) {
                                            arrayList4 = arrayList29;
                                            arrayList4.add(uri2);
                                        } else {
                                            arrayList4 = arrayList29;
                                        }
                                        arrayList29 = arrayList4;
                                        i4 = i5;
                                    }
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1538424578:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("enable_lock_screen_ad")) {
                                    zMo3523b4 = ba2Var.mo3523b();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1456307492:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("post_click_lifecycle_interaction_label")) {
                                    strMo3532s12 = ba2Var.mo3532s();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1440104884:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("is_custom_close_blocked")) {
                                    zMo3523b8 = ba2Var.mo3523b();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1439500848:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("orientation")) {
                                    List list = C0213l2.f6574J0;
                                    iM5335J = m5335J(ba2Var.mo3532s());
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1428969291:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("enable_omid")) {
                                    zMo3523b9 = ba2Var.mo3523b();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1406227629:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("buffer_click_url_as_ready_to_ping")) {
                                    zMo3523b2 = ba2Var.mo3523b();
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                arrayList27 = arrayList2;
                                arrayList30 = arrayList;
                                enumC0250nc3 = enumC0250ncM10204c;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                break;
                            case -1403779768:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("showable_impression_type")) {
                                    ia5 ia5Var = EnumC0192k2.f6036b;
                                    int iMo3526e3 = ba2Var.mo3526e();
                                    ia5Var.getClass();
                                    enumC0192k2M6709a = ia5.m6709a(iMo3526e3);
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1360811658:
                                enumC0250ncM10204c = enumC0250nc3;
                                arrayList32 = arrayList32;
                                arrayList2 = arrayList27;
                                if (str.equals("ad_sizes")) {
                                    su1 su1Var4 = su1.f11748a;
                                    int i6 = 0;
                                    for (Object obj3 : ba2Var.m3527g()) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        C0321s2 c0321s2M10718e = se0.m10718e(((ba2) obj3).m3528l());
                                        if (c0321s2M10718e != null) {
                                            arrayList5 = arrayList28;
                                            arrayList5.add(c0321s2M10718e);
                                        } else {
                                            arrayList5 = arrayList28;
                                        }
                                        arrayList28 = arrayList5;
                                        i6 = i7;
                                    }
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                arrayList27 = arrayList2;
                                arrayList30 = arrayList;
                                enumC0250nc3 = enumC0250ncM10204c;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                break;
                            case -1306015996:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("adapters")) {
                                    su1 su1Var5 = su1.f11748a;
                                    int i8 = 0;
                                    for (Object obj4 : ba2Var.m3527g()) {
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        String strMo3532s23 = ((ba2) obj4).mo3532s();
                                        if (strMo3532s23 != null) {
                                            arrayList6 = arrayList27;
                                            arrayList6.add(strMo3532s23);
                                        } else {
                                            arrayList6 = arrayList27;
                                        }
                                        arrayList27 = arrayList6;
                                        i8 = i9;
                                    }
                                    arrayList2 = arrayList27;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1303332046:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("test_mode_enabled")) {
                                    zMo3523b14 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1289032093:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("extras")) {
                                    wa2VarM3528l3 = ba2Var.m3528l();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1240082064:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_event_value")) {
                                    c0176jdM3251j = as4.m3251j(ba2Var.m3528l());
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1234181075:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("allow_pub_rendered_attribution")) {
                                    zMo3523b19 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1168140544:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("presentation_error_urls")) {
                                    su1 su1Var6 = su1.f11748a;
                                    int i10 = 0;
                                    for (Object obj5 : ba2Var.m3527g()) {
                                        int i11 = i10 + 1;
                                        if (i10 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri3 = Uri.parse(((ba2) obj5).mo3532s());
                                        if (uri3 != null) {
                                            arrayList7 = arrayList31;
                                            arrayList7.add(uri3);
                                        } else {
                                            arrayList7 = arrayList31;
                                        }
                                        arrayList31 = arrayList7;
                                        i10 = i11;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1152230954:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_type")) {
                                    r50 r50Var2 = EnumC0250nc.f7632a;
                                    String upperCase = ba2Var.mo3532s().toUpperCase(Locale.ROOT);
                                    r50Var2.getClass();
                                    enumC0250ncM10204c = r50.m10204c(upperCase);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1146534047:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("is_scroll_aware")) {
                                    zMo3523b10 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1115838944:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("fill_urls")) {
                                    su1 su1Var7 = su1.f11748a;
                                    int i12 = 0;
                                    for (Object obj6 : ba2Var.m3527g()) {
                                        int i13 = i12 + 1;
                                        if (i12 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri4 = Uri.parse(((ba2) obj6).mo3532s());
                                        if (uri4 != null) {
                                            arrayList8 = arrayList18;
                                            arrayList8.add(uri4);
                                        } else {
                                            arrayList8 = arrayList18;
                                        }
                                        arrayList18 = arrayList8;
                                        i12 = i13;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1081936678:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("allocation_id")) {
                                    strMo3532s20 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1079896384:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_quality_urls")) {
                                    su1 su1Var8 = su1.f11748a;
                                    int i14 = 0;
                                    for (Object obj7 : ba2Var.m3527g()) {
                                        int i15 = i14 + 1;
                                        if (i14 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri5 = Uri.parse(((ba2) obj7).mo3532s());
                                        if (uri5 != null) {
                                            arrayList9 = arrayList19;
                                            arrayList9.add(uri5);
                                        } else {
                                            arrayList9 = arrayList19;
                                        }
                                        arrayList19 = arrayList9;
                                        i14 = i15;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1078050970:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("video_complete_urls")) {
                                    su1 su1Var9 = su1.f11748a;
                                    int i16 = 0;
                                    for (Object obj8 : ba2Var.m3527g()) {
                                        int i17 = i16 + 1;
                                        if (i16 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri6 = Uri.parse(((ba2) obj8).mo3532s());
                                        if (uri6 != null) {
                                            arrayList10 = arrayList17;
                                            arrayList10.add(uri6);
                                        } else {
                                            arrayList10 = arrayList17;
                                        }
                                        arrayList17 = arrayList10;
                                        i16 = i17;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -1051269058:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("active_view")) {
                                    string = ba2Var.toString();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -982608540:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("valid_from_timestamp")) {
                                    strMo3532s7 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -972056451:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_source_instance_id")) {
                                    strMo3532s19 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -776859333:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("click_urls")) {
                                    su1 su1Var10 = su1.f11748a;
                                    int i18 = 0;
                                    for (Object obj9 : ba2Var.m3527g()) {
                                        int i19 = i18 + 1;
                                        if (i18 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri7 = Uri.parse(((ba2) obj9).mo3532s());
                                        if (uri7 != null) {
                                            arrayList12.add(uri7);
                                        }
                                        i18 = i19;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -544216775:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("safe_browsing")) {
                                    jc3VarM10811g = sj3.m10811g(ba2Var.m3528l());
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -437057161:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("imp_urls")) {
                                    su1 su1Var11 = su1.f11748a;
                                    int i20 = 0;
                                    for (Object obj10 : ba2Var.m3527g()) {
                                        int i21 = i20 + 1;
                                        if (i20 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri8 = Uri.parse(((ba2) obj10).mo3532s());
                                        if (uri8 != null) {
                                            arrayList13.add(uri8);
                                        }
                                        i20 = i21;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -404433734:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("rtb_native_required_assets")) {
                                    wa2VarM3528l = ba2Var.m3528l();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -404326515:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("render_timeout_ms")) {
                                    r50 r50Var3 = i41.f21117b;
                                    jM3238Q2 = as4.m3238Q(ba2Var.mo3526e(), m41.MILLISECONDS);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -388807511:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("content_url")) {
                                    strMo3532s10 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -213449460:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("force_disable_hardware_acceleration")) {
                                    zMo3523b5 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -213424028:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("watermark")) {
                                    strMo3532s9 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case -180214626:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("native_required_asset_viewability")) {
                                    zMo3523b3 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 3107:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad")) {
                                    af1 af1VarM5532c = C0638f5.m5532c(ba2Var.m3528l(), hx0Var);
                                    wa2 wa2Var8 = af1VarM5532c.f549d;
                                    if (wa2Var8 != null) {
                                        af1Var = af1VarM5532c;
                                        o92 o92VarM2271e = su1.m2271e(wa2Var8, "slots");
                                        if (o92VarM2271e != null && o92VarM2271e.size() > 0) {
                                            z = true;
                                        }
                                        z2 = z;
                                        arrayList = arrayList30;
                                        arrayList2 = arrayList27;
                                        arrayList27 = arrayList2;
                                        arrayList30 = arrayList;
                                        enumC0250nc3 = enumC0250ncM10204c;
                                        arrayList32 = arrayList32;
                                        arrayList11 = arrayList11;
                                    } else {
                                        af1Var = af1VarM5532c;
                                    }
                                    z = false;
                                    z2 = z;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 3355:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("id")) {
                                    strMo3532s2 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 3076010:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("data")) {
                                    ql3Var.f28555a = ba2Var.m3528l();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 37109963:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("request_id")) {
                                    strMo3532s3 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 63195984:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("render_test_label")) {
                                    zMo3523b12 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 107433883:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("qdata")) {
                                    strMo3532s4 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 230323073:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_load_urls")) {
                                    su1 su1Var12 = su1.f11748a;
                                    int i22 = 0;
                                    for (Object obj11 : ba2Var.m3527g()) {
                                        int i23 = i22 + 1;
                                        if (i22 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri9 = Uri.parse(((ba2) obj11).mo3532s());
                                        if (uri9 != null) {
                                            arrayList14.add(uri9);
                                        }
                                        i22 = i23;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 418392395:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("is_closable_area_disabled")) {
                                    zMo3523b6 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 542250332:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("consent_form_action_identifier")) {
                                    iMo3526e = ba2Var.mo3526e();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 549176928:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("presentation_error_timeout_ms")) {
                                    r50 r50Var4 = i41.f21117b;
                                    jM3238Q = as4.m3238Q(ba2Var.mo3526e(), m41.MILLISECONDS);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 597473788:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("debug_dialog_string")) {
                                    strMo3532s = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 639133141:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("response_info_extras_override")) {
                                    wa2 wa2VarM2260a = su1.m2260a(ba2Var);
                                    if (wa2VarM2260a == null) {
                                        wa2VarM2260a = new wa2();
                                    }
                                    wa2Var7 = wa2VarM2260a;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 754887508:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("container_sizes")) {
                                    su1 su1Var13 = su1.f11748a;
                                    int i24 = 0;
                                    for (Object obj12 : ba2Var.m3527g()) {
                                        int i25 = i24 + 1;
                                        if (i24 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        C0321s2 c0321s2M10718e2 = se0.m10718e(((ba2) obj12).m3528l());
                                        if (c0321s2M10718e2 != null) {
                                            arrayList24.add(c0321s2M10718e2);
                                        }
                                        i24 = i25;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 791122864:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("impression_type")) {
                                    o85 o85Var = EnumC0139h2.f4230b;
                                    int iMo3526e4 = ba2Var.mo3526e();
                                    o85Var.getClass();
                                    enumC0139h2M8987e = o85.m8987e(iMo3526e4);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 805095541:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("analytics_event_name_to_parameters_map")) {
                                    su1 su1Var14 = su1.f11748a;
                                    bundleM2268b = su1.m2268b(ba2Var.m3528l());
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1010584092:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("transaction_id")) {
                                    strMo3532s6 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1100650276:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("rewards")) {
                                    c93VarM8495d = n40.m8495d(ba2Var);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1141602460:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("adapter_response_info_key")) {
                                    strMo3532s15 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1186014765:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("cache_hit_urls")) {
                                    su1 su1Var15 = su1.f11748a;
                                    int i26 = 0;
                                    for (Object obj13 : ba2Var.m3527g()) {
                                        int i27 = i26 + 1;
                                        if (i26 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri10 = Uri.parse(((ba2) obj13).mo3532s());
                                        if (uri10 != null) {
                                            arrayList32.add(uri10);
                                        }
                                        i26 = i27;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1303622534:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("preload_sort_value")) {
                                    dMo3524c2 = ba2Var.mo3524c();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1320579560:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("base_creative_conversion_url")) {
                                    strMo3532s14 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1321720943:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("allow_pub_owned_ad_view")) {
                                    zMo3523b = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1364100807:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("recursive_request_parameters")) {
                                    wa2VarM3528l4 = ba2Var.m3528l();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1422388341:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("is_collapsible")) {
                                    zMo3523b7 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1437255331:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_source_id")) {
                                    strMo3532s17 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1556932485:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("post_click_lifecycle_monitoring_duration_ms")) {
                                    r50 r50Var5 = i41.f21117b;
                                    jM3238Q3 = as4.m3238Q(ba2Var.mo3526e(), m41.MILLISECONDS);
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1565514205:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("adapter_only_third_party_impression")) {
                                    zMo3523b18 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1637553475:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("bid_response")) {
                                    strMo3532s21 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1638957285:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("video_start_urls")) {
                                    su1 su1Var16 = su1.f11748a;
                                    int i28 = 0;
                                    for (Object obj14 : ba2Var.m3527g()) {
                                        int i29 = i28 + 1;
                                        if (i28 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri11 = Uri.parse(((ba2) obj14).mo3532s());
                                        if (uri11 != null) {
                                            arrayList15.add(uri11);
                                        }
                                        i28 = i29;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1686319423:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("ad_network_class_name")) {
                                    strMo3532s16 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1688341040:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("video_reward_urls")) {
                                    su1 su1Var17 = su1.f11748a;
                                    int i30 = 0;
                                    for (Object obj15 : ba2Var.m3527g()) {
                                        int i31 = i30 + 1;
                                        if (i30 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri12 = Uri.parse(((ba2) obj15).mo3532s());
                                        if (uri12 != null) {
                                            arrayList16.add(uri12);
                                        }
                                        i30 = i31;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1799285870:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("use_third_party_container_height")) {
                                    zMo3523b15 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1839650832:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("renderers")) {
                                    su1 su1Var18 = su1.f11748a;
                                    int i32 = 0;
                                    for (Object obj16 : ba2Var.m3527g()) {
                                        int i33 = i32 + 1;
                                        if (i32 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        String strMo3532s24 = ((ba2) obj16).mo3532s();
                                        if (strMo3532s24 != null) {
                                            arrayList11.add(strMo3532s24);
                                        }
                                        i32 = i33;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 1875425491:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("is_analytics_logging_enabled")) {
                                    zMo3523b13 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 2004337096:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("recursive_signal_collection")) {
                                    o92VarM3527g = ba2Var.m3527g();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 2068142375:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("rule_line_external_id")) {
                                    strMo3532s8 = ba2Var.mo3532s();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 2072888499:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("manual_tracking_urls")) {
                                    su1 su1Var19 = su1.f11748a;
                                    int i34 = 0;
                                    for (Object obj17 : ba2Var.m3527g()) {
                                        int i35 = i34 + 1;
                                        if (i34 < 0) {
                                            kx5.m7735t0();
                                            throw null;
                                        }
                                        Uri uri13 = Uri.parse(((ba2) obj17).mo3532s());
                                        if (uri13 != null) {
                                            arrayList23.add(uri13);
                                        }
                                        i34 = i35;
                                    }
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 2075506442:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("render_serially")) {
                                    zMo3523b11 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                } else {
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                break;
                            case 2117205836:
                                enumC0250ncM10204c = enumC0250nc3;
                                if (str.equals("flow_control")) {
                                    zMo3523b16 = ba2Var.mo3523b();
                                    arrayList = arrayList30;
                                    arrayList2 = arrayList27;
                                    arrayList27 = arrayList2;
                                    arrayList30 = arrayList;
                                    enumC0250nc3 = enumC0250ncM10204c;
                                    arrayList32 = arrayList32;
                                    arrayList11 = arrayList11;
                                }
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                arrayList = arrayList30;
                                arrayList2 = arrayList27;
                                AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                                arrayList27 = arrayList2;
                                arrayList30 = arrayList;
                                enumC0250nc3 = enumC0250ncM10204c;
                                arrayList32 = arrayList32;
                                arrayList11 = arrayList11;
                                break;
                            default:
                                break;
                        }
                    }
                    enumC0250ncM10204c = enumC0250nc3;
                    arrayList32 = arrayList32;
                    arrayList11 = arrayList11;
                    arrayList = arrayList30;
                    arrayList2 = arrayList27;
                    AbstractC0137h.m1113b(new C0095e2(str, (byte) 0));
                    arrayList27 = arrayList2;
                    arrayList30 = arrayList;
                    enumC0250nc3 = enumC0250ncM10204c;
                    arrayList32 = arrayList32;
                    arrayList11 = arrayList11;
                }
                EnumC0250nc enumC0250nc4 = enumC0250nc3;
                ArrayList arrayList33 = arrayList32;
                ArrayList arrayList34 = arrayList11;
                ArrayList arrayList35 = arrayList30;
                ArrayList arrayList36 = arrayList27;
                if (enumC0139h2M8987e != EnumC0139h2.f4234f) {
                    enumC0250nc = enumC0250nc4;
                    if (enumC0250nc == EnumC0250nc.f7634c && zMo3523b18) {
                    }
                    EnumC0192k2 enumC0192k3 = enumC0192k2M6709a;
                    arrayList36.replaceAll(new UnaryOperator() { // from class: z75
                        @Override // java.util.function.Function
                        public final Object apply(Object obj18) {
                            String str2 = (String) obj18;
                            List list2 = C0213l2.f6574J0;
                            return C0213l2.f6574J0.contains(str2) ? su1.m2258a((wa2) ql3Var.f28555a, "class_name", str2) : str2;
                        }
                    });
                    return new C0213l2(string, arrayList36, (wa2) ql3Var.f28555a, strMo3532s15, arrayList14, strMo3532s16, arrayList28, strMo3532s22, strMo3532s17, strMo3532s18, strMo3532s19, enumC0250nc, c0176jdM3251j, strMo3532s20, zMo3523b, zMo3523b19, bundleM2268b, strMo3532s21, zMo3523b2, arrayList33, zMo3523b3, arrayList12, i, strMo3532s10, arrayList24, strMo3532s, wa2VarM3528l2, zMo3523b4, wa2VarM3528l3, arrayList18, arrayList19, zMo3523b5, strMo3532s2, enumC0139h2M8987e, arrayList13, af1Var, strMo3532s3, iM5335J, zMo3523b6, zMo3523b7, zMo3523b8, zMo3523b9, zMo3523b10, arrayList23, arrayList29, si2Var2, strMo3532s11, arrayList35, jM3238Q, arrayList31, strMo3532s4, wa2VarM3528l4, o92VarM3527g, arrayList34, zMo3523b11, zMo3523b12, jM3238Q2, strMo3532s5, arrayList16, strMo3532s6, strMo3532s7, arrayList17, arrayList15, c93VarM8495d, wa2VarM3528l, strMo3532s8, jc3VarM10811g, zMo3523b13, enumC0192k3, zMo3523b14, zMo3523b15, strMo3532s9, fe2VarM3813h, ls3VarM7934o, jr2VarM6611c, vc2Var2, dMo3524c2, gw2VarM6223m, z2, zMo3523b16, jM3238Q3, strMo3532s12, strMo3532s13, strMo3532s14, wa2Var7, zMo3523b17, iMo3526e);
                }
                enumC0250nc = enumC0250nc4;
                enumC0192k2M6709a = EnumC0192k2.f6039g;
                EnumC0192k2 enumC0192k4 = enumC0192k2M6709a;
                arrayList36.replaceAll(new UnaryOperator() { // from class: z75
                    @Override // java.util.function.Function
                    public final Object apply(Object obj18) {
                        String str2 = (String) obj18;
                        List list2 = C0213l2.f6574J0;
                        return C0213l2.f6574J0.contains(str2) ? su1.m2258a((wa2) ql3Var.f28555a, "class_name", str2) : str2;
                    }
                });
                return new C0213l2(string, arrayList36, (wa2) ql3Var.f28555a, strMo3532s15, arrayList14, strMo3532s16, arrayList28, strMo3532s22, strMo3532s17, strMo3532s18, strMo3532s19, enumC0250nc, c0176jdM3251j, strMo3532s20, zMo3523b, zMo3523b19, bundleM2268b, strMo3532s21, zMo3523b2, arrayList33, zMo3523b3, arrayList12, i, strMo3532s10, arrayList24, strMo3532s, wa2VarM3528l2, zMo3523b4, wa2VarM3528l3, arrayList18, arrayList19, zMo3523b5, strMo3532s2, enumC0139h2M8987e, arrayList13, af1Var, strMo3532s3, iM5335J, zMo3523b6, zMo3523b7, zMo3523b8, zMo3523b9, zMo3523b10, arrayList23, arrayList29, si2Var2, strMo3532s11, arrayList35, jM3238Q, arrayList31, strMo3532s4, wa2VarM3528l4, o92VarM3527g, arrayList34, zMo3523b11, zMo3523b12, jM3238Q2, strMo3532s5, arrayList16, strMo3532s6, strMo3532s7, arrayList17, arrayList15, c93VarM8495d, wa2VarM3528l, strMo3532s8, jc3VarM10811g, zMo3523b13, enumC0192k4, zMo3523b14, zMo3523b15, strMo3532s9, fe2VarM3813h, ls3VarM7934o, jr2VarM6611c, vc2Var2, dMo3524c2, gw2VarM6223m, z2, zMo3523b16, jM3238Q3, strMo3532s12, strMo3532s13, strMo3532s14, wa2Var7, zMo3523b17, iMo3526e);
            } catch (Exception e) {
                e = e;
                ArrayList arrayList37 = i20.m6589n(e).f5884s;
                String message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                arrayList37.add(message);
                return c0213l2;
            }
        } catch (Exception e2) {
            e = e2;
            c0213l2 = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static File m5337L(File file, String str, String str2) {
        File file2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            file2 = new File(file, str);
            m5338M(file2, false);
        }
        return new File(file2, str2);
    }

    /* JADX INFO: renamed from: M */
    public static void m5338M(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: N */
    public static boolean m5339N(File file) {
        boolean z;
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                z = true;
                for (int i = 0; i < length; i++) {
                    File file2 = fileArrListFiles[i];
                    z = file2 != null && m5339N(file2) && z;
                }
            } else {
                z = true;
            }
            if (!file.delete() || !z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m5340O(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                kx5.m7675A(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                kx5.m7675A(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                kx5.m7675A(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [zh0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [cr1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: P */
    public static final List m5341P(p84 p84Var, Integer num, int i, Integer num2) {
        int iM9395F;
        int iM9429r;
        cw2 cw2Var;
        if (p84Var.f27455w || p84Var.m9426o() == 0) {
            return v71.f32439a;
        }
        int i2 = 0;
        ?? uj3Var = new uj3((byte) 0);
        VarHandle.storeStoreFence();
        if (num2 != null) {
            iM9395F = num2.intValue();
        } else {
            iM9395F = p84Var.f27454v;
            if (iM9395F < 0) {
                iM9395F = p84Var.m9395F(p84Var.f27434b, i);
            }
        }
        if (num == 0) {
            int iM9404O = p84Var.f27441i - p84Var.m9404O(p84Var.f27434b, p84Var.m9428q(i));
            lv2 lv2Var = p84Var.f27451s;
            if (lv2Var != null && (cw2Var = (cw2) lv2Var.m8197b(i)) != null) {
                i2 = cw2Var.f16533b;
            }
            num = Integer.valueOf(iM9404O + i2);
        }
        int iM9428q = p84Var.m9428q(i) * 5;
        int[] iArr = p84Var.f27434b;
        if (iM9428q < iArr.length) {
            iM9429r = p84Var.m9429r(i);
        } else {
            int iM9395F2 = iM9395F >= 0 ? p84Var.m9395F(iArr, iM9395F) : iM9395F;
            iM9429r = p84Var.m9429r(iM9395F);
            int i3 = iM9395F;
            iM9395F = iM9395F2;
            i = i3;
        }
        while (i >= 0) {
            uj3Var.m13557n(iM9429r, (p84Var.f27434b[(p84Var.m9428q(i) * 5) + 1] & 536870912) != 0 ? p84Var.m9430s(i) : ki0.f23136a, p84Var.m9405P(i), num);
            num = p84Var.m9414b(i);
            if (iM9395F >= 0) {
                int iM9395F3 = p84Var.m9395F(p84Var.f27434b, iM9395F);
                iM9429r = p84Var.m9429r(iM9395F);
                int i4 = iM9395F;
                iM9395F = iM9395F3;
                i = i4;
            } else {
                i = iM9395F;
            }
        }
        return (ArrayList) uj3Var.f36084a;
    }

    /* JADX INFO: renamed from: Q */
    public static void m5342Q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xy4.m12782k(str);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m5343R(x11 x11Var, long j) {
        if (!x11Var.f25195a.f25208n) {
            return false;
        }
        w32 w32Var = (w32) sc6.m10652X(x11Var).f33299G.f25607d;
        if (!w32Var.f33059e0.f25208n) {
            return false;
        }
        long jMo4005S = w32Var.mo4005S(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo4005S >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo4005S & 4294967295L));
        long j2 = x11Var.f33910r;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: S */
    public static void m5344S(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        nm0.m8795g(file, "Unable to create parent directories of ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5345U(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 != 0) {
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (l52.f23796a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                    return i3;
                case 3:
                    break;
                case 4:
                    return i3 + i5;
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i4);
                    int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                    if (iAbs2 == 0) {
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    }
                    return i3;
                default:
                    throw new AssertionError();
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: V */
    public static final float[] m5346V(float f, float f2, float f3, float[] fArr) {
        return new float[]{(fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f), (fArr[5] * f3) + (fArr[4] * f2) + (fArr[3] * f), (fArr[8] * f3) + (fArr[7] * f2) + (fArr[6] * f)};
    }

    /* JADX INFO: renamed from: W */
    public static final float[] m5347W(float f, float f2, float f3, float[] fArr) {
        return new float[]{fArr[0] * f, fArr[1] * f2, fArr[2] * f3, fArr[3] * f, fArr[4] * f2, fArr[5] * f3, fArr[6] * f, fArr[7] * f2, fArr[8] * f3};
    }

    /* JADX INFO: renamed from: X */
    public static final float m5348X(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 * 3;
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + (fArr2[i] * fArr[i3]);
    }

    /* JADX INFO: renamed from: Y */
    public static final Integer m5349Y(l84 l84Var, ui0 ui0Var, int i, int i2) {
        Integer numM5349Y;
        int[] iArr = l84Var.f23848b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iM8981b = o84.m8981b(iArr, i) + i;
            if (l84Var.m7854j(i) && l84Var.m7853i(i) == 206 && z62.m13387o(l84Var.m7860p(iArr, i), qi0.f28502e)) {
                Object objM7852h = l84Var.m7852h(i, 0);
                mr1 mr1Var = objM7852h instanceof mr1 ? (mr1) objM7852h : null;
                pm3 pm3Var = mr1Var != null ? mr1Var.f25168a : null;
                fr1 fr1Var = pm3Var instanceof fr1 ? (fr1) pm3Var : null;
                if (fr1Var != null && fr1Var.f19234a == ui0Var) {
                    return Integer.valueOf(i);
                }
            }
            if (l84Var.m7848d(i) && (numM5349Y = m5349Y(l84Var, ui0Var, i + 1, iM8981b)) != null) {
                return Integer.valueOf(numM5349Y.intValue());
            }
            i = iM8981b;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final String m5350Z(long j) {
        String strM4369n;
        if (j <= -999500000) {
            strM4369n = d55.m4369n(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            strM4369n = d55.m4369n(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            strM4369n = d55.m4369n(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            strM4369n = d55.m4369n(new StringBuilder(), (j + 500) / 1000, " µs");
        } else {
            strM4369n = j < 999500000 ? d55.m4369n(new StringBuilder(), (j + 500000) / 1000000, " ms") : d55.m4369n(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM4369n}, 1));
    }

    /* JADX INFO: renamed from: a0 */
    public static BigInteger m5351a0(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: b0 */
    public static final py4 m5352b0(View view) {
        while (view != null) {
            Object tag = view.getTag(C0995R.id.view_tree_view_model_store_owner);
            py4 py4Var = tag instanceof py4 ? (py4) tag : null;
            if (py4Var != null) {
                return py4Var;
            }
            Object objM8506p = n40.m8506p(view);
            view = objM8506p instanceof View ? (View) objM8506p : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static e94 m5353c0() {
        return (e94) k94.f23011b.get();
    }

    /* JADX INFO: renamed from: d0 */
    public static final String m5354d0(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m5355e0(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m5356f0(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Object[] m5357g0(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0990oo.m9201V(0, i, 6, objArr, objArr2);
        AbstractC0990oo.m9198S(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: h0 */
    public static float[] m5358h0(float[] fArr) {
        double d = fArr[0];
        double d2 = fArr[1];
        double d3 = fArr[2];
        double d4 = fArr[3];
        double d5 = fArr[4];
        double d6 = fArr[5];
        double d7 = fArr[6];
        double d8 = fArr[7];
        double d9 = fArr[8];
        double d10 = (d5 * d9) - (d8 * d6);
        double d11 = (d8 * d3) - (d2 * d9);
        double d12 = (d2 * d6) - (d5 * d3);
        double d13 = (d7 * d12) + (d4 * d11) + (d * d10);
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        fArrCopyOf[0] = (float) (d10 / d13);
        fArrCopyOf[3] = (float) d55.m4361f(d4, d9, d7 * d6, d13);
        fArrCopyOf[6] = (float) d55.m4361f(d7, d5, d4 * d8, d13);
        fArrCopyOf[1] = (float) (d11 / d13);
        fArrCopyOf[4] = (float) d55.m4361f(d7, d3, d * d9, d13);
        fArrCopyOf[7] = (float) d55.m4361f(d, d8, d7 * d2, d13);
        fArrCopyOf[2] = (float) (d12 / d13);
        fArrCopyOf[5] = (float) d55.m4361f(d, d6, d4 * d3, d13);
        fArrCopyOf[8] = (float) d55.m4361f(d4, d2, d * d5, d13);
        return fArrCopyOf;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m5359i0(ii4 ii4Var, oi4 oi4Var, String str) {
        pi4 pi4Var = pi4.f27637h;
        pi4.f27638i.fine(oi4Var.f26764b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ii4Var.f21460a);
    }

    /* JADX INFO: renamed from: j0 */
    public static int m5360j0(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            C1077qn.m9987m(c75.m3878j("x (", i, ") must be > 0"));
            return 0;
        }
        switch (l52.f23796a[roundingMode.ordinal()]) {
            case 1:
                if (!((i > 0) & (((i + (-1)) & i) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: k0 */
    public static e94 m5361k0(e94 e94Var) {
        if (e94Var instanceof gp4) {
            gp4 gp4Var = (gp4) e94Var;
            if (gp4Var.f20012t == oh6.m9110p()) {
                gp4Var.f20010r = null;
                return e94Var;
            }
        }
        if (e94Var instanceof hp4) {
            hp4 hp4Var = (hp4) e94Var;
            if (hp4Var.f20773i == oh6.m9110p()) {
                hp4Var.f20772h = null;
                return e94Var;
            }
        }
        e94 e94VarM7448e = k94.m7448e(e94Var, null, false);
        e94VarM7448e.m5018j();
        return e94VarM7448e;
    }

    /* JADX INFO: renamed from: l0 */
    public static Object m5362l0(uy0 uy0Var, wp1 wp1Var) {
        e94 gp4Var;
        e94 e94Var = (e94) k94.f23011b.get();
        if (e94Var instanceof gp4) {
            gp4 gp4Var2 = (gp4) e94Var;
            if (gp4Var2.f20012t == oh6.m9110p()) {
                yp1 yp1Var = gp4Var2.f20010r;
                yp1 yp1Var2 = gp4Var2.f20011s;
                try {
                    ((gp4) e94Var).f20010r = k94.m7452i(uy0Var, yp1Var, true);
                    ((gp4) e94Var).f20011s = yp1Var2;
                    return wp1Var.invoke();
                } finally {
                    gp4Var2.f20010r = yp1Var;
                    gp4Var2.f20011s = yp1Var2;
                }
            }
        }
        if (e94Var == null || (e94Var instanceof rw2)) {
            gp4Var = new gp4(e94Var instanceof rw2 ? (rw2) e94Var : null, uy0Var, null, true, false);
        } else {
            gp4Var = e94Var.mo3785u(uy0Var);
        }
        try {
            e94 e94VarM5018j = gp4Var.m5018j();
            try {
                Object objInvoke = wp1Var.invoke();
                e94.m5011q(e94VarM5018j);
                gp4Var.mo3384c();
                return objInvoke;
            } catch (Throwable th) {
                e94.m5011q(e94VarM5018j);
                throw th;
            }
        } catch (Throwable th2) {
            gp4Var.mo3384c();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static final void m5363m0(g04 g04Var, long j, yp1 yp1Var) {
        g43 g43Var = new g43();
        g43Var.f19610a = j;
        VarHandle.storeStoreFence();
        f43 f43Var = f43.f18746b;
        as4.m3259r(3, f43Var);
        e04 e04Var = new e04(g04Var, g43Var, f43Var, h04.f20247b, i04.f20990e, (of4) yp1Var, null);
        int i = g04.f19471g;
        g04Var.m5879h(e04Var, false);
    }

    /* JADX INFO: renamed from: n0 */
    public static final wk2 m5364n0(a05 a05Var, int i) {
        wk2 wk2Var = new wk2();
        wk2Var.f33445a = a05Var;
        wk2Var.f33446b = i;
        VarHandle.storeStoreFence();
        return wk2Var;
    }

    /* JADX INFO: renamed from: o0 */
    public static final yp1 m5365o0(ir1 ir1Var) {
        ag0 ag0Var = (ag0) ir1Var.m6898k(pm2.f27747a);
        xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
        boolean zM6890g = ir1Var.m6890g(ag0Var);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new C0792jb(ag0Var, xz4Var, null, (byte) 2);
            ir1Var.m6905n0(objM6869O);
        }
        return (yp1) objM6869O;
    }

    /* JADX INFO: renamed from: p0 */
    public static final yp1 m5366p0(mi0 mi0Var) {
        Context context = (Context) ((ir1) mi0Var).m6898k(AndroidCompositionLocals_androidKt.f14651b);
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = lb5.m7942w(r71.f29063a, ir1Var);
            ir1Var.m6905n0(objM6869O);
        }
        zo0 zo0Var = (zo0) objM6869O;
        ir1 ir1Var2 = (ir1) mi0Var;
        boolean zM6890g = ir1Var2.m6890g(context) | ir1Var2.m6890g(zo0Var);
        Object objM6869O2 = ir1Var2.m6869O();
        Object obj = objM6869O2;
        if (zM6890g || objM6869O2 == i50Var) {
            C0558d0 c0558d0 = new C0558d0((byte) 6);
            c0558d0.f16655b = zo0Var;
            c0558d0.f16656c = context;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c0558d0);
            obj = c0558d0;
        }
        return (yp1) obj;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Object m5367q0(String str, boolean z, wp1 wp1Var, wp1 wp1Var2, ir1 ir1Var, int i) {
        xn2 xn2Var;
        ir1Var.m6898k(AbstractC1138sa.f30027b);
        i92 i92Var = (i92) ir1Var.m6898k(hj0.f20620b);
        xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
        Object obj = ki0.f23136a;
        wm0 wm0Var = null;
        if (xn2Var2 == null) {
            ir1Var.m6885d0(-1476823888);
            ir1Var.m6912r(false);
            xn2Var = null;
        } else {
            ir1Var.m6885d0(-1476823887);
            boolean zM6890g = ir1Var.m6890g("RemoteConfig") | ir1Var.m6890g(xn2Var2);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == obj) {
                objM6869O = xn2Var2.m12723c("RemoteConfig");
                ir1Var.m6905n0(objM6869O);
            }
            ir1Var.m6912r(false);
            xn2Var = (xn2) objM6869O;
        }
        byte b = 1;
        boolean zM6894i = ir1Var.m6894i(xn2Var) | ir1Var.m6890g(str) | ir1Var.m6894i(i92Var) | ((((i & 112) ^ 48) > 32 && ir1Var.m6892h(z)) || (i & 48) == 32);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6894i || objM6869O2 == obj) {
            Object wm3Var = new wm3(wp1Var, wp1Var2, xn2Var, i92Var, str, z, null);
            ir1Var.m6905n0(wm3Var);
            objM6869O2 = wm3Var;
        }
        mq1 mq1Var = (mq1) objM6869O2;
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == obj) {
            objM6869O3 = k43.m7398w(null);
            ir1Var.m6905n0(objM6869O3);
        }
        sw2 sw2Var = (sw2) objM6869O3;
        boolean zM6894i2 = ir1Var.m6894i(mq1Var);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6894i2 || objM6869O4 == obj) {
            objM6869O4 = new t94(mq1Var, sw2Var, wm0Var, b);
            ir1Var.m6905n0(objM6869O4);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O4, str);
        return sw2Var.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    public static final Object[] m5368r0(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0990oo.m9201V(0, i, 6, objArr, objArr2);
        AbstractC0990oo.m9198S(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Object[] m5369s0(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0990oo.m9201V(0, i, 6, objArr, objArr2);
        AbstractC0990oo.m9198S(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: t0 */
    public static void m5370t0(e94 e94Var, e94 e94Var2, yp1 yp1Var) {
        if (e94Var != e94Var2) {
            e94Var2.getClass();
            e94.m5011q(e94Var);
            e94Var2.mo3384c();
        } else if (e94Var instanceof gp4) {
            ((gp4) e94Var).f20010r = yp1Var;
        } else if (e94Var instanceof hp4) {
            ((hp4) e94Var).f20772h = yp1Var;
        } else {
            nm0.m8798k(e94Var, "Non-transparent snapshot was reused: ");
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static ArrayList m5371u0(Map map, int i, Integer num, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d = 0.0d;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            rv1 rv1Var = new rv1(iIntValue);
            arrayList.add(rv1Var);
            int iFloor = (int) Math.floor(rv1Var.f29661b);
            iArr[iFloor] = iArr[iFloor] + iIntValue2;
            d += (double) iIntValue2;
        }
        double[] dArr = new double[360];
        int i2 = 0;
        for (int i3 = 0; i3 < 360; i3++) {
            double d2 = ((double) iArr[i3]) / d;
            int i4 = i3 + 16;
            for (int i5 = i3 - 14; i5 < i4; i5++) {
                int i6 = i5 % 360;
                if (i6 < 0) {
                    i6 += 360;
                }
                dArr[i6] = dArr[i6] + d2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            rv1 rv1Var2 = (rv1) obj2;
            double d3 = rv1Var2.f29661b;
            double d4 = rv1Var2.f29662c;
            int iRint = ((int) Math.rint(d3)) % 360;
            if (iRint < 0) {
                iRint += 360;
            }
            double d5 = dArr[iRint];
            if (!z || (d4 >= 5.0d && d5 > 0.01d)) {
                double d6 = ((d4 - 48.0d) * (d4 < 48.0d ? 0.1d : 0.3d)) + (d5 * 100.0d * 0.7d);
                rw3 rw3Var = new rw3();
                rw3Var.f29687a = rv1Var2;
                rw3Var.f29688b = d6;
                VarHandle.storeStoreFence();
                arrayList2.add(rw3Var);
            }
        }
        lb0.m7891z0(arrayList2, new vl1((byte) 18));
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 90; 14 < i8; i8--) {
            arrayList3.clear();
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj3 = arrayList2.get(i9);
                i9++;
                rv1 rv1Var3 = ((rw3) obj3).f29687a;
                int size3 = arrayList3.size();
                int i10 = 0;
                do {
                    if (i10 >= size3) {
                        arrayList3.add(rv1Var3);
                        break;
                    }
                    obj = arrayList3.get(i10);
                    i10++;
                } while (180.0d - Math.abs(Math.abs(rv1Var3.f29661b - ((rv1) obj).f29661b) - 180.0d) >= i8);
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty() && num != null) {
            arrayList4.add(num);
        }
        int size4 = arrayList3.size();
        while (i2 < size4) {
            Object obj4 = arrayList3.get(i2);
            i2++;
            arrayList4.add(Integer.valueOf(((rv1) obj4).f29660a));
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: v0 */
    public static byte[] m5372v0(BigInteger bigInteger, int i) {
        if (bigInteger.signum() == -1) {
            C1077qn.m9987m("integer must be nonnegative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (byteArray.length > i2) {
            xy4.m12788q("integer too large");
            return null;
        }
        if (byteArray.length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
            return bArr;
        }
        if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, byteArray.length);
        }
        xy4.m12788q("integer too large");
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public static final String m5373w0(wm0 wm0Var) {
        Object objM7389n;
        if (wm0Var instanceof f01) {
            return ((f01) wm0Var).toString();
        }
        try {
            objM7389n = wm0Var + '@' + m5354d0(wm0Var);
        } catch (Throwable th) {
            objM7389n = k43.m7389n(th);
        }
        if (dp3.m4638b(objM7389n) != null) {
            objM7389n = wm0Var.getClass().getName() + '@' + m5354d0(wm0Var);
        }
        return (String) objM7389n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uj3, zh0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: x0 */
    public static final ArrayList m5374x0(l84 l84Var, int i, Integer num) {
        ?? uj3Var = new uj3(l84Var);
        i = l84Var.m7861q(i);
        cr1 cr1VarM7845a = l84Var.m7845a(i);
        while (i >= 0) {
            uj3Var.m13557n(l84Var.m7853i(i), l84Var.m7855k(i) ? l84Var.m7860p(l84Var.f23848b, i) : ki0.f23136a, l84Var.f23847a.m8233q(i), num);
            if (i >= 0) {
                cr1 cr1Var = cr1VarM7845a;
                cr1VarM7845a = l84Var.m7845a(i);
                i = l84Var.m7861q(i);
                num = cr1Var;
            } else {
                num = cr1VarM7845a;
            }
        }
        return (ArrayList) uj3Var.f36084a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final gu4 m5375y0(a05 a05Var, a05 a05Var2) {
        gu4 gu4Var = new gu4();
        gu4Var.f20139a = a05Var;
        gu4Var.f20140b = a05Var2;
        VarHandle.storeStoreFence();
        return gu4Var;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m5376z0(File file, byte[] bArr) {
        file.getClass();
        int i = x12.f33911c;
        km3 km3Var = km3.f23235j;
        qa0 qa0Var = ra0.f29109d;
        ra0 ra0Var = new ra0();
        ArrayDeque arrayDeque = new ArrayDeque(4);
        ra0Var.f29111b = arrayDeque;
        qa0Var.getClass();
        ra0Var.f29110a = qa0Var;
        VarHandle.storeStoreFence();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, km3Var.contains(rf1.f29222a));
            arrayDeque.addFirst(fileOutputStream);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            ra0Var.close();
        } catch (Throwable th) {
            try {
                ra0Var.f29112c = th;
                nm4.m8799a(th);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                ra0Var.close();
                throw th2;
            }
        }
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: A */
    public String mo5377A() {
        m5381T();
        throw null;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: B */
    public float mo5378B() {
        m5381T();
        throw null;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: C */
    public int mo5379C(g24 g24Var) {
        m5381T();
        throw null;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: D */
    public double mo5380D() {
        m5381T();
        throw null;
    }

    /* JADX INFO: renamed from: T */
    public void m5381T() {
        throw new o24(rl3.m10361a(getClass()) + " can't retrieve untyped values");
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: c */
    public abstract long mo5383c();

    @Override // p000.ri0
    /* JADX INFO: renamed from: d */
    public iv0 mo5384d(pf3 pf3Var, int i) {
        return mo5401x(pf3Var.mo4436j(i));
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: e */
    public int mo5385e(pf3 pf3Var, int i) {
        return mo5396s();
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: f */
    public boolean mo5386f() {
        m5381T();
        throw null;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: g */
    public boolean mo5387g() {
        return true;
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: h */
    public char mo5388h() {
        m5381T();
        throw null;
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: i */
    public Object mo5389i(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        if (jc2Var.mo15d().mo5887h() || mo5387g()) {
            return mo6942b(jc2Var);
        }
        return null;
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: k */
    public double mo5390k(pf3 pf3Var, int i) {
        return mo5380D();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: l */
    public char mo5391l(pf3 pf3Var, int i) {
        return mo5388h();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: n */
    public long mo5392n(pf3 pf3Var, int i) {
        return mo5383c();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: o */
    public float mo5393o(pf3 pf3Var, int i) {
        return mo5378B();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: q */
    public byte mo5394q(pf3 pf3Var, int i) {
        return mo5400w();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: r */
    public String mo5395r(g24 g24Var, int i) {
        return mo5377A();
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: s */
    public abstract int mo5396s();

    @Override // p000.ri0
    /* JADX INFO: renamed from: t */
    public short mo5397t(pf3 pf3Var, int i) {
        return mo5403z();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: v */
    public boolean mo5399v(pf3 pf3Var, int i) {
        return mo5386f();
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: w */
    public abstract byte mo5400w();

    @Override // p000.ri0
    /* JADX INFO: renamed from: y */
    public Object mo5402y(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        return mo6942b(jc2Var);
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: z */
    public abstract short mo5403z();

    @Override // p000.iv0
    /* JADX INFO: renamed from: a */
    public ri0 mo5382a(g24 g24Var) {
        return this;
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: u */
    public void mo5398u(g24 g24Var) {
    }

    @Override // p000.iv0
    /* JADX INFO: renamed from: x */
    public iv0 mo5401x(g24 g24Var) {
        return this;
    }
}
