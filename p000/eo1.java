package p000;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import essentials.app.EsActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 {

    /* JADX INFO: renamed from: A */
    public final yn1 f18288A;

    /* JADX INFO: renamed from: B */
    public final h50 f18289B;

    /* JADX INFO: renamed from: C */
    public C0638f5 f18290C;

    /* JADX INFO: renamed from: D */
    public C0638f5 f18291D;

    /* JADX INFO: renamed from: E */
    public C0638f5 f18292E;

    /* JADX INFO: renamed from: F */
    public ArrayDeque f18293F;

    /* JADX INFO: renamed from: G */
    public boolean f18294G;

    /* JADX INFO: renamed from: H */
    public boolean f18295H;

    /* JADX INFO: renamed from: I */
    public boolean f18296I;

    /* JADX INFO: renamed from: J */
    public boolean f18297J;

    /* JADX INFO: renamed from: K */
    public boolean f18298K;

    /* JADX INFO: renamed from: L */
    public ArrayList f18299L;

    /* JADX INFO: renamed from: M */
    public ArrayList f18300M;

    /* JADX INFO: renamed from: N */
    public ArrayList f18301N;

    /* JADX INFO: renamed from: O */
    public ho1 f18302O;

    /* JADX INFO: renamed from: P */
    public final RunnableC1029pc f18303P;

    /* JADX INFO: renamed from: a */
    public final ArrayList f18304a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f18305b;

    /* JADX INFO: renamed from: c */
    public final C1283w7 f18306c;

    /* JADX INFO: renamed from: d */
    public ArrayList f18307d;

    /* JADX INFO: renamed from: e */
    public ArrayList f18308e;

    /* JADX INFO: renamed from: f */
    public final un1 f18309f;

    /* JADX INFO: renamed from: g */
    public t33 f18310g;

    /* JADX INFO: renamed from: h */
    public C0589dw f18311h;

    /* JADX INFO: renamed from: i */
    public boolean f18312i;

    /* JADX INFO: renamed from: j */
    public final C1308wv f18313j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f18314k;

    /* JADX INFO: renamed from: l */
    public final Map f18315l;

    /* JADX INFO: renamed from: m */
    public final Map f18316m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f18317n;

    /* JADX INFO: renamed from: o */
    public final nh3 f18318o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList f18319p;

    /* JADX INFO: renamed from: q */
    public final vn1 f18320q;

    /* JADX INFO: renamed from: r */
    public final vn1 f18321r;

    /* JADX INFO: renamed from: s */
    public final vn1 f18322s;

    /* JADX INFO: renamed from: t */
    public final vn1 f18323t;

    /* JADX INFO: renamed from: u */
    public final xn1 f18324u;

    /* JADX INFO: renamed from: v */
    public int f18325v;

    /* JADX INFO: renamed from: w */
    public rn1 f18326w;

    /* JADX INFO: renamed from: x */
    public se0 f18327x;

    /* JADX INFO: renamed from: y */
    public pn1 f18328y;

    /* JADX INFO: renamed from: z */
    public pn1 f18329z;

    public eo1() {
        C1283w7 c1283w7 = new C1283w7((byte) 11);
        c1283w7.f33127c = new ArrayList();
        c1283w7.f33128d = new HashMap();
        c1283w7.f33129e = new HashMap();
        VarHandle.storeStoreFence();
        this.f18306c = c1283w7;
        this.f18307d = new ArrayList();
        un1 un1Var = new un1();
        un1Var.f32011a = this;
        VarHandle.storeStoreFence();
        this.f18309f = un1Var;
        this.f18311h = null;
        this.f18312i = false;
        this.f18313j = new C1308wv(this, (byte) 1);
        this.f18314k = new AtomicInteger();
        this.f18315l = Collections.synchronizedMap(new HashMap());
        this.f18316m = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        this.f18317n = new ArrayList();
        nh3 nh3Var = new nh3((byte) 16, false);
        nh3Var.f25810b = this;
        nh3Var.f25811c = new CopyOnWriteArrayList();
        VarHandle.storeStoreFence();
        this.f18318o = nh3Var;
        this.f18319p = new CopyOnWriteArrayList();
        vn1 vn1Var = new vn1((byte) 0);
        vn1Var.f32747b = this;
        VarHandle.storeStoreFence();
        this.f18320q = vn1Var;
        vn1 vn1Var2 = new vn1((byte) 1);
        vn1Var2.f32747b = this;
        VarHandle.storeStoreFence();
        this.f18321r = vn1Var2;
        vn1 vn1Var3 = new vn1((byte) 2);
        vn1Var3.f32747b = this;
        VarHandle.storeStoreFence();
        this.f18322s = vn1Var3;
        vn1 vn1Var4 = new vn1((byte) 3);
        vn1Var4.f32747b = this;
        VarHandle.storeStoreFence();
        this.f18323t = vn1Var4;
        xn1 xn1Var = new xn1();
        xn1Var.f34458a = this;
        VarHandle.storeStoreFence();
        this.f18324u = xn1Var;
        this.f18325v = -1;
        yn1 yn1Var = new yn1();
        yn1Var.f35355a = this;
        VarHandle.storeStoreFence();
        this.f18288A = yn1Var;
        this.f18289B = new h50((byte) 9);
        this.f18293F = new ArrayDeque();
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 4);
        runnableC1029pc.f27515b = this;
        VarHandle.storeStoreFence();
        this.f18303P = runnableC1029pc;
    }

    /* JADX INFO: renamed from: E */
    public static HashSet m5211E(C0589dw c0589dw) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c0589dw.f17434a.size(); i++) {
            pn1 pn1Var = ((po1) c0589dw.f17434a.get(i)).f27852b;
            if (pn1Var != null && c0589dw.f17440g) {
                hashSet.add(pn1Var);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m5212J(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m5213K(pn1 pn1Var) {
        pn1Var.getClass();
        ArrayList arrayListM12118E = pn1Var.f27799v.f18306c.m12118E();
        int size = arrayListM12118E.size();
        boolean zM5213K = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListM12118E.get(i);
            i++;
            pn1 pn1Var2 = (pn1) obj;
            if (pn1Var2 != null) {
                zM5213K = m5213K(pn1Var2);
            }
            if (zM5213K) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m5214M(pn1 pn1Var) {
        if (pn1Var == null) {
            return true;
        }
        if (pn1Var.f27759D) {
            return pn1Var.f27797t == null || m5214M(pn1Var.f27800w);
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m5215N(pn1 pn1Var) {
        if (pn1Var == null) {
            return true;
        }
        eo1 eo1Var = pn1Var.f27797t;
        return pn1Var == eo1Var.f18329z && m5215N(eo1Var.f18328y);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m5216b0(pn1 pn1Var) {
        if (m5212J(2)) {
            Log.v("FragmentManager", "show: " + pn1Var);
        }
        if (pn1Var.f27756A) {
            pn1Var.f27756A = false;
            pn1Var.f27765J = !pn1Var.f27765J;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m5217A(boolean z) {
        boolean zMo3642a;
        ArrayList arrayList;
        C0589dw c0589dw;
        m5267z(z);
        if (!this.f18312i && (c0589dw = this.f18311h) != null) {
            c0589dw.f17451r = false;
            c0589dw.m4768d();
            if (m5212J(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f18311h + " as part of execPendingActions for actions " + this.f18304a);
            }
            this.f18311h.m4769e(false, false);
            this.f18304a.add(0, this.f18311h);
            ArrayList arrayList2 = this.f18311h.f17434a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                pn1 pn1Var = ((po1) obj).f27852b;
                if (pn1Var != null) {
                    pn1Var.f27790m = false;
                }
            }
            this.f18311h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList3 = this.f18299L;
            ArrayList arrayList4 = this.f18300M;
            synchronized (this.f18304a) {
                if (this.f18304a.isEmpty()) {
                    zMo3642a = false;
                } else {
                    try {
                        int size2 = this.f18304a.size();
                        int i2 = 0;
                        zMo3642a = false;
                        while (true) {
                            arrayList = this.f18304a;
                            if (i2 >= size2) {
                                break;
                            }
                            zMo3642a |= ((bo1) arrayList.get(i2)).mo3642a(arrayList3, arrayList4);
                            i2++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f18326w.f29432w.removeCallbacks(this.f18303P);
                    } catch (Throwable th) {
                        this.f18304a.clear();
                        this.f18326w.f29432w.removeCallbacks(this.f18303P);
                        throw th;
                    }
                }
            }
            if (!zMo3642a) {
                break;
            }
            z2 = true;
            this.f18305b = true;
            try {
                m5231T(this.f18299L, this.f18300M);
                m5245e();
            } catch (Throwable th2) {
                m5245e();
                throw th2;
            }
        }
        m5246e0();
        if (this.f18298K) {
            this.f18298K = false;
            m5242c0();
        }
        ((HashMap) this.f18306c.f33128d).values().removeAll(Collections.singleton(null));
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021c A[PHI: r15
  0x021c: PHI (r15v20 char) = (r15v19 char), (r15v22 char) binds: [B:103:0x0209, B:107:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX INFO: renamed from: B */
    public final void m5218B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        C1283w7 c1283w7 = this.f18306c;
        ArrayList arrayList3 = this.f18317n;
        boolean z4 = ((C0589dw) arrayList.get(i)).f17448o;
        ArrayList arrayList4 = this.f18301N;
        if (arrayList4 == null) {
            this.f18301N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f18301N.addAll(c1283w7.m12119F());
        pn1 pn1Var = this.f18329z;
        int i5 = i;
        boolean z5 = false;
        while (i5 < i2) {
            C0589dw c0589dw = (C0589dw) arrayList.get(i5);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            ArrayList arrayList5 = this.f18301N;
            if (zBooleanValue) {
                z = z4;
                i3 = i5;
                z2 = z5;
                int i6 = 1;
                ArrayList arrayList6 = c0589dw.f17434a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    po1 po1Var = (po1) arrayList6.get(size);
                    int i7 = po1Var.f27851a;
                    if (i7 != i6) {
                        if (i7 != 3) {
                            switch (i7) {
                                case 6:
                                    arrayList5.add(po1Var.f27852b);
                                    break;
                                case 8:
                                    pn1Var = null;
                                    break;
                                case 9:
                                    pn1Var = po1Var.f27852b;
                                    break;
                                case 10:
                                    po1Var.f27859i = po1Var.f27858h;
                                    break;
                            }
                        } else {
                            arrayList5.add(po1Var.f27852b);
                        }
                        size--;
                        i6 = 1;
                    }
                    arrayList5.remove(po1Var.f27852b);
                    size--;
                    i6 = 1;
                }
            } else {
                ArrayList arrayList7 = c0589dw.f17434a;
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    po1 po1Var2 = (po1) arrayList7.get(i8);
                    boolean z6 = z4;
                    int i9 = po1Var2.f27851a;
                    int i10 = i5;
                    int i11 = 1;
                    if (i9 != 1) {
                        z3 = z5;
                        if (i9 != 2) {
                            if (i9 == 3 || i9 == 6) {
                                arrayList5.remove(po1Var2.f27852b);
                                pn1 pn1Var2 = po1Var2.f27852b;
                                if (pn1Var2 == pn1Var) {
                                    arrayList7.add(i8, new po1(9, pn1Var2));
                                    i8++;
                                    pn1Var = null;
                                }
                            } else if (i9 == 7) {
                                i11 = 1;
                            } else if (i9 == 8) {
                                arrayList7.add(i8, new po1(9, pn1Var, 0));
                                po1Var2.f27853c = true;
                                i8++;
                                pn1Var = po1Var2.f27852b;
                            }
                            i11 = 1;
                        } else {
                            pn1 pn1Var3 = po1Var2.f27852b;
                            int i12 = pn1Var3.f27802y;
                            int size2 = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i13 = size2;
                                pn1 pn1Var4 = (pn1) arrayList5.get(size2);
                                if (pn1Var4.f27802y != i12) {
                                    i12 = i12;
                                } else if (pn1Var4 == pn1Var3) {
                                    i12 = i12;
                                    z7 = true;
                                } else {
                                    if (pn1Var4 == pn1Var) {
                                        arrayList7.add(i8, new po1(9, pn1Var4, 0));
                                        i8++;
                                        i4 = 0;
                                        pn1Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    po1 po1Var3 = new po1(3, pn1Var4, i4);
                                    po1Var3.f27854d = po1Var2.f27854d;
                                    po1Var3.f27856f = po1Var2.f27856f;
                                    po1Var3.f27855e = po1Var2.f27855e;
                                    po1Var3.f27857g = po1Var2.f27857g;
                                    arrayList7.add(i8, po1Var3);
                                    arrayList5.remove(pn1Var4);
                                    i8++;
                                    pn1Var = pn1Var;
                                }
                                size2 = i13 - 1;
                                i12 = i12;
                            }
                            i11 = 1;
                            if (z7) {
                                arrayList7.remove(i8);
                                i8--;
                            } else {
                                po1Var2.f27851a = 1;
                                po1Var2.f27853c = true;
                                arrayList5.add(pn1Var3);
                            }
                        }
                        i8 += i11;
                        z4 = z6;
                        i5 = i10;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(po1Var2.f27852b);
                    i8 += i11;
                    z4 = z6;
                    i5 = i10;
                    z5 = z3;
                }
                z = z4;
                i3 = i5;
                z2 = z5;
            }
            z5 = z2 || c0589dw.f17440g;
            i5 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.f18301N.clear();
        if (!z8 && this.f18325v >= 1) {
            for (int i14 = i; i14 < i2; i14++) {
                ArrayList arrayList8 = ((C0589dw) arrayList.get(i14)).f17434a;
                int size3 = arrayList8.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    pn1 pn1Var5 = ((po1) obj).f27852b;
                    if (pn1Var5 != null && pn1Var5.f27797t != null) {
                        c1283w7.m12123J(m5249h(pn1Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i;
        while (i16 < i2) {
            C0589dw c0589dw2 = (C0589dw) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                c0589dw2.m4767c(-1);
                eo1 eo1Var = c0589dw2.f17450q;
                ArrayList arrayList9 = c0589dw2.f17434a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    po1 po1Var4 = (po1) arrayList9.get(size4);
                    pn1 pn1Var6 = po1Var4.f27852b;
                    if (pn1Var6 != null) {
                        if (pn1Var6.f27764I != null) {
                            pn1Var6.m9576d().f26900a = z10;
                        }
                        int i17 = c0589dw2.f17439f;
                        char c = 8194;
                        char c2 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                c = 4100;
                                if (i17 != 8197) {
                                    c2 = 4099;
                                    if (i17 != 4099) {
                                        c = i17 != 4100 ? (char) 0 : (char) 8197;
                                    } else {
                                        c = c2;
                                    }
                                }
                            } else {
                                c = c2;
                            }
                        }
                        if (pn1Var6.f27764I != null || c != 0) {
                            pn1Var6.m9576d();
                            pn1Var6.f27764I.getClass();
                        }
                        pn1Var6.m9576d();
                        pn1Var6.f27764I.getClass();
                    }
                    switch (po1Var4.f27851a) {
                        case 1:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            z10 = true;
                            eo1Var.m5235X(pn1Var6, true);
                            eo1Var.m5230S(pn1Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + po1Var4.f27851a);
                        case 3:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            eo1Var.m5238a(pn1Var6);
                            z10 = true;
                            break;
                        case 4:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            m5216b0(pn1Var6);
                            z10 = true;
                            break;
                        case 5:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            eo1Var.m5235X(pn1Var6, true);
                            eo1Var.m5224I(pn1Var6);
                            z10 = true;
                            break;
                        case 6:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            eo1Var.m5241c(pn1Var6);
                            z10 = true;
                            break;
                        case 7:
                            pn1Var6.m9586w(po1Var4.f27854d, po1Var4.f27855e, po1Var4.f27856f, po1Var4.f27857g);
                            eo1Var.m5235X(pn1Var6, true);
                            eo1Var.m5250i(pn1Var6);
                            z10 = true;
                            break;
                        case 8:
                            eo1Var.m5237Z(null);
                            z10 = true;
                            break;
                        case 9:
                            eo1Var.m5237Z(pn1Var6);
                            z10 = true;
                            break;
                        case 10:
                            po1Var4.f27859i = pn1Var6.f27768M;
                            eo1Var.m5236Y(pn1Var6, po1Var4.f27858h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                c0589dw2.m4767c(1);
                eo1 eo1Var2 = c0589dw2.f17450q;
                ArrayList arrayList10 = c0589dw2.f17434a;
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    po1 po1Var5 = (po1) arrayList10.get(i18);
                    pn1 pn1Var7 = po1Var5.f27852b;
                    if (pn1Var7 != null) {
                        if (pn1Var7.f27764I != null) {
                            pn1Var7.m9576d().f26900a = false;
                        }
                        int i19 = c0589dw2.f17439f;
                        if (pn1Var7.f27764I != null || i19 != 0) {
                            pn1Var7.m9576d();
                            pn1Var7.f27764I.getClass();
                        }
                        pn1Var7.m9576d();
                        pn1Var7.f27764I.getClass();
                    }
                    switch (po1Var5.f27851a) {
                        case 1:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5235X(pn1Var7, false);
                            eo1Var2.m5238a(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + po1Var5.f27851a);
                        case 3:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5230S(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 4:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5224I(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 5:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5235X(pn1Var7, false);
                            m5216b0(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 6:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5250i(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 7:
                            pn1Var7.m9586w(po1Var5.f27854d, po1Var5.f27855e, po1Var5.f27856f, po1Var5.f27857g);
                            eo1Var2.m5235X(pn1Var7, false);
                            eo1Var2.m5241c(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 8:
                            eo1Var2.m5237Z(pn1Var7);
                            i18++;
                            str = str;
                            break;
                        case 9:
                            eo1Var2.m5237Z(null);
                            i18++;
                            str = str;
                            break;
                        case 10:
                            po1Var5.f27858h = pn1Var7.f27768M;
                            eo1Var2.m5236Y(pn1Var7, po1Var5.f27859i);
                            i18++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i20 = 0;
            while (i20 < size6) {
                Object obj2 = arrayList.get(i20);
                i20++;
                linkedHashSet.addAll(m5211E((C0589dw) obj2));
            }
            if (this.f18311h == null) {
                int size7 = arrayList3.size();
                int i21 = 0;
                while (i21 < size7) {
                    Object obj3 = arrayList3.get(i21);
                    i21++;
                    if (obj3 != null) {
                        xy4.m12778e();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i22 = 0;
                while (i22 < size8) {
                    Object obj4 = arrayList3.get(i22);
                    i22++;
                    if (obj4 != null) {
                        xy4.m12778e();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i23 = i; i23 < i2; i23++) {
            C0589dw c0589dw3 = (C0589dw) arrayList.get(i23);
            if (zBooleanValue2) {
                for (int size9 = c0589dw3.f17434a.size() - 1; size9 >= 0; size9--) {
                    pn1 pn1Var8 = ((po1) c0589dw3.f17434a.get(size9)).f27852b;
                    if (pn1Var8 != null) {
                        m5249h(pn1Var8).m8053j();
                    }
                }
            } else {
                ArrayList arrayList11 = c0589dw3.f17434a;
                int size10 = arrayList11.size();
                int i24 = 0;
                while (i24 < size10) {
                    Object obj5 = arrayList11.get(i24);
                    i24++;
                    pn1 pn1Var9 = ((po1) obj5).f27852b;
                    if (pn1Var9 != null) {
                        m5249h(pn1Var9).m8053j();
                    }
                }
            }
        }
        m5226O(this.f18325v, true);
        int i25 = i;
        for (xw0 xw0Var : m5248g(arrayList, i25, i2)) {
            xw0Var.f34657e = zBooleanValue2;
            synchronized (xw0Var.f34654b) {
                xw0Var.m12773f();
                ArrayList arrayList12 = xw0Var.f34654b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    va4 va4Var = (va4) listIterator.previous();
                    ua4 ua4Var = ua4.f31759a;
                    va4Var.getClass();
                    throw null;
                }
                xw0Var.f34658f = false;
            }
            xw0Var.m12770c();
        }
        while (i25 < i2) {
            C0589dw c0589dw4 = (C0589dw) arrayList.get(i25);
            if (((Boolean) arrayList2.get(i25)).booleanValue() && c0589dw4.f17452s >= 0) {
                c0589dw4.f17452s = -1;
            }
            if (c0589dw4.f17449p != null) {
                for (int i26 = 0; i26 < c0589dw4.f17449p.size(); i26++) {
                    ((Runnable) c0589dw4.f17449p.get(i26)).run();
                }
                c0589dw4.f17449p = null;
            }
            i25++;
        }
        if (!z9 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        xy4.m12778e();
    }

    /* JADX INFO: renamed from: C */
    public final pn1 m5219C(int i) {
        C1283w7 c1283w7 = this.f18306c;
        ArrayList arrayList = (ArrayList) c1283w7.f33127c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            pn1 pn1Var = (pn1) arrayList.get(size);
            if (pn1Var != null && pn1Var.f27801x == i) {
                return pn1Var;
            }
        }
        for (lo1 lo1Var : ((HashMap) c1283w7.f33128d).values()) {
            if (lo1Var != null) {
                pn1 pn1Var2 = lo1Var.f24224c;
                if (pn1Var2.f27801x == i) {
                    return pn1Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final void m5220D() {
        for (xw0 xw0Var : m5247f()) {
            if (xw0Var.f34658f) {
                if (m5212J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                xw0Var.f34658f = false;
                xw0Var.m12770c();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final ViewGroup m5221F(pn1 pn1Var) {
        ViewGroup viewGroup = pn1Var.f27761F;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pn1Var.f27802y <= 0 || !this.f18327x.mo8457Q()) {
            return null;
        }
        View viewMo8456P = this.f18327x.mo8456P(pn1Var.f27802y);
        if (viewMo8456P instanceof ViewGroup) {
            return (ViewGroup) viewMo8456P;
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final yn1 m5222G() {
        pn1 pn1Var = this.f18328y;
        return pn1Var != null ? pn1Var.f27797t.m5222G() : this.f18288A;
    }

    /* JADX INFO: renamed from: H */
    public final h50 m5223H() {
        pn1 pn1Var = this.f18328y;
        return pn1Var != null ? pn1Var.f27797t.m5223H() : this.f18289B;
    }

    /* JADX INFO: renamed from: I */
    public final void m5224I(pn1 pn1Var) {
        if (m5212J(2)) {
            Log.v("FragmentManager", "hide: " + pn1Var);
        }
        if (pn1Var.f27756A) {
            return;
        }
        pn1Var.f27756A = true;
        pn1Var.f27765J = true ^ pn1Var.f27765J;
        m5239a0(pn1Var);
    }

    /* JADX INFO: renamed from: L */
    public final boolean m5225L() {
        pn1 pn1Var = this.f18328y;
        if (pn1Var == null) {
            return true;
        }
        return pn1Var.f27798u != null && pn1Var.f27788k && pn1Var.m9579g().m5225L();
    }

    /* JADX INFO: renamed from: O */
    public final void m5226O(int i, boolean z) {
        rn1 rn1Var;
        if (this.f18326w == null && i != -1) {
            C1077qn.m9989o("No activity");
            return;
        }
        if (z || i != this.f18325v) {
            this.f18325v = i;
            C1283w7 c1283w7 = this.f18306c;
            HashMap map = (HashMap) c1283w7.f33128d;
            ArrayList arrayList = (ArrayList) c1283w7.f33127c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                lo1 lo1Var = (lo1) map.get(((pn1) obj).f27782e);
                if (lo1Var != null) {
                    lo1Var.m8053j();
                }
            }
            for (lo1 lo1Var2 : map.values()) {
                if (lo1Var2 != null) {
                    lo1Var2.m8053j();
                    pn1 pn1Var = lo1Var2.f24224c;
                    if (pn1Var.f27789l && !pn1Var.m9583k()) {
                        c1283w7.m12124K(lo1Var2);
                    }
                }
            }
            m5242c0();
            if (this.f18294G && (rn1Var = this.f18326w) != null && this.f18325v == 7) {
                rn1Var.f29434y.invalidateOptionsMenu();
                this.f18294G = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5227P() {
        if (this.f18326w == null) {
            return;
        }
        this.f18295H = false;
        this.f18296I = false;
        this.f18302O.f20752g = false;
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null) {
                pn1Var.f27799v.m5227P();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5228Q() {
        m5217A(false);
        m5267z(true);
        pn1 pn1Var = this.f18329z;
        if (pn1Var != null && pn1Var.m9577e().m5228Q()) {
            return true;
        }
        boolean zM5229R = m5229R(this.f18299L, this.f18300M, -1, 0);
        if (zM5229R) {
            this.f18305b = true;
            try {
                m5231T(this.f18299L, this.f18300M);
                m5245e();
            } catch (Throwable th) {
                m5245e();
                throw th;
            }
        }
        m5246e0();
        if (this.f18298K) {
            this.f18298K = false;
            m5242c0();
        }
        ((HashMap) this.f18306c.f33128d).values().removeAll(Collections.singleton(null));
        return zM5229R;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m5229R(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.f18307d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f18307d.size() - 1;
            } else {
                int size2 = this.f18307d.size() - 1;
                while (size2 >= 0) {
                    C0589dw c0589dw = (C0589dw) this.f18307d.get(size2);
                    if (i >= 0 && i == c0589dw.f17452s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C0589dw c0589dw2 = (C0589dw) this.f18307d.get(size - 1);
                        if (i < 0 || i != c0589dw2.f17452s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f18307d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f18307d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0589dw) this.f18307d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final void m5230S(pn1 pn1Var) {
        if (m5212J(2)) {
            Log.v("FragmentManager", "remove: " + pn1Var + " nesting=" + pn1Var.f27796s);
        }
        boolean zM9583k = pn1Var.m9583k();
        if (pn1Var.f27757B && zM9583k) {
            return;
        }
        C1283w7 c1283w7 = this.f18306c;
        synchronized (((ArrayList) c1283w7.f33127c)) {
            ((ArrayList) c1283w7.f33127c).remove(pn1Var);
        }
        pn1Var.f27788k = false;
        if (m5213K(pn1Var)) {
            this.f18294G = true;
        }
        pn1Var.f27789l = true;
        m5239a0(pn1Var);
    }

    /* JADX INFO: renamed from: T */
    public final void m5231T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C1077qn.m9989o("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0589dw) arrayList.get(i)).f17448o) {
                if (i2 != i) {
                    m5218B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0589dw) arrayList.get(i2)).f17448o) {
                        i2++;
                    }
                }
                m5218B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m5218B(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m5232U(Bundle bundle) {
        int i;
        lo1 lo1Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f18326w.f29431v.getClassLoader());
                this.f18316m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f18326w.f29431v.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1283w7 c1283w7 = this.f18306c;
        HashMap map2 = (HashMap) c1283w7.f33129e;
        HashMap map3 = (HashMap) c1283w7.f33128d;
        map2.clear();
        map2.putAll(map);
        String str3 = "state";
        fo1 fo1Var = (fo1) bundle.getParcelable("state");
        if (fo1Var == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = fo1Var.f19171a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            nh3 nh3Var = this.f18318o;
            if (i2 >= size) {
                ho1 ho1Var = this.f18302O;
                ho1Var.getClass();
                ArrayList arrayList2 = new ArrayList(ho1Var.f20747b.values());
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    pn1 pn1Var = (pn1) obj;
                    if (map3.get(pn1Var.f27782e) == null) {
                        if (m5212J(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + pn1Var + " that was not found in the set of active Fragments " + fo1Var.f19171a);
                        }
                        this.f18302O.m6463f(pn1Var);
                        pn1Var.f27797t = this;
                        lo1 lo1Var2 = new lo1(nh3Var, c1283w7, pn1Var);
                        lo1Var2.f24226e = 1;
                        lo1Var2.m8053j();
                        pn1Var.f27789l = true;
                        lo1Var2.m8053j();
                    }
                }
                ArrayList arrayList3 = fo1Var.f19172b;
                ((ArrayList) c1283w7.f33127c).clear();
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = arrayList3.get(i4);
                        i4++;
                        String str4 = (String) obj2;
                        pn1 pn1VarM12150z = c1283w7.m12150z(str4);
                        if (pn1VarM12150z == null) {
                            C1077qn.m9989o(zi4.m13621u("No instantiated fragment for (", str4, ")"));
                            return;
                        }
                        if (m5212J(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str4 + "): " + pn1VarM12150z);
                        }
                        c1283w7.m12135d(pn1VarM12150z);
                    }
                }
                if (fo1Var.f19173c != null) {
                    this.f18307d = new ArrayList(fo1Var.f19173c.length);
                    int i5 = 0;
                    while (true) {
                        C0628ew[] c0628ewArr = fo1Var.f19173c;
                        if (i5 >= c0628ewArr.length) {
                            break;
                        }
                        C0628ew c0628ew = c0628ewArr[i5];
                        ArrayList arrayList4 = c0628ew.f18519b;
                        C0589dw c0589dw = new C0589dw(this);
                        int[] iArr = c0628ew.f18518a;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < iArr.length) {
                            po1 po1Var = new po1();
                            int i8 = i6 + 1;
                            po1Var.f27851a = iArr[i6];
                            if (m5212J(2)) {
                                Log.v("FragmentManager", "Instantiate " + c0589dw + " op #" + i7 + " base fragment #" + iArr[i8]);
                            }
                            po1Var.f27858h = fk2.values()[c0628ew.f18520c[i7]];
                            po1Var.f27859i = fk2.values()[c0628ew.f18521d[i7]];
                            int i9 = i6 + 2;
                            po1Var.f27853c = iArr[i8] != 0;
                            int i10 = iArr[i9];
                            po1Var.f27854d = i10;
                            int i11 = iArr[i6 + 3];
                            po1Var.f27855e = i11;
                            int i12 = i6 + 5;
                            int i13 = iArr[i6 + 4];
                            po1Var.f27856f = i13;
                            i6 += 6;
                            int[] iArr2 = iArr;
                            int i14 = iArr2[i12];
                            po1Var.f27857g = i14;
                            c0589dw.f17435b = i10;
                            c0589dw.f17436c = i11;
                            c0589dw.f17437d = i13;
                            c0589dw.f17438e = i14;
                            c0589dw.m4766b(po1Var);
                            i7++;
                            iArr = iArr2;
                        }
                        c0589dw.f17439f = c0628ew.f18522e;
                        c0589dw.f17441h = c0628ew.f18523f;
                        c0589dw.f17440g = true;
                        c0589dw.f17442i = c0628ew.f18525h;
                        c0589dw.f17443j = c0628ew.f18526i;
                        c0589dw.f17444k = c0628ew.f18527j;
                        c0589dw.f17445l = c0628ew.f18528k;
                        c0589dw.f17446m = c0628ew.f18529l;
                        c0589dw.f17447n = c0628ew.f18530m;
                        c0589dw.f17448o = c0628ew.f18531n;
                        c0589dw.f17452s = c0628ew.f18524g;
                        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                            String str5 = (String) arrayList4.get(i15);
                            if (str5 != null) {
                                ((po1) c0589dw.f17434a.get(i15)).f27852b = c1283w7.m12150z(str5);
                            }
                        }
                        c0589dw.m4767c(1);
                        if (m5212J(2)) {
                            StringBuilder sbM3883o = c75.m3883o("restoreAllState: back stack #", i5, " (index ");
                            sbM3883o.append(c0589dw.f17452s);
                            sbM3883o.append("): ");
                            sbM3883o.append(c0589dw);
                            Log.v("FragmentManager", sbM3883o.toString());
                            PrintWriter printWriter = new PrintWriter(new qn2());
                            c0589dw.m4771g("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f18307d.add(c0589dw);
                        i5++;
                    }
                    i = 0;
                } else {
                    i = 0;
                    this.f18307d = new ArrayList();
                }
                this.f18314k.set(fo1Var.f19174d);
                String str6 = fo1Var.f19175e;
                if (str6 != null) {
                    pn1 pn1VarM12150z2 = c1283w7.m12150z(str6);
                    this.f18329z = pn1VarM12150z2;
                    m5260s(pn1VarM12150z2);
                }
                ArrayList arrayList5 = fo1Var.f19176f;
                if (arrayList5 != null) {
                    for (int i16 = i; i16 < arrayList5.size(); i16++) {
                        this.f18315l.put((String) arrayList5.get(i16), (C0666fw) fo1Var.f19177g.get(i16));
                    }
                }
                this.f18293F = new ArrayDeque(fo1Var.f19178h);
                return;
            }
            Object obj3 = arrayList.get(i2);
            i2++;
            Bundle bundleM12129P = c1283w7.m12129P((String) obj3, null);
            if (bundleM12129P != null) {
                pn1 pn1Var2 = (pn1) this.f18302O.f20747b.get(((ko1) bundleM12129P.getParcelable(str3)).f23272b);
                if (pn1Var2 != null) {
                    if (m5212J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pn1Var2);
                    }
                    lo1Var = new lo1();
                    lo1Var.f24225d = false;
                    lo1Var.f24226e = -1;
                    lo1Var.f24222a = nh3Var;
                    lo1Var.f24223b = c1283w7;
                    lo1Var.f24224c = pn1Var2;
                    pn1Var2.f27780c = null;
                    pn1Var2.f27781d = null;
                    pn1Var2.f27796s = 0;
                    pn1Var2.f27792o = false;
                    pn1Var2.f27788k = false;
                    pn1 pn1Var3 = pn1Var2.f27784g;
                    pn1Var2.f27785h = pn1Var3 != null ? pn1Var3.f27782e : null;
                    pn1Var2.f27784g = null;
                    pn1Var2.f27779b = bundleM12129P;
                    pn1Var2.f27783f = bundleM12129P.getBundle("arguments");
                    VarHandle.storeStoreFence();
                } else {
                    ClassLoader classLoader = this.f18326w.f29431v.getClassLoader();
                    yn1 yn1VarM5222G = m5222G();
                    lo1Var = new lo1();
                    lo1Var.f24225d = false;
                    lo1Var.f24226e = -1;
                    lo1Var.f24222a = nh3Var;
                    lo1Var.f24223b = c1283w7;
                    ko1 ko1Var = (ko1) bundleM12129P.getParcelable(str3);
                    pn1 pn1VarM13180a = yn1VarM5222G.m13180a(ko1Var.f23271a);
                    pn1VarM13180a.f27782e = ko1Var.f23272b;
                    pn1VarM13180a.f27791n = ko1Var.f23273c;
                    pn1VarM13180a.f27793p = ko1Var.f23274d;
                    pn1VarM13180a.f27794q = true;
                    pn1VarM13180a.f27801x = ko1Var.f23275e;
                    pn1VarM13180a.f27802y = ko1Var.f23276f;
                    pn1VarM13180a.f27803z = ko1Var.f23277g;
                    pn1VarM13180a.f27758C = ko1Var.f23278h;
                    pn1VarM13180a.f27789l = ko1Var.f23279i;
                    pn1VarM13180a.f27757B = ko1Var.f23280j;
                    pn1VarM13180a.f27756A = ko1Var.f23281k;
                    pn1VarM13180a.f27768M = fk2.values()[ko1Var.f23282l];
                    pn1VarM13180a.f27785h = ko1Var.f23283m;
                    pn1VarM13180a.f27786i = ko1Var.f23284n;
                    pn1VarM13180a.f27763H = ko1Var.f23285o;
                    lo1Var.f24224c = pn1VarM13180a;
                    pn1VarM13180a.f27779b = bundleM12129P;
                    Bundle bundle4 = bundleM12129P.getBundle("arguments");
                    if (bundle4 != null) {
                        bundle4.setClassLoader(classLoader);
                    }
                    eo1 eo1Var = pn1VarM13180a.f27797t;
                    if (eo1Var != null && (eo1Var.f18295H || eo1Var.f18296I)) {
                        C1077qn.m9989o("Fragment already added and state has been saved");
                        return;
                    }
                    pn1VarM13180a.f27783f = bundle4;
                    if (m5212J(2)) {
                        Log.v("FragmentManager", "Instantiated fragment " + pn1VarM13180a);
                    }
                    VarHandle.storeStoreFence();
                }
                pn1 pn1Var4 = lo1Var.f24224c;
                pn1Var4.f27779b = bundleM12129P;
                pn1Var4.f27797t = this;
                if (m5212J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + pn1Var4.f27782e + "): " + pn1Var4);
                }
                lo1Var.m8055l(this.f18326w.f29431v.getClassLoader());
                c1283w7.m12123J(lo1Var);
                lo1Var.f24226e = this.f18325v;
            } else {
                str3 = str3;
                arrayList = arrayList;
            }
            arrayList = arrayList;
            str3 = str3;
        }
    }

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
    /* JADX INFO: renamed from: V */
    public final Bundle m5233V() throws Exception {
        int i;
        ArrayList arrayList;
        String str;
        C0628ew[] c0628ewArr;
        int i2;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        m5220D();
        m5265x();
        byte b = 1;
        m5217A(true);
        this.f18295H = true;
        this.f18302O.f20752g = true;
        C1283w7 c1283w7 = this.f18306c;
        c1283w7.getClass();
        HashMap map = (HashMap) c1283w7.f33128d;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            lo1 lo1Var = (lo1) it.next();
            if (lo1Var != null) {
                pn1 pn1Var = lo1Var.f24224c;
                String str2 = pn1Var.f27782e;
                Bundle bundle3 = new Bundle();
                pn1 pn1Var2 = lo1Var.f24224c;
                if (pn1Var2.f27778a == -1 && (bundle = pn1Var2.f27779b) != null) {
                    bundle3.putAll(bundle);
                }
                ko1 ko1Var = new ko1();
                ko1Var.f23271a = pn1Var2.getClass().getName();
                ko1Var.f23272b = pn1Var2.f27782e;
                ko1Var.f23273c = pn1Var2.f27791n;
                ko1Var.f23274d = pn1Var2.f27793p;
                ko1Var.f23275e = pn1Var2.f27801x;
                ko1Var.f23276f = pn1Var2.f27802y;
                ko1Var.f23277g = pn1Var2.f27803z;
                ko1Var.f23278h = pn1Var2.f27758C;
                ko1Var.f23279i = pn1Var2.f27789l;
                ko1Var.f23280j = pn1Var2.f27757B;
                ko1Var.f23281k = pn1Var2.f27756A;
                ko1Var.f23282l = pn1Var2.f27768M.ordinal();
                ko1Var.f23283m = pn1Var2.f27785h;
                ko1Var.f23284n = pn1Var2.f27786i;
                ko1Var.f23285o = pn1Var2.f27763H;
                bundle3.putParcelable("state", ko1Var);
                if (pn1Var2.f27778a > 0) {
                    Bundle bundle4 = new Bundle();
                    i50 i50Var = pn1Var2.f27774S;
                    i2 = 2;
                    mn1 mn1Var = new mn1(b);
                    mn1Var.f25061b = pn1Var2;
                    mn1Var.f25062c = bundle4;
                    VarHandle.storeStoreFence();
                    i50Var.m6673k(mn1Var, "Fragment#onSaveInstanceState");
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    lo1Var.f24222a.m8760y(pn1Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    pn1Var2.f27773R.m9609g(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM5233V = pn1Var2.f27799v.m5233V();
                    if (!bundleM5233V.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM5233V);
                    }
                    SparseArray<? extends Parcelable> sparseArray = pn1Var2.f27780c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = pn1Var2.f27781d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                } else {
                    i2 = 2;
                }
                Bundle bundle7 = pn1Var2.f27783f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c1283w7.m12129P(str2, bundle3);
                arrayList2.add(pn1Var.f27782e);
                if (m5212J(i2)) {
                    Log.v("FragmentManager", "Saved state of " + pn1Var + ": " + pn1Var.f27779b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f18306c.f33129e;
        if (!map2.isEmpty()) {
            C1283w7 c1283w8 = this.f18306c;
            synchronized (((ArrayList) c1283w8.f33127c)) {
                try {
                    if (((ArrayList) c1283w8.f33127c).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c1283w8.f33127c).size());
                        ArrayList arrayList3 = (ArrayList) c1283w8.f33127c;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList3.get(i3);
                            i3++;
                            pn1 pn1Var3 = (pn1) obj;
                            arrayList.add(pn1Var3.f27782e);
                            if (m5212J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + pn1Var3.f27782e + "): " + pn1Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.f18307d.size();
            if (size2 > 0) {
                c0628ewArr = new C0628ew[size2];
                int i4 = 0;
                while (i4 < size2) {
                    C0589dw c0589dw = (C0589dw) this.f18307d.get(i4);
                    C0628ew c0628ew = new C0628ew();
                    int size3 = c0589dw.f17434a.size();
                    c0628ew.f18518a = new int[size3 * 6];
                    if (!c0589dw.f17440g) {
                        C1077qn.m9989o("Not on back stack");
                        return null;
                    }
                    c0628ew.f18519b = new ArrayList(size3);
                    c0628ew.f18520c = new int[size3];
                    c0628ew.f18521d = new int[size3];
                    int i5 = i;
                    int i6 = i5;
                    while (i5 < size3) {
                        po1 po1Var = (po1) c0589dw.f17434a.get(i5);
                        int i7 = i6 + 1;
                        c0628ew.f18518a[i6] = po1Var.f27851a;
                        ArrayList arrayList4 = c0628ew.f18519b;
                        pn1 pn1Var4 = po1Var.f27852b;
                        arrayList4.add(pn1Var4 != null ? pn1Var4.f27782e : null);
                        int[] iArr = c0628ew.f18518a;
                        iArr[i7] = po1Var.f27853c ? 1 : 0;
                        iArr[i6 + 2] = po1Var.f27854d;
                        iArr[i6 + 3] = po1Var.f27855e;
                        int i8 = i6 + 5;
                        iArr[i6 + 4] = po1Var.f27856f;
                        i6 += 6;
                        iArr[i8] = po1Var.f27857g;
                        c0628ew.f18520c[i5] = po1Var.f27858h.ordinal();
                        c0628ew.f18521d[i5] = po1Var.f27859i.ordinal();
                        i5++;
                        size2 = size2;
                    }
                    int i9 = size2;
                    c0628ew.f18522e = c0589dw.f17439f;
                    c0628ew.f18523f = c0589dw.f17441h;
                    c0628ew.f18524g = c0589dw.f17452s;
                    c0628ew.f18525h = c0589dw.f17442i;
                    c0628ew.f18526i = c0589dw.f17443j;
                    c0628ew.f18527j = c0589dw.f17444k;
                    c0628ew.f18528k = c0589dw.f17445l;
                    c0628ew.f18529l = c0589dw.f17446m;
                    c0628ew.f18530m = c0589dw.f17447n;
                    c0628ew.f18531n = c0589dw.f17448o;
                    c0628ewArr[i4] = c0628ew;
                    if (m5212J(2)) {
                        StringBuilder sbM3883o = c75.m3883o("saveAllState: adding back stack #", i4, ": ");
                        sbM3883o.append(this.f18307d.get(i4));
                        Log.v("FragmentManager", sbM3883o.toString());
                    }
                    i4++;
                    size2 = i9;
                    i = 0;
                }
                str = null;
            } else {
                str = null;
                c0628ewArr = null;
            }
            fo1 fo1Var = new fo1();
            fo1Var.f19175e = str;
            ArrayList arrayList5 = new ArrayList();
            fo1Var.f19176f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            fo1Var.f19177g = arrayList6;
            fo1Var.f19171a = arrayList2;
            fo1Var.f19172b = arrayList;
            fo1Var.f19173c = c0628ewArr;
            fo1Var.f19174d = this.f18314k.get();
            pn1 pn1Var5 = this.f18329z;
            if (pn1Var5 != null) {
                fo1Var.f19175e = pn1Var5.f27782e;
            }
            arrayList5.addAll(this.f18315l.keySet());
            arrayList6.addAll(this.f18315l.values());
            fo1Var.f19178h = new ArrayList(this.f18293F);
            bundle2.putParcelable("state", fo1Var);
            for (String str3 : this.f18316m.keySet()) {
                bundle2.putBundle(zi4.m13620t("result_", str3), (Bundle) this.f18316m.get(str3));
            }
            for (String str4 : map2.keySet()) {
                bundle2.putBundle(zi4.m13620t("fragment_", str4), (Bundle) map2.get(str4));
            }
        } else if (m5212J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: W */
    public final void m5234W() {
        synchronized (this.f18304a) {
            try {
                if (this.f18304a.size() == 1) {
                    this.f18326w.f29432w.removeCallbacks(this.f18303P);
                    this.f18326w.f29432w.post(this.f18303P);
                    m5246e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m5235X(pn1 pn1Var, boolean z) {
        ViewGroup viewGroupM5221F = m5221F(pn1Var);
        if (viewGroupM5221F == null || !(viewGroupM5221F instanceof tn1)) {
            return;
        }
        ((tn1) viewGroupM5221F).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: Y */
    public final void m5236Y(pn1 pn1Var, fk2 fk2Var) {
        if (pn1Var == this.f18306c.m12150z(pn1Var.f27782e) && (pn1Var.f27798u == null || pn1Var.f27797t == this)) {
            pn1Var.f27768M = fk2Var;
        } else {
            nm0.m8797j("Fragment ", pn1Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m5237Z(pn1 pn1Var) {
        if (pn1Var != null) {
            if (pn1Var != this.f18306c.m12150z(pn1Var.f27782e) || (pn1Var.f27798u != null && pn1Var.f27797t != this)) {
                nm0.m8797j("Fragment ", pn1Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        pn1 pn1Var2 = this.f18329z;
        this.f18329z = pn1Var;
        m5260s(pn1Var2);
        m5260s(this.f18329z);
    }

    /* JADX INFO: renamed from: a */
    public final lo1 m5238a(pn1 pn1Var) {
        String str = pn1Var.f27767L;
        if (str != null) {
            oo1.m9220c(pn1Var, str);
        }
        if (m5212J(2)) {
            Log.v("FragmentManager", "add: " + pn1Var);
        }
        lo1 lo1VarM5249h = m5249h(pn1Var);
        pn1Var.f27797t = this;
        C1283w7 c1283w7 = this.f18306c;
        c1283w7.m12123J(lo1VarM5249h);
        if (!pn1Var.f27757B) {
            c1283w7.m12135d(pn1Var);
            pn1Var.f27789l = false;
            pn1Var.f27765J = false;
            if (m5213K(pn1Var)) {
                this.f18294G = true;
            }
        }
        return lo1VarM5249h;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5239a0(pn1 pn1Var) {
        ViewGroup viewGroupM5221F = m5221F(pn1Var);
        if (viewGroupM5221F != null) {
            on1 on1Var = pn1Var.f27764I;
            if ((on1Var == null ? 0 : on1Var.f26904e) + (on1Var == null ? 0 : on1Var.f26903d) + (on1Var == null ? 0 : on1Var.f26902c) + (on1Var == null ? 0 : on1Var.f26901b) > 0) {
                if (viewGroupM5221F.getTag(C0995R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM5221F.setTag(C0995R.id.visible_removing_fragment_view_tag, pn1Var);
                }
                pn1 pn1Var2 = (pn1) viewGroupM5221F.getTag(C0995R.id.visible_removing_fragment_view_tag);
                on1 on1Var2 = pn1Var.f27764I;
                boolean z = on1Var2 != null ? on1Var2.f26900a : false;
                if (pn1Var2.f27764I == null) {
                    return;
                }
                pn1Var2.m9576d().f26900a = z;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5240b(rn1 rn1Var, se0 se0Var, pn1 pn1Var) {
        ho1 ho1Var;
        if (this.f18326w != null) {
            C1077qn.m9989o("Already attached");
            return;
        }
        this.f18326w = rn1Var;
        this.f18327x = se0Var;
        this.f18328y = pn1Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18319p;
        if (pn1Var != null) {
            zn1 zn1Var = new zn1();
            zn1Var.f36196a = pn1Var;
            VarHandle.storeStoreFence();
            copyOnWriteArrayList.add(zn1Var);
        } else if (rn1Var != null) {
            copyOnWriteArrayList.add(rn1Var);
        }
        if (this.f18328y != null) {
            m5246e0();
        }
        if (rn1Var != null) {
            t33 onBackPressedDispatcher = rn1Var.f29434y.getOnBackPressedDispatcher();
            this.f18310g = onBackPressedDispatcher;
            onBackPressedDispatcher.m10973a(pn1Var != null ? pn1Var : rn1Var, this.f18313j);
        }
        byte b = 0;
        if (pn1Var != null) {
            ho1 ho1Var2 = pn1Var.f27797t.f18302O;
            HashMap map = ho1Var2.f20748c;
            ho1Var = (ho1) map.get(pn1Var.f27782e);
            if (ho1Var == null) {
                ho1Var = new ho1(ho1Var2.f20750e);
                map.put(pn1Var.f27782e, ho1Var);
            }
            this.f18302O = ho1Var;
        } else if (rn1Var != null) {
            js1 js1Var = new js1(rn1Var.f29434y.mo2976c(), ho1.f20746h);
            r90 r90VarM10361a = rl3.m10361a(ho1.class);
            C1283w7 c1283w7 = (C1283w7) js1Var.f22555a;
            String strM10248a = r90VarM10361a.m10248a();
            if (strM10248a == null) {
                C1077qn.m9987m("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                ho1Var = (ho1) c1283w7.m12122I(r90VarM10361a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM10248a));
                this.f18302O = ho1Var;
            }
        } else {
            ho1Var = new ho1(false);
            this.f18302O = ho1Var;
        }
        ho1 ho1Var3 = ho1Var;
        byte b2 = 1;
        ho1Var.f20752g = this.f18295H || this.f18296I;
        this.f18306c.f33126b = ho1Var3;
        rn1 rn1Var2 = this.f18326w;
        byte b3 = 3;
        if (rn1Var2 != null && pn1Var == null) {
            yu3 savedStateRegistry = rn1Var2.getSavedStateRegistry();
            vf0 vf0Var = new vf0(b3);
            vf0Var.f32563b = this;
            VarHandle.storeStoreFence();
            savedStateRegistry.m13255c("android:support:fragments", vf0Var);
            Bundle bundleM13253a = savedStateRegistry.m13253a("android:support:fragments");
            if (bundleM13253a != null) {
                m5232U(bundleM13253a);
            }
        }
        rn1 rn1Var3 = this.f18326w;
        if (rn1Var3 != null) {
            zf0 zf0Var = rn1Var3.f29434y.f14455i;
            String strConcat = "FragmentManager:".concat(pn1Var != null ? zi4.m13623w(new StringBuilder(), pn1Var.f27782e, ":") : "");
            String strConcat2 = strConcat.concat("StartActivityForResult");
            C0006a5 c0006a5 = new C0006a5(b2);
            js1 js1Var2 = new js1();
            js1Var2.f22555a = this;
            VarHandle.storeStoreFence();
            this.f18290C = zf0Var.m13545c(strConcat2, c0006a5, js1Var2);
            String strConcat3 = strConcat.concat("StartIntentSenderForResult");
            C0006a5 c0006a6 = new C0006a5(b3);
            wn1 wn1Var = new wn1(b2);
            wn1Var.f33515b = this;
            VarHandle.storeStoreFence();
            this.f18291D = zf0Var.m13545c(strConcat3, c0006a6, wn1Var);
            String strConcat4 = strConcat.concat("RequestPermissions");
            C0006a5 c0006a7 = new C0006a5(b);
            wn1 wn1Var2 = new wn1(b);
            wn1Var2.f33515b = this;
            VarHandle.storeStoreFence();
            this.f18292E = zf0Var.m13545c(strConcat4, c0006a7, wn1Var2);
        }
        rn1 rn1Var4 = this.f18326w;
        if (rn1Var4 != null) {
            rn1Var4.f29434y.m2977d(this.f18320q);
        }
        rn1 rn1Var5 = this.f18326w;
        if (rn1Var5 != null) {
            rn1Var5.f29434y.f14457k.add(this.f18321r);
        }
        rn1 rn1Var6 = this.f18326w;
        if (rn1Var6 != null) {
            rn1Var6.f29434y.f14459m.add(this.f18322s);
        }
        rn1 rn1Var7 = this.f18326w;
        if (rn1Var7 != null) {
            rn1Var7.f29434y.f14460n.add(this.f18323t);
        }
        rn1 rn1Var8 = this.f18326w;
        if (rn1Var8 == null || pn1Var != null) {
            return;
        }
        jp0 jp0Var = rn1Var8.f29434y.f14449c;
        ((CopyOnWriteArrayList) jp0Var.f22482c).add(this.f18324u);
        ((rf0) jp0Var.f22481b).run();
    }

    /* JADX INFO: renamed from: c */
    public final void m5241c(pn1 pn1Var) {
        if (m5212J(2)) {
            Log.v("FragmentManager", "attach: " + pn1Var);
        }
        if (pn1Var.f27757B) {
            pn1Var.f27757B = false;
            if (pn1Var.f27788k) {
                return;
            }
            this.f18306c.m12135d(pn1Var);
            if (m5212J(2)) {
                Log.v("FragmentManager", "add from attach: " + pn1Var);
            }
            if (m5213K(pn1Var)) {
                this.f18294G = true;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m5242c0() {
        ArrayList arrayListM12117D = this.f18306c.m12117D();
        int size = arrayListM12117D.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM12117D.get(i);
            i++;
            lo1 lo1Var = (lo1) obj;
            pn1 pn1Var = lo1Var.f24224c;
            if (pn1Var.f27762G) {
                if (this.f18305b) {
                    this.f18298K = true;
                } else {
                    pn1Var.f27762G = false;
                    lo1Var.m8053j();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5243d() {
        if (m5212J(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f18311h);
        }
        C0589dw c0589dw = this.f18311h;
        if (c0589dw != null) {
            c0589dw.f17451r = false;
            c0589dw.m4768d();
            C0589dw c0589dw2 = this.f18311h;
            RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 8);
            runnableC1054q0.f28115b = this;
            VarHandle.storeStoreFence();
            ArrayList arrayList = c0589dw2.f17449p;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c0589dw2.f17449p = arrayList;
            }
            arrayList.add(runnableC1054q0);
            this.f18311h.m4769e(false, true);
            this.f18312i = true;
            m5217A(true);
            m5220D();
            this.f18312i = false;
            this.f18311h = null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m5244d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new qn2());
        rn1 rn1Var = this.f18326w;
        if (rn1Var == null) {
            try {
                m5264w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            rn1Var.f29434y.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5245e() {
        this.f18305b = false;
        this.f18300M.clear();
        this.f18299L.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m5246e0() {
        synchronized (this.f18304a) {
            try {
                if (!this.f18304a.isEmpty()) {
                    this.f18313j.setEnabled(true);
                    if (m5212J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f18307d.size() + (this.f18311h != null ? 1 : 0) > 0 && m5215N(this.f18328y);
                if (m5212J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f18313j.setEnabled(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final HashSet m5247f() {
        xw0 xw0Var;
        HashSet hashSet = new HashSet();
        ArrayList arrayListM12117D = this.f18306c.m12117D();
        int size = arrayListM12117D.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM12117D.get(i);
            i++;
            ViewGroup viewGroup = ((lo1) obj).f24224c.f27761F;
            if (viewGroup != null) {
                m5223H();
                Object tag = viewGroup.getTag(C0995R.id.special_effects_controller_view_tag);
                if (tag instanceof xw0) {
                    xw0Var = (xw0) tag;
                } else {
                    xw0Var = new xw0();
                    xw0Var.f34653a = viewGroup;
                    xw0Var.f34654b = new ArrayList();
                    xw0Var.f34655c = new ArrayList();
                    viewGroup.setTag(C0995R.id.special_effects_controller_view_tag, xw0Var);
                }
                hashSet.add(xw0Var);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: g */
    public final HashSet m5248g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        xw0 xw0Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((C0589dw) arrayList.get(i)).f17434a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                pn1 pn1Var = ((po1) obj).f27852b;
                if (pn1Var != null && (viewGroup = pn1Var.f27761F) != null) {
                    m5223H();
                    Object tag = viewGroup.getTag(C0995R.id.special_effects_controller_view_tag);
                    if (tag instanceof xw0) {
                        xw0Var = (xw0) tag;
                    } else {
                        xw0Var = new xw0();
                        xw0Var.f34653a = viewGroup;
                        xw0Var.f34654b = new ArrayList();
                        xw0Var.f34655c = new ArrayList();
                        viewGroup.setTag(C0995R.id.special_effects_controller_view_tag, xw0Var);
                    }
                    hashSet.add(xw0Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: h */
    public final lo1 m5249h(pn1 pn1Var) {
        String str = pn1Var.f27782e;
        C1283w7 c1283w7 = this.f18306c;
        lo1 lo1Var = (lo1) ((HashMap) c1283w7.f33128d).get(str);
        if (lo1Var != null) {
            return lo1Var;
        }
        lo1 lo1Var2 = new lo1(this.f18318o, c1283w7, pn1Var);
        lo1Var2.m8055l(this.f18326w.f29431v.getClassLoader());
        lo1Var2.f24226e = this.f18325v;
        return lo1Var2;
    }

    /* JADX INFO: renamed from: i */
    public final void m5250i(pn1 pn1Var) {
        if (m5212J(2)) {
            Log.v("FragmentManager", "detach: " + pn1Var);
        }
        if (pn1Var.f27757B) {
            return;
        }
        pn1Var.f27757B = true;
        if (pn1Var.f27788k) {
            if (m5212J(2)) {
                Log.v("FragmentManager", "remove from detach: " + pn1Var);
            }
            C1283w7 c1283w7 = this.f18306c;
            synchronized (((ArrayList) c1283w7.f33127c)) {
                ((ArrayList) c1283w7.f33127c).remove(pn1Var);
            }
            pn1Var.f27788k = false;
            if (m5213K(pn1Var)) {
                this.f18294G = true;
            }
            m5239a0(pn1Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5251j(boolean z) {
        if (z && this.f18326w != null) {
            m5244d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null) {
                pn1Var.f27760E = true;
                if (z) {
                    pn1Var.f27799v.m5251j(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5252k() {
        if (this.f18325v >= 1) {
            for (pn1 pn1Var : this.f18306c.m12119F()) {
                if (pn1Var != null) {
                    if (!pn1Var.f27756A ? pn1Var.f27799v.m5252k() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5253l() {
        if (this.f18325v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null && m5214M(pn1Var)) {
                if (!pn1Var.f27756A ? pn1Var.f27799v.m5253l() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pn1Var);
                    z = true;
                }
            }
        }
        if (this.f18308e != null) {
            for (int i = 0; i < this.f18308e.size(); i++) {
                pn1 pn1Var2 = (pn1) this.f18308e.get(i);
                if (arrayList == null || !arrayList.contains(pn1Var2)) {
                    pn1Var2.getClass();
                }
            }
        }
        this.f18308e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final void m5254m() throws Exception {
        boolean zIsChangingConfigurations = true;
        this.f18297J = true;
        m5217A(true);
        m5265x();
        rn1 rn1Var = this.f18326w;
        C1283w7 c1283w7 = this.f18306c;
        if (rn1Var != null) {
            zIsChangingConfigurations = ((ho1) c1283w7.f33126b).f20751f;
        } else {
            EsActivity esActivity = rn1Var.f29431v;
            if (esActivity != null) {
                zIsChangingConfigurations = true ^ esActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f18315l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0666fw) it.next()).f19348a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ho1) c1283w7.f33126b).m6461d((String) obj, false);
                }
            }
        }
        m5263v(-1);
        rn1 rn1Var2 = this.f18326w;
        if (rn1Var2 != null) {
            rn1Var2.f29434y.f14457k.remove(this.f18321r);
        }
        rn1 rn1Var3 = this.f18326w;
        if (rn1Var3 != null) {
            rn1Var3.f29434y.f14456j.remove(this.f18320q);
        }
        rn1 rn1Var4 = this.f18326w;
        if (rn1Var4 != null) {
            rn1Var4.f29434y.f14459m.remove(this.f18322s);
        }
        rn1 rn1Var5 = this.f18326w;
        if (rn1Var5 != null) {
            rn1Var5.f29434y.f14460n.remove(this.f18323t);
        }
        rn1 rn1Var6 = this.f18326w;
        if (rn1Var6 != null && this.f18328y == null) {
            jp0 jp0Var = rn1Var6.f29434y.f14449c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) jp0Var.f22482c;
            xn1 xn1Var = this.f18324u;
            copyOnWriteArrayList.remove(xn1Var);
            if (((HashMap) jp0Var.f22483d).remove(xn1Var) == null) {
                ((rf0) jp0Var.f22481b).run();
            } else {
                xy4.m12778e();
            }
        }
        this.f18326w = null;
        this.f18327x = null;
        this.f18328y = null;
        if (this.f18310g != null) {
            this.f18313j.remove();
            this.f18310g = null;
        }
        C0638f5 c0638f5 = this.f18290C;
        if (c0638f5 != null) {
            c0638f5.m5557J();
            this.f18291D.m5557J();
            this.f18292E.m5557J();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5255n(boolean z) {
        if (z && this.f18326w != null) {
            m5244d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null) {
                pn1Var.f27760E = true;
                if (z) {
                    pn1Var.f27799v.m5255n(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5256o(boolean z) {
        if (z && this.f18326w != null) {
            m5244d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null && z) {
                pn1Var.f27799v.m5256o(true);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m5257p() {
        ArrayList arrayListM12118E = this.f18306c.m12118E();
        int size = arrayListM12118E.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM12118E.get(i);
            i++;
            pn1 pn1Var = (pn1) obj;
            if (pn1Var != null) {
                pn1Var.m9582j();
                pn1Var.f27799v.m5257p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5258q() {
        if (this.f18325v >= 1) {
            for (pn1 pn1Var : this.f18306c.m12119F()) {
                if (pn1Var != null) {
                    if (!pn1Var.f27756A ? pn1Var.f27799v.m5258q() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m5259r() {
        if (this.f18325v < 1) {
            return;
        }
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null && !pn1Var.f27756A) {
                pn1Var.f27799v.m5259r();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5260s(pn1 pn1Var) {
        if (pn1Var != null) {
            if (pn1Var != this.f18306c.m12150z(pn1Var.f27782e)) {
                return;
            }
            pn1Var.f27797t.getClass();
            boolean zM5215N = m5215N(pn1Var);
            Boolean bool = pn1Var.f27787j;
            if (bool == null || bool.booleanValue() != zM5215N) {
                pn1Var.f27787j = Boolean.valueOf(zM5215N);
                eo1 eo1Var = pn1Var.f27799v;
                eo1Var.m5246e0();
                eo1Var.m5260s(eo1Var.f18329z);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5261t(boolean z) {
        if (z && this.f18326w != null) {
            m5244d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null && z) {
                pn1Var.f27799v.m5261t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        pn1 pn1Var = this.f18328y;
        if (pn1Var != null) {
            sb.append(pn1Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f18328y)));
            sb.append("}");
        } else {
            rn1 rn1Var = this.f18326w;
            if (rn1Var != null) {
                sb.append(rn1Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f18326w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5262u() {
        if (this.f18325v < 1) {
            return false;
        }
        boolean z = false;
        for (pn1 pn1Var : this.f18306c.m12119F()) {
            if (pn1Var != null && m5214M(pn1Var)) {
                if (!pn1Var.f27756A ? pn1Var.f27799v.m5262u() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: v */
    public final void m5263v(int i) {
        try {
            this.f18305b = true;
            for (lo1 lo1Var : ((HashMap) this.f18306c.f33128d).values()) {
                if (lo1Var != null) {
                    lo1Var.f24226e = i;
                }
            }
            m5226O(i, false);
            Iterator it = m5247f().iterator();
            while (it.hasNext()) {
                ((xw0) it.next()).m12771d();
            }
            this.f18305b = false;
            m5217A(true);
        } catch (Throwable th) {
            this.f18305b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5264w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String str3 = str + "    ";
        C1283w7 c1283w7 = this.f18306c;
        ArrayList arrayList = (ArrayList) c1283w7.f33127c;
        String str4 = str + "    ";
        HashMap map = (HashMap) c1283w7.f33128d;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (lo1 lo1Var : map.values()) {
                printWriter.print(str);
                if (lo1Var != null) {
                    pn1 pn1Var = lo1Var.f24224c;
                    printWriter.println(pn1Var);
                    pn1Var.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(pn1Var.f27801x));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(pn1Var.f27802y));
                    printWriter.print(" mTag=");
                    printWriter.println(pn1Var.f27803z);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(pn1Var.f27778a);
                    printWriter.print(" mWho=");
                    printWriter.print(pn1Var.f27782e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(pn1Var.f27796s);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(pn1Var.f27788k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(pn1Var.f27789l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(pn1Var.f27791n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(pn1Var.f27792o);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(pn1Var.f27756A);
                    printWriter.print(" mDetached=");
                    printWriter.print(pn1Var.f27757B);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(pn1Var.f27759D);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(pn1Var.f27758C);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(pn1Var.f27763H);
                    if (pn1Var.f27797t != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(pn1Var.f27797t);
                    }
                    if (pn1Var.f27798u != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(pn1Var.f27798u);
                    }
                    if (pn1Var.f27800w != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(pn1Var.f27800w);
                    }
                    if (pn1Var.f27783f != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(pn1Var.f27783f);
                    }
                    if (pn1Var.f27779b != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(pn1Var.f27779b);
                    }
                    if (pn1Var.f27780c != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(pn1Var.f27780c);
                    }
                    if (pn1Var.f27781d != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(pn1Var.f27781d);
                    }
                    Object objM12150z = pn1Var.f27784g;
                    if (objM12150z == null) {
                        eo1 eo1Var = pn1Var.f27797t;
                        objM12150z = (eo1Var == null || (str2 = pn1Var.f27785h) == null) ? null : eo1Var.f18306c.m12150z(str2);
                    }
                    if (objM12150z != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM12150z);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(pn1Var.f27786i);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    on1 on1Var = pn1Var.f27764I;
                    printWriter.println(on1Var == null ? false : on1Var.f26900a);
                    on1 on1Var2 = pn1Var.f27764I;
                    if ((on1Var2 == null ? 0 : on1Var2.f26901b) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        on1 on1Var3 = pn1Var.f27764I;
                        printWriter.println(on1Var3 == null ? 0 : on1Var3.f26901b);
                    }
                    on1 on1Var4 = pn1Var.f27764I;
                    if ((on1Var4 == null ? 0 : on1Var4.f26902c) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        on1 on1Var5 = pn1Var.f27764I;
                        printWriter.println(on1Var5 == null ? 0 : on1Var5.f26902c);
                    }
                    on1 on1Var6 = pn1Var.f27764I;
                    if ((on1Var6 == null ? 0 : on1Var6.f26903d) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        on1 on1Var7 = pn1Var.f27764I;
                        printWriter.println(on1Var7 == null ? 0 : on1Var7.f26903d);
                    }
                    on1 on1Var8 = pn1Var.f27764I;
                    if ((on1Var8 == null ? 0 : on1Var8.f26904e) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        on1 on1Var9 = pn1Var.f27764I;
                        printWriter.println(on1Var9 == null ? 0 : on1Var9.f26904e);
                    }
                    if (pn1Var.f27761F != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(pn1Var.f27761F);
                    }
                    rn1 rn1Var = pn1Var.f27798u;
                    if ((rn1Var != null ? rn1Var.f29431v : null) != null) {
                        z32.m13299D(pn1Var).m13328x(str4, printWriter);
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + pn1Var.f27799v + ":");
                    pn1Var.f27799v.m5264w(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                pn1 pn1Var2 = (pn1) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(pn1Var2.toString());
            }
        }
        ArrayList arrayList2 = this.f18308e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                pn1 pn1Var3 = (pn1) this.f18308e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(pn1Var3.toString());
            }
        }
        int size3 = this.f18307d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C0589dw c0589dw = (C0589dw) this.f18307d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0589dw.toString());
                c0589dw.m4771g(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18314k.get());
        synchronized (this.f18304a) {
            try {
                int size4 = this.f18304a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (bo1) this.f18304a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18326w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18327x);
        if (this.f18328y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18328y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18325v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f18295H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18296I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f18297J);
        if (this.f18294G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f18294G);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m5265x() {
        Iterator it = m5247f().iterator();
        while (it.hasNext()) {
            ((xw0) it.next()).m12771d();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5266y(bo1 bo1Var, boolean z) {
        if (!z) {
            if (this.f18326w == null) {
                if (this.f18297J) {
                    C1077qn.m9989o("FragmentManager has been destroyed");
                    return;
                } else {
                    C1077qn.m9989o("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f18295H || this.f18296I) {
                C1077qn.m9989o("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f18304a) {
            try {
                if (this.f18326w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18304a.add(bo1Var);
                    m5234W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5267z(boolean z) {
        if (this.f18305b) {
            C1077qn.m9989o("FragmentManager is already executing transactions");
            return;
        }
        if (this.f18326w == null) {
            if (this.f18297J) {
                C1077qn.m9989o("FragmentManager has been destroyed");
                return;
            } else {
                C1077qn.m9989o("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f18326w.f29432w.getLooper()) {
            C1077qn.m9989o("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f18295H || this.f18296I)) {
            C1077qn.m9989o("Can not perform this action after onSaveInstanceState");
        } else if (this.f18299L == null) {
            this.f18299L = new ArrayList();
            this.f18300M = new ArrayList();
        }
    }
}
