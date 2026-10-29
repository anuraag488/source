package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class f13 {

    /* JADX INFO: renamed from: a */
    public static final yv2 f18660a;

    static {
        yv2 yv2Var = p23.f27324a;
        f18660a = new yv2();
    }

    /* JADX INFO: renamed from: a */
    public static final void m5451a(mt2 mt2Var, int i, int i2) {
        if (!(mt2Var instanceof qx0)) {
            m5452b(mt2Var, i & mt2Var.f25197c, i2);
            return;
        }
        qx0 qx0Var = (qx0) mt2Var;
        int i3 = qx0Var.f28862o;
        m5452b(mt2Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (mt2 mt2Var2 = qx0Var.f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
            m5451a(mt2Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m5452b(mt2 mt2Var, int i, int i2) {
        if (i2 != 0 || mt2Var.mo4191D0()) {
            if ((i & 2) != 0 && (mt2Var instanceof lf2)) {
                z62.m13349H((lf2) mt2Var);
                if (i2 == 2) {
                    sc6.m10650V(mt2Var, 2).m4884m1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                sc6.m10652X(mt2Var).m12253G();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                sc6.m10652X(mt2Var).m12268W(false);
            }
            if ((i & 256) != 0 && (mt2Var instanceof ns1)) {
                if (i2 == 1) {
                    wf2 wf2VarM10652X = sc6.m10652X(mt2Var);
                    wf2VarM10652X.m12273c0(wf2VarM10652X.f33309Q + 1);
                } else if (i2 == 2) {
                    wf2 wf2VarM10652X2 = sc6.m10652X(mt2Var);
                    wf2VarM10652X2.m12273c0(wf2VarM10652X2.f33309Q - 1);
                }
                if (i2 != 2) {
                    wf2 wf2VarM10652X3 = sc6.m10652X(mt2Var);
                    if (wf2VarM10652X3.f33309Q != 0 && !wf2VarM10652X3.m12290q() && !wf2VarM10652X3.m12291r() && !wf2VarM10652X3.f33308P) {
                        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X3);
                        z32 z32Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30097P.f32098e;
                        z32Var.getClass();
                        if (wf2VarM10652X3.f33309Q > 0) {
                            ((uw2) z32Var.f35738b).m11663b(wf2VarM10652X3);
                            wf2VarM10652X3.f33308P = true;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10601F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (mt2Var instanceof s31)) {
                z62.m13348G((s31) mt2Var);
            }
            if ((i & 8) != 0 && (mt2Var instanceof g14)) {
                sc6.m10652X(mt2Var).f33329s = true;
            }
            if ((i & 64) != 0 && (mt2Var instanceof g83)) {
                ag2 ag2Var = sc6.m10652X((g83) mt2Var).f33300H;
                ag2Var.f14483p.f33633r = true;
                yo2 yo2Var = ag2Var.f14484q;
                if (yo2Var != null) {
                    yo2Var.f35421x = true;
                }
            }
            if ((i & 2048) != 0 && (mt2Var instanceof hl1)) {
                hl1 hl1Var = (hl1) mt2Var;
                v60.f32427b = null;
                hl1Var.mo6426W(v60.f32426a);
                if (v60.f32427b != null) {
                    mt2 mt2Var2 = (mt2) hl1Var;
                    if (!mt2Var2.f25195a.f25208n) {
                        q32.m9721c("visitChildren called on an unattached node");
                    }
                    uw2 uw2Var = new uw2(new mt2[16]);
                    mt2 mt2Var3 = mt2Var2.f25195a;
                    mt2 mt2Var4 = mt2Var3.f25200f;
                    if (mt2Var4 == null) {
                        sc6.m10663e(uw2Var, mt2Var3);
                    } else {
                        uw2Var.m11663b(mt2Var4);
                    }
                    while (true) {
                        int i3 = uw2Var.f32213c;
                        if (i3 == 0) {
                            break;
                        }
                        mt2 mt2VarM10644P = (mt2) uw2Var.m11672l(i3 - 1);
                        if ((mt2VarM10644P.f25198d & 1024) == 0) {
                            sc6.m10663e(uw2Var, mt2VarM10644P);
                        } else {
                            while (mt2VarM10644P != null) {
                                if ((mt2VarM10644P.f25197c & 1024) != 0) {
                                    uw2 uw2Var2 = null;
                                    while (mt2VarM10644P != null) {
                                        if (mt2VarM10644P instanceof sl1) {
                                            sl1 sl1Var = (sl1) mt2VarM10644P;
                                            xk1 xk1Var = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).f15397d;
                                            if (xk1Var.f34329c.m8409a(sl1Var)) {
                                                xk1Var.m12699a();
                                            }
                                        } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                            int i4 = 0;
                                            for (mt2 mt2Var5 = ((qx0) mt2VarM10644P).f28863p; mt2Var5 != null; mt2Var5 = mt2Var5.f25200f) {
                                                if ((mt2Var5.f25197c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        mt2VarM10644P = mt2Var5;
                                                    } else {
                                                        if (uw2Var2 == null) {
                                                            uw2Var2 = new uw2(new mt2[16]);
                                                        }
                                                        if (mt2VarM10644P != null) {
                                                            uw2Var2.m11663b(mt2VarM10644P);
                                                            mt2VarM10644P = null;
                                                        }
                                                        uw2Var2.m11663b(mt2Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        mt2VarM10644P = sc6.m10644P(uw2Var2);
                                    }
                                    break;
                                }
                                mt2VarM10644P = mt2VarM10644P.f25200f;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (mt2Var instanceof nk1)) {
                nk1 nk1Var = (nk1) mt2Var;
                xk1 xk1Var2 = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(nk1Var)).getFocusOwner()).f15397d;
                if (xk1Var2.f34330d.m8409a(nk1Var)) {
                    xk1Var2.m12699a();
                }
            }
            if ((i & 2097152) != 0 && (mt2Var instanceof a32) && i2 == 2) {
                ((a32) mt2Var).mo29G();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5453c(mt2 mt2Var) {
        if (!mt2Var.f25208n) {
            q32.m9721c("autoInvalidateUpdatedNode called on unattached node");
        }
        m5451a(mt2Var, -1, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final int m5454d(lt2 lt2Var) {
        int i = lt2Var instanceof jf2 ? 3 : 1;
        if (lt2Var instanceof r31) {
            i |= 4;
        }
        if (lt2Var instanceof C0497bn) {
            i |= 8;
        }
        if (lt2Var instanceof rc3) {
            i |= 16;
        }
        if (lt2Var instanceof qt2) {
            i |= 32;
        }
        if (lt2Var instanceof C0529cj) {
            i |= 64;
        }
        return lt2Var instanceof z20 ? 524288 | i : i;
    }

    /* JADX INFO: renamed from: e */
    public static final int m5455e(mt2 mt2Var) {
        int i = mt2Var.f25197c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = mt2Var.getClass();
        yv2 yv2Var = f18660a;
        int iM13260d = yv2Var.m13260d(cls);
        if (iM13260d >= 0) {
            return yv2Var.f35549c[iM13260d];
        }
        int i2 = mt2Var instanceof lf2 ? 3 : 1;
        if (mt2Var instanceof s31) {
            i2 |= 4;
        }
        if (mt2Var instanceof g14) {
            i2 |= 8;
        }
        if (mt2Var instanceof oc3) {
            i2 |= 16;
        }
        if (mt2Var instanceof pt2) {
            i2 |= 32;
        }
        if (mt2Var instanceof g83) {
            i2 |= 64;
        }
        if (mt2Var instanceof af2) {
            i2 |= 4194432;
        } else if (mt2Var instanceof cr2) {
            i2 |= 128;
        }
        if (mt2Var instanceof ns1) {
            i2 |= 256;
        }
        if (mt2Var instanceof m20) {
            i2 |= 512;
        }
        if (mt2Var instanceof sl1) {
            i2 |= 1024;
        }
        if (mt2Var instanceof hl1) {
            i2 |= 2048;
        }
        if (mt2Var instanceof nk1) {
            i2 |= 4096;
        }
        if (mt2Var instanceof wc2) {
            i2 |= 8192;
        }
        if (mt2Var instanceof C0867lc) {
            i2 |= 16384;
        }
        if (mt2Var instanceof bj0) {
            i2 |= 32768;
        }
        if (mt2Var instanceof pp4) {
            i2 |= 262144;
        }
        if (mt2Var instanceof z20) {
            i2 |= 524288;
        }
        if (mt2Var instanceof sl1) {
            i2 |= 1048576;
        }
        if (mt2Var instanceof a32) {
            i2 |= 2097152;
        }
        if (mt2Var instanceof ch2) {
            i2 |= 8388608;
        }
        yv2Var.m13263g(i2, cls);
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m5456f(mt2 mt2Var) {
        if (!(mt2Var instanceof qx0)) {
            return m5455e(mt2Var);
        }
        qx0 qx0Var = (qx0) mt2Var;
        int iM5456f = qx0Var.f28862o;
        for (mt2 mt2Var2 = qx0Var.f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
            iM5456f |= m5456f(mt2Var2);
        }
        return iM5456f;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m5457g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
