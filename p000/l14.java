package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l14 {

    /* JADX INFO: renamed from: a */
    public wf2 f23703a;

    /* JADX INFO: renamed from: b */
    public z71 f23704b;

    /* JADX INFO: renamed from: c */
    public lv2 f23705c;

    /* JADX INFO: renamed from: d */
    public cw2 f23706d;

    /* JADX INFO: renamed from: a */
    public final i14 m7810a() {
        return new i14(this.f23704b, false, this.f23703a, new e14());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX INFO: renamed from: b */
    public final void m7811b(wf2 wf2Var, e14 e14Var) {
        bm0 bm0Var;
        bm0 bm0Var2;
        String str;
        String str2;
        ln4 ln4Var;
        ln4 ln4Var2;
        C1401zd c1401zd;
        C1401zd c1401zd2;
        cw2 cw2Var = this.f23706d;
        Object[] objArr = cw2Var.f16532a;
        int i = cw2Var.f16533b;
        for (int i2 = 0; i2 < i; i2++) {
            C1287wb c1287wb = (C1287wb) objArr[i2];
            c1287wb.getClass();
            e14 e14VarM12297x = wf2Var.m12297x();
            int i3 = wf2Var.f33312b;
            z32 z32Var = c1287wb.f33199a;
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = c1287wb.f33201c;
            if (e14Var != null) {
                Object objM8132g = e14Var.f17631a.m8132g(m14.f24570s);
                if (objM8132g == null) {
                    objM8132g = null;
                }
                bm0Var = (bm0) objM8132g;
            } else {
                bm0Var = null;
            }
            if (e14VarM12297x != null) {
                Object objM8132g2 = e14VarM12297x.f17631a.m8132g(m14.f24570s);
                if (objM8132g2 == null) {
                    objM8132g2 = null;
                }
                bm0Var2 = (bm0) objM8132g2;
            } else {
                bm0Var2 = null;
            }
            bm0.f15408a.getClass();
            C0794jd c0794jd = am0.f14623b;
            if (!z62.m13387o(bm0Var2, c0794jd)) {
                if (z62.m13387o(bm0Var, c0794jd) && !z62.m13387o(bm0Var2, c0794jd)) {
                    z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, true);
                }
                if (e14Var != null) {
                    Object objM8132g3 = e14Var.f17631a.m8132g(m14.f24538E);
                    if (objM8132g3 == null) {
                        objM8132g3 = null;
                    }
                    C0875lk c0875lk = (C0875lk) objM8132g3;
                    if (c0875lk != null) {
                        str = c0875lk.f24092b;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (e14VarM12297x != null) {
                    Object objM8132g4 = e14VarM12297x.f17631a.m8132g(m14.f24538E);
                    if (objM8132g4 == null) {
                        objM8132g4 = null;
                    }
                    C0875lk c0875lk2 = (C0875lk) objM8132g4;
                    if (c0875lk2 != null) {
                        str2 = c0875lk2.f24092b;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, true);
                    } else if (str2 == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, false);
                    } else if (z62.m13387o(bm0Var2, am0.f14624c)) {
                        z32Var.m13308F().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, AutofillValue.forText(zc6.m13513J(str2)));
                    }
                }
                if (e14Var != null) {
                    Object objM8132g5 = e14Var.f17631a.m8132g(m14.f24544K);
                    if (objM8132g5 == null) {
                        objM8132g5 = null;
                    }
                    ln4Var = (ln4) objM8132g5;
                } else {
                    ln4Var = null;
                }
                if (e14VarM12297x != null) {
                    Object objM8132g6 = e14VarM12297x.f17631a.m8132g(m14.f24544K);
                    if (objM8132g6 == null) {
                        objM8132g6 = null;
                    }
                    ln4Var2 = (ln4) objM8132g6;
                } else {
                    ln4Var2 = null;
                }
                if (ln4Var != ln4Var2) {
                    if (ln4Var == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, true);
                    } else if (ln4Var2 == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, false);
                    } else if (z62.m13387o(bm0Var2, am0.f14625d)) {
                        int iOrdinal = ln4Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            z32Var.m13308F().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (e14Var != null) {
                    Object objM8132g7 = e14Var.f17631a.m8132g(m14.f24571t);
                    if (objM8132g7 == null) {
                        objM8132g7 = null;
                    }
                    c1401zd = (C1401zd) objM8132g7;
                } else {
                    c1401zd = null;
                }
                if (e14VarM12297x != null) {
                    Object objM8132g8 = e14VarM12297x.f17631a.m8132g(m14.f24571t);
                    if (objM8132g8 == null) {
                        objM8132g8 = null;
                    }
                    c1401zd2 = (C1401zd) objM8132g8;
                } else {
                    c1401zd2 = null;
                }
                if (!z62.m13387o(c1401zd, c1401zd2)) {
                    if (c1401zd == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, true);
                    } else if (c1401zd2 == null) {
                        z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, false);
                    } else {
                        z32Var.m13308F().notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, c1401zd2.f35993a);
                    }
                }
            } else if (!z62.m13387o(bm0Var, c0794jd)) {
                z32Var.m13312J(viewTreeObserverOnGlobalLayoutListenerC1140sc, i3, false);
            }
            boolean z = e14Var != null && e14Var.f17631a.m8127b(m14.f24569r);
            boolean z2 = e14VarM12297x != null && e14VarM12297x.f17631a.m8127b(m14.f24569r);
            if (z != z2) {
                mv2 mv2Var = c1287wb.f33206h;
                if (z2) {
                    mv2Var.m8403a(i3);
                } else {
                    mv2Var.m8407e(i3);
                }
            }
        }
    }
}
