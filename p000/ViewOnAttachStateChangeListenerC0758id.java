package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: id */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0758id implements jw0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f21260a;

    /* JADX INFO: renamed from: b */
    public C0941nc f21261b;

    /* JADX INFO: renamed from: c */
    public nh3 f21262c;

    /* JADX INFO: renamed from: d */
    public ArrayList f21263d;

    /* JADX INFO: renamed from: e */
    public byte f21264e;

    /* JADX INFO: renamed from: f */
    public EnumC0684gd f21265f;

    /* JADX INFO: renamed from: g */
    public boolean f21266g;

    /* JADX INFO: renamed from: h */
    public f40 f21267h;

    /* JADX INFO: renamed from: i */
    public lv2 f21268i;

    /* JADX INFO: renamed from: j */
    public long f21269j;

    /* JADX INFO: renamed from: k */
    public lv2 f21270k;

    /* JADX INFO: renamed from: l */
    public j14 f21271l;

    /* JADX INFO: renamed from: m */
    public boolean f21272m;

    /* JADX INFO: renamed from: n */
    public RunnableC1054q0 f21273n;

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (p000.d24.m4317r(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6753a(ym0 ym0Var) {
        C0721hd c0721hd;
        z30 it;
        z30 z30Var;
        Handler handler;
        Object objM13297b;
        if (ym0Var instanceof C0721hd) {
            c0721hd = (C0721hd) ym0Var;
            int i = c0721hd.f20481w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0721hd.f20481w = i - Integer.MIN_VALUE;
            } else {
                c0721hd = new C0721hd(this, ym0Var);
            }
        } else {
            c0721hd = new C0721hd(this, ym0Var);
        }
        Object obj = c0721hd.f20479u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0721hd.f20481w;
        if (i2 == 0) {
            k43.m7376J(obj);
            it = this.f21267h.iterator();
            c0721hd.f20478t = it;
            c0721hd.f20481w = 1;
            objM13297b = it.m13297b(c0721hd);
            if (objM13297b != ap0Var) {
                z30Var = it;
                obj = objM13297b;
                if (!((Boolean) obj).booleanValue()) {
                    return ju4.f22634a;
                }
                z30Var.m13298c();
                if (m6756f()) {
                    m6757g();
                }
                handler = this.f21260a.getHandler();
                if (!this.f21272m) {
                    this.f21272m = true;
                    handler.post(this.f21273n);
                }
                long j = this.f21264e;
                c0721hd.f20478t = z30Var;
                c0721hd.f20481w = 2;
            }
            return ap0Var;
        }
        if (i2 == 1) {
            z30Var = c0721hd.f20478t;
            k43.m7376J(obj);
            if (!((Boolean) obj).booleanValue()) {
                return ju4.f22634a;
            }
            z30Var.m13298c();
            if (m6756f()) {
                m6757g();
            }
            handler = this.f21260a.getHandler();
            if (!this.f21272m && handler != null) {
                this.f21272m = true;
                handler.post(this.f21273n);
            }
            long j2 = this.f21264e;
            c0721hd.f20478t = z30Var;
            c0721hd.f20481w = 2;
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z30Var = c0721hd.f20478t;
            k43.m7376J(obj);
        }
        it = z30Var;
        c0721hd.f20478t = it;
        c0721hd.f20481w = 1;
        objM13297b = it.m13297b(c0721hd);
        if (objM13297b != ap0Var) {
            z30Var = it;
            obj = objM13297b;
            if (!((Boolean) obj).booleanValue()) {
                return ju4.f22634a;
            }
            z30Var.m13298c();
            if (m6756f()) {
                m6757g();
            }
            handler = this.f21260a.getHandler();
            if (!this.f21272m) {
                this.f21272m = true;
                handler.post(this.f21273n);
            }
            long j3 = this.f21264e;
            c0721hd.f20478t = z30Var;
            c0721hd.f20481w = 2;
        }
        return ap0Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m6754c(m52 m52Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        j14 j14Var;
        int i3;
        String str;
        long j3;
        String str2;
        m52 m52Var2 = m52Var;
        int[] iArr3 = m52Var2.f24666b;
        long[] jArr4 = m52Var2.f24665a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c = c2;
                        j14 j14Var2 = (j14) this.f21270k.m8197b(i8);
                        k14 k14Var = (k14) m52Var2.m8197b(i8);
                        i14 i14Var = k14Var != null ? k14Var.f22816a : null;
                        if (i14Var == null) {
                            throw d55.m4363h("no value for specified key");
                        }
                        j2 = j5;
                        int i9 = i14Var.f21014f;
                        lw2 lw2Var = i14Var.f21012d.f17631a;
                        String str3 = "Invalid content capture ID";
                        if (j14Var2 != null) {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j = j4;
                            i = i7;
                            Object[] objArr = lw2Var.f24419b;
                            long[] jArr5 = lw2Var.f24418a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j6 = jArr5[i10];
                                    Object[] objArr2 = objArr;
                                    long[] jArr6 = jArr5;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                p14 p14Var = (p14) objArr2[(i10 << 3) + i12];
                                                i3 = i12;
                                                p14 p14Var2 = m14.f24535B;
                                                if (z62.m13387o(p14Var, p14Var2)) {
                                                    Object objM8132g = j14Var2.f21955a.f17631a.m8132g(p14Var2);
                                                    if (objM8132g == null) {
                                                        objM8132g = null;
                                                    }
                                                    List list = (List) objM8132g;
                                                    C0875lk c0875lk = list != null ? (C0875lk) hb0.m6301M0(list) : null;
                                                    Object objM8132g2 = lw2Var.m8132g(p14Var2);
                                                    if (objM8132g2 == null) {
                                                        objM8132g2 = null;
                                                    }
                                                    List list2 = (List) objM8132g2;
                                                    C0875lk c0875lk2 = list2 != null ? (C0875lk) hb0.m6301M0(list2) : null;
                                                    if (!z62.m13387o(c0875lk, c0875lk2)) {
                                                        String strValueOf = String.valueOf(c0875lk2);
                                                        nh3 nh3Var = this.f21262c;
                                                        if (nh3Var != null) {
                                                            AutofillId autofillIdM8741H = nh3Var.m8741H(i9);
                                                            if (autofillIdM8741H == null) {
                                                                throw d55.m4363h("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) nh3Var.f25810b).notifyViewTextChanged(autofillIdM8741H, strValueOf);
                                                        }
                                                    }
                                                }
                                                j6 >>= 8;
                                                i12 = i3 + 1;
                                                j14Var2 = j14Var2;
                                                jArr6 = jArr6;
                                            } else {
                                                i3 = i12;
                                            }
                                            j6 >>= 8;
                                            i12 = i3 + 1;
                                            j14Var2 = j14Var2;
                                            jArr6 = jArr6;
                                        }
                                        jArr3 = jArr6;
                                        j14Var = j14Var2;
                                        if (i11 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        j14Var = j14Var2;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    objArr = objArr2;
                                    j14Var2 = j14Var;
                                    jArr5 = jArr3;
                                }
                            }
                        } else {
                            Object[] objArr3 = lw2Var.f24419b;
                            long[] jArr7 = lw2Var.f24418a;
                            int i13 = i5;
                            int length3 = jArr7.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j7 = jArr7[i14];
                                    j = j4;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j7 & 255) < 128) {
                                                j3 = j7;
                                                p14 p14Var3 = (p14) objArr3[(i14 << 3) + i16];
                                                p14 p14Var4 = m14.f24535B;
                                                if (z62.m13387o(p14Var3, p14Var4)) {
                                                    Object objM8132g3 = lw2Var.m8132g(p14Var4);
                                                    if (objM8132g3 == null) {
                                                        objM8132g3 = null;
                                                    }
                                                    List list3 = (List) objM8132g3;
                                                    String strValueOf2 = String.valueOf(list3 != null ? (C0875lk) hb0.m6301M0(list3) : null);
                                                    nh3 nh3Var2 = this.f21262c;
                                                    if (nh3Var2 != null) {
                                                        str2 = str3;
                                                        AutofillId autofillIdM8741H2 = nh3Var2.m8741H(i9);
                                                        if (autofillIdM8741H2 == null) {
                                                            throw d55.m4363h(str2);
                                                        }
                                                        ((ContentCaptureSession) nh3Var2.f25810b).notifyViewTextChanged(autofillIdM8741H2, strValueOf2);
                                                    }
                                                }
                                                j7 = j3 >> i13;
                                                i16++;
                                                i7 = i7;
                                                str3 = str2;
                                            } else {
                                                j3 = j7;
                                            }
                                            str2 = str3;
                                            j7 = j3 >> i13;
                                            i16++;
                                            i7 = i7;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i7;
                                        if (i15 != i13) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i7;
                                    }
                                    if (i14 == length3) {
                                        break;
                                    }
                                    i14++;
                                    j4 = j;
                                    i7 = i;
                                    str3 = str;
                                    i13 = 8;
                                }
                            } else {
                                j = j4;
                                i = i7;
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i7;
                        i2 = i5;
                    }
                    j4 = j >> i2;
                    i7 = i + 1;
                    m52Var2 = m52Var;
                    i5 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            m52Var2 = m52Var;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final m52 m6755d() {
        if (this.f21266g) {
            this.f21266g = false;
            this.f21268i = C0006a5.m79q(this.f21260a.getSemanticsOwner(), new C0891m((byte) 14));
            this.f21269j = System.currentTimeMillis();
        }
        return this.f21268i;
    }

    @Override // p000.jw0
    /* JADX INFO: renamed from: e */
    public final void mo4241e() {
        this.f21262c = (nh3) this.f21261b.invoke();
        m6759i(-1, this.f21260a.getSemanticsOwner().m7810a());
        m6757g();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6756f() {
        return this.f21262c != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m6757g() {
        ArrayList arrayList = this.f21263d;
        nh3 nh3Var = this.f21262c;
        if (nh3Var == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) nh3Var.f25810b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xl0 xl0Var = (xl0) arrayList.get(i);
            int iOrdinal = xl0Var.f34377c.ordinal();
            if (iOrdinal == 0) {
                wd3 wd3Var = xl0Var.f34378d;
                if (wd3Var != null) {
                    contentCaptureSession.notifyViewAppeared((ViewStructure) wd3Var.f33259b);
                }
            } else if (iOrdinal != 1) {
                C0670g.m5864c();
                return;
            } else {
                AutofillId autofillIdM8741H = nh3Var.m8741H(xl0Var.f34375a);
                if (autofillIdM8741H != null) {
                    contentCaptureSession.notifyViewDisappeared(autofillIdM8741H);
                }
            }
        }
        contentCaptureSession.notifyViewsDisappeared((AutofillId) c20.m3821q((View) nh3Var.f25811c).f14813b, new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    /* JADX INFO: renamed from: h */
    public final void m6758h(i14 i14Var, j14 j14Var) {
        lv2 lv2Var = this.f21270k;
        ne0 ne0Var = new ne0((byte) 2);
        ne0Var.f25728b = j14Var;
        ne0Var.f25729c = this;
        VarHandle.storeStoreFence();
        i14Var.getClass();
        List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        int size = listM6548i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM6548i.get(i2);
            if (m6755d().m8196a(((i14) obj).f21014f)) {
                ne0Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listM6548i2 = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        int size2 = listM6548i2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            i14 i14Var2 = (i14) listM6548i2.get(i3);
            m52 m52VarM6755d = m6755d();
            int i4 = i14Var2.f21014f;
            if (m52VarM6755d.m8196a(i4) && lv2Var.m8196a(i4)) {
                Object objM8197b = lv2Var.m8197b(i4);
                if (objM8197b == null) {
                    throw d55.m4363h("node not present in pruned tree before this change");
                }
                m6758h(i14Var2, (j14) objM8197b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX INFO: renamed from: i */
    public final void m6759i(int i, i14 i14Var) {
        yp1 yp1Var;
        AutofillId autofillIdM8741H;
        jl3 jl3VarM6540a;
        wd3 wd3Var;
        String strM13861Y;
        yp1 yp1Var2;
        if (m6756f()) {
            lw2 lw2Var = i14Var.f21012d.f17631a;
            Object objM8132g = lw2Var.m8132g(m14.f24537D);
            if (objM8132g == null) {
                objM8132g = null;
            }
            Boolean bool = (Boolean) objM8132g;
            if (this.f21265f == EnumC0684gd.f19741a && z62.m13387o(bool, Boolean.TRUE)) {
                Object objM8132g2 = lw2Var.m8132g(d14.f16716m);
                if (objM8132g2 == null) {
                    objM8132g2 = null;
                }
                C1353y2 c1353y2 = (C1353y2) objM8132g2;
                if (c1353y2 != null && (yp1Var2 = (yp1) c1353y2.f34818b) != null) {
                }
            } else if (this.f21265f == EnumC0684gd.f19742b && z62.m13387o(bool, Boolean.FALSE)) {
                Object objM8132g3 = lw2Var.m8132g(d14.f16716m);
                if (objM8132g3 == null) {
                    objM8132g3 = null;
                }
                C1353y2 c1353y3 = (C1353y2) objM8132g3;
                if (c1353y3 != null && (yp1Var = (yp1) c1353y3.f34818b) != null) {
                }
            }
            int i2 = i14Var.f21014f;
            nh3 nh3Var = this.f21262c;
            if (nh3Var == null) {
                wd3Var = null;
            } else {
                ar3 ar3VarM3821q = c20.m3821q(this.f21260a);
                i14 i14VarM6550l = i14Var.m6550l();
                int i3 = i14Var.f21014f;
                if (i14VarM6550l != null) {
                    autofillIdM8741H = nh3Var.m8741H(i14VarM6550l.f21014f);
                    if (autofillIdM8741H == null) {
                        wd3Var = null;
                    }
                } else {
                    autofillIdM8741H = (AutofillId) ar3VarM3821q.f14813b;
                }
                ViewStructure viewStructureNewVirtualViewStructure = ((ContentCaptureSession) nh3Var.f25810b).newVirtualViewStructure(autofillIdM8741H, i3);
                wd3 wd3Var2 = new wd3((byte) 19);
                wd3Var2.f33259b = viewStructureNewVirtualViewStructure;
                VarHandle.storeStoreFence();
                e14 e14Var = i14Var.f21012d;
                p14 p14Var = m14.f24546M;
                lw2 lw2Var2 = e14Var.f17631a;
                if (lw2Var2.m8128c(p14Var)) {
                    wd3Var = null;
                } else {
                    Bundle extras = viewStructureNewVirtualViewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.f21269j);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                    }
                    Object objM8132g4 = lw2Var2.m8132g(m14.f24577z);
                    if (objM8132g4 == null) {
                        objM8132g4 = null;
                    }
                    String str = (String) objM8132g4;
                    if (str != null) {
                        viewStructureNewVirtualViewStructure.setId(i3, null, null, str);
                    }
                    Object objM8132g5 = lw2Var2.m8132g(m14.f24565n);
                    if (objM8132g5 == null) {
                        objM8132g5 = null;
                    }
                    if (((Boolean) objM8132g5) != null) {
                        viewStructureNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                    }
                    Object objM8132g6 = lw2Var2.m8132g(m14.f24535B);
                    if (objM8132g6 == null) {
                        objM8132g6 = null;
                    }
                    List list = (List) objM8132g6;
                    if (list != null) {
                        viewStructureNewVirtualViewStructure.setClassName("android.widget.TextView");
                        viewStructureNewVirtualViewStructure.setText(yl2.m13170a(list, "\n", null, 62));
                    }
                    Object objM8132g7 = lw2Var2.m8132g(m14.f24539F);
                    if (objM8132g7 == null) {
                        objM8132g7 = null;
                    }
                    C0875lk c0875lk = (C0875lk) objM8132g7;
                    if (c0875lk != null) {
                        viewStructureNewVirtualViewStructure.setClassName("android.widget.EditText");
                        viewStructureNewVirtualViewStructure.setText(c0875lk);
                    }
                    Object objM8132g8 = lw2Var2.m8132g(m14.f24552a);
                    if (objM8132g8 == null) {
                        objM8132g8 = null;
                    }
                    List list2 = (List) objM8132g8;
                    if (list2 != null) {
                        viewStructureNewVirtualViewStructure.setContentDescription(yl2.m13170a(list2, "\n", null, 62));
                    }
                    Object objM8132g9 = lw2Var2.m8132g(m14.f24576y);
                    if (objM8132g9 == null) {
                        objM8132g9 = null;
                    }
                    lq3 lq3Var = (lq3) objM8132g9;
                    if (lq3Var != null && (strM13861Y = zy5.m13861Y(lq3Var.f24281a)) != null) {
                        viewStructureNewVirtualViewStructure.setClassName(strM13861Y);
                    }
                    jl4 jl4VarM13849M = zy5.m13849M(e14Var);
                    if (jl4VarM13849M != null) {
                        il4 il4Var = jl4VarM13849M.f22400a;
                        xl4 xl4Var = il4Var.f21534b;
                        ky0 ky0Var = il4Var.f21539g;
                        viewStructureNewVirtualViewStructure.setTextStyle(ky0Var.mo3585r() * ky0Var.mo3580c() * bm4.m3634d(xl4Var.f34389a.f27479b), 0, 0, 0);
                    }
                    e13 e13VarM6543d = i14Var.m6543d();
                    if (e13VarM6543d == null) {
                        jl3VarM6540a = jl3.f22395e;
                    } else {
                        e13 e13Var = e13VarM6543d.mo4871Z0().f25208n ? e13VarM6543d : null;
                        if (e13Var != null) {
                            jl3VarM6540a = i14Var.m6540a(e13Var);
                        } else {
                            jl3VarM6540a = jl3.f22395e;
                        }
                    }
                    float f = jl3VarM6540a.f22396a;
                    float f2 = jl3VarM6540a.f22397b;
                    viewStructureNewVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (jl3VarM6540a.f22398c - f), (int) (jl3VarM6540a.f22399d - f2));
                    wd3Var = wd3Var2;
                }
            }
            if (wd3Var != null) {
                this.f21263d.add(new xl0(i2, this.f21269j, yl0.f35312a, wd3Var));
            }
            List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
            int size = listM6548i.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listM6548i.get(i5);
                if (m6755d().m8196a(((i14) obj).f21014f)) {
                    m6759i(i4, (i14) obj);
                    i4++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6760j(i14 i14Var) {
        if (m6756f()) {
            this.f21263d.add(new xl0(i14Var.f21014f, this.f21269j, yl0.f35313b, null));
            List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
            int size = listM6548i.size();
            for (int i = 0; i < size; i++) {
                m6760j((i14) listM6548i.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m6761k() {
        lv2 lv2Var = this.f21270k;
        lv2Var.m8116c();
        m52 m52VarM6755d = m6755d();
        int[] iArr = m52VarM6755d.f24666b;
        Object[] objArr = m52VarM6755d.f24667c;
        long[] jArr = m52VarM6755d.f24665a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            lv2Var.m8121h(iArr[i4], new j14(((k14) objArr[i4]).f22816a, m6755d()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f21271l = new j14(this.f21260a.getSemanticsOwner().m7810a(), m6755d());
    }

    @Override // p000.jw0
    public final void onStop() {
        m6760j(this.f21260a.getSemanticsOwner().m7810a());
        m6757g();
        this.f21262c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f21260a.getHandler().removeCallbacks(this.f21273n);
        this.f21262c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
