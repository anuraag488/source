package p000;

import android.text.Layout;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: rv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1122rv implements ai3, p73 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29650a;

    /* JADX INFO: renamed from: b */
    public Object f29651b;

    /* JADX INFO: renamed from: c */
    public Object f29652c;

    /* JADX INFO: renamed from: d */
    public Object f29653d;

    /* JADX INFO: renamed from: e */
    public Object f29654e;

    /* JADX INFO: renamed from: f */
    public Object f29655f;

    public C1122rv(C0875lk c0875lk, ky0 ky0Var, am1 am1Var, xl4 xl4Var, List list, boolean z) {
        int i;
        C0875lk c0875lk2 = c0875lk;
        xl4 xl4Var2 = xl4Var;
        this.f29650a = (byte) 5;
        this.f29651b = c0875lk2;
        this.f29652c = list;
        aj2 aj2Var = aj2.f14537b;
        zu2 zu2Var = new zu2((byte) 0);
        zu2Var.f36383b = this;
        VarHandle.storeStoreFence();
        this.f29653d = i25.m6630z(aj2Var, zu2Var);
        zu2 zu2Var2 = new zu2((byte) 1);
        zu2Var2.f36383b = this;
        VarHandle.storeStoreFence();
        this.f29654e = i25.m6630z(aj2Var, zu2Var2);
        r73 r73Var = xl4Var2.f34390b;
        C0875lk c0875lk3 = AbstractC0912mk.f24972a;
        ArrayList arrayList = c0875lk2.f24094d;
        String str = c0875lk2.f24092b;
        v71 v71Var = v71.f32439a;
        List listM6315a1 = arrayList != null ? hb0.m6315a1(arrayList, new vl1((byte) 6)) : v71Var;
        ArrayList arrayList2 = new ArrayList();
        C0461ao c0461ao = new C0461ao();
        int size = listM6315a1.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C0838kk c0838kk = (C0838kk) listM6315a1.get(i2);
            r73 r73VarM10231a = r73Var.m10231a((r73) c0838kk.f23186a);
            int i4 = c0838kk.f23187b;
            int i5 = c0838kk.f23188c;
            if (i4 > i5) {
                r32.m10186a("Reversed range is not supported");
            }
            while (i3 < i4 && !c0461ao.isEmpty()) {
                C0838kk c0838kk2 = (C0838kk) c0461ao.last();
                listM6315a1 = listM6315a1;
                int i6 = c0838kk2.f23188c;
                v71Var = v71Var;
                Object obj = c0838kk2.f23186a;
                if (i4 < i6) {
                    arrayList2.add(new C0838kk(i3, i4, obj));
                    i3 = i4;
                } else {
                    int i7 = size;
                    arrayList2.add(new C0838kk(i3, i6, obj));
                    i3 = c0838kk2.f23188c;
                    while (!c0461ao.isEmpty() && i3 == ((C0838kk) c0461ao.last()).f23188c) {
                        c0461ao.removeLast();
                    }
                    size = i7;
                }
            }
            List list2 = listM6315a1;
            v71 v71Var2 = v71Var;
            int i8 = size;
            if (i3 < i4) {
                arrayList2.add(new C0838kk(i3, i4, r73Var));
                i3 = i4;
            }
            C0838kk c0838kk3 = (C0838kk) c0461ao.m3093l();
            if (c0838kk3 != null) {
                int i9 = c0838kk3.f23188c;
                Object obj2 = c0838kk3.f23186a;
                int i10 = c0838kk3.f23187b;
                if (i10 == i4 && i9 == i5) {
                    c0461ao.removeLast();
                    c0461ao.addLast(new C0838kk(i4, i5, ((r73) obj2).m10231a(r73VarM10231a)));
                } else if (i10 == i9) {
                    arrayList2.add(new C0838kk(i10, i9, obj2));
                    c0461ao.removeLast();
                    c0461ao.addLast(new C0838kk(i4, i5, r73VarM10231a));
                } else {
                    if (i9 < i5) {
                        ds3.m4665g();
                        throw null;
                    }
                    c0461ao.addLast(new C0838kk(i4, i5, ((r73) obj2).m10231a(r73VarM10231a)));
                }
            } else {
                c0461ao.addLast(new C0838kk(i4, i5, r73VarM10231a));
            }
            i2++;
            listM6315a1 = list2;
            v71Var = v71Var2;
            size = i8;
        }
        v71 v71Var3 = v71Var;
        while (i3 <= str.length() && !c0461ao.isEmpty()) {
            C0838kk c0838kk4 = (C0838kk) c0461ao.last();
            Object obj3 = c0838kk4.f23186a;
            int i11 = c0838kk4.f23188c;
            arrayList2.add(new C0838kk(i3, i11, obj3));
            while (!c0461ao.isEmpty() && i11 == ((C0838kk) c0461ao.last()).f23188c) {
                c0461ao.removeLast();
            }
            i3 = i11;
        }
        if (i3 < str.length()) {
            arrayList2.add(new C0838kk(i3, str.length(), r73Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C0838kk(0, 0, r73Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int i12 = i;
        for (int size2 = arrayList2.size(); i12 < size2; size2 = size2) {
            C0838kk c0838kk5 = (C0838kk) arrayList2.get(i12);
            int i13 = c0838kk5.f23187b;
            int i14 = c0838kk5.f23188c;
            String strSubstring = i13 != i14 ? str.substring(i13, i14) : "";
            List listM8335a = AbstractC0912mk.m8335a(c0875lk2, i13, i14, new C0891m((byte) 25));
            C0875lk c0875lk4 = new C0875lk(strSubstring, listM8335a == null ? v71Var3 : listM8335a);
            r73 r73Var2 = (r73) c0838kk5.f23186a;
            if (r73Var2.f29065b == 0) {
                r73Var2 = new r73(r73Var2.f29064a, r73Var.f29065b, r73Var2.f29066c, r73Var2.f29067d, r73Var2.f29068e, r73Var2.f29069f, r73Var2.f29070g, r73Var2.f29071h, r73Var2.f29072i);
            }
            xl4 xl4Var3 = new xl4(xl4Var2.f34389a, r73Var.m10231a(r73Var2));
            List list3 = c0875lk4.f24091a;
            List list4 = list3 == null ? v71Var3 : list3;
            List list5 = (List) this.f29652c;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i15 = 0;
            while (i15 < size3) {
                C0838kk c0838kk6 = (C0838kk) list5.get(i15);
                int i16 = c0838kk6.f23187b;
                r73 r73Var3 = r73Var;
                int i17 = c0838kk6.f23188c;
                if (AbstractC0912mk.m8336b(i13, i14, i16, i17)) {
                    if (i13 > i16 || i17 > i14) {
                        r32.m10186a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new C0838kk(i16 - i13, i17 - i13, c0838kk6.f23186a));
                }
                i15++;
                r73Var = r73Var3;
                list5 = list5;
            }
            C0452af c0452afM13773d = zt5.m13773d(strSubstring, xl4Var3, list4, ky0Var, am1Var, arrayList4, z);
            o73 o73Var = new o73();
            o73Var.f26411a = c0452afM13773d;
            o73Var.f26412b = i13;
            o73Var.f26413c = i14;
            VarHandle.storeStoreFence();
            arrayList3.add(o73Var);
            i12++;
            c0875lk2 = c0875lk;
            xl4Var2 = xl4Var;
            str = str;
        }
        this.f29655f = arrayList3;
    }

    @Override // p000.p73
    /* JADX INFO: renamed from: a */
    public float mo2950a() {
        return ((Number) ((pg2) this.f29653d).getValue()).floatValue();
    }

    @Override // p000.p73
    /* JADX INFO: renamed from: b */
    public boolean mo2951b() {
        ArrayList arrayList = (ArrayList) this.f29655f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o73) arrayList.get(i)).f26411a.mo2951b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.p73
    /* JADX INFO: renamed from: c */
    public float mo2952c() {
        return ((Number) ((pg2) this.f29654e).getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    public void m10445d(y40 y40Var, Class cls) {
        ((ArrayList) this.f29652c).add(new l73(y40Var, cls));
    }

    /* JADX INFO: renamed from: e */
    public void m10446e(ne1 ne1Var, Class cls) {
        ((ArrayList) this.f29654e).add(new l73(ne1Var, cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public d70 m10447f(AbstractC1085qv abstractC1085qv, wp1 wp1Var) {
        int i;
        int i2;
        int i3;
        ol3 ol3Var = new ol3();
        ol3Var.f26851a = -1;
        synchronized (this.f29651b) {
            Throwable th = (Throwable) this.f29652c;
            if (th != null) {
                abstractC1085qv.mo8486b(th);
                return gb5.f19710a;
            }
            C1339xp c1339xp = (C1339xp) this.f29653d;
            do {
                i = c1339xp.get();
                i2 = i + 1;
            } while (!c1339xp.compareAndSet(i, i2));
            byte b = 0;
            byte b2 = 0;
            byte b3 = (134217727 & i2) == 1;
            ol3Var.f26851a = (i2 >>> 27) & 15;
            ((cw2) this.f29654e).m4200a(abstractC1085qv);
            if (b3 != false && wp1Var != null) {
                try {
                    wp1Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f29651b) {
                        try {
                            if (((Throwable) this.f29652c) == null) {
                                this.f29652c = th2;
                                cw2 cw2Var = (cw2) this.f29654e;
                                Object[] objArr = cw2Var.f16532a;
                                int i4 = cw2Var.f16533b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((AbstractC1085qv) objArr[i5]).mo8486b(th2);
                                }
                                ((cw2) this.f29654e).m4203d();
                                C1339xp c1339xp2 = (C1339xp) this.f29653d;
                                do {
                                    i3 = c1339xp2.get();
                                } while (!c1339xp2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            C1048pv c1048pv = new C1048pv(b);
            c1048pv.f28016b = abstractC1085qv;
            c1048pv.f28017c = this;
            c1048pv.f28018d = ol3Var;
            VarHandle.storeStoreFence();
            nh3 nh3Var = new nh3((byte) 26, (boolean) (b2 == true ? 1 : 0));
            nh3Var.f25810b = c1048pv;
            nh3Var.f25811c = new C1339xp(0);
            VarHandle.storeStoreFence();
            return nh3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX INFO: renamed from: g */
    public Bidi m10448g(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f29651b;
        ArrayList arrayList = (ArrayList) this.f29652c;
        ArrayList arrayList2 = (ArrayList) this.f29653d;
        boolean[] zArr = (boolean[]) this.f29654e;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f29655f;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m10457p(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f29655f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f29655f = cArr2;
        return bidi;
    }

    @Override // p000.ai3
    public Object get() {
        switch (this.f29650a) {
            case 3:
                Executor executor = (Executor) ((ai3) this.f29651b).get();
                vs2 vs2Var = (vs2) ((ai3) this.f29652c).get();
                jp0 jp0Var = (jp0) ((tt2) this.f29653d).get();
                pt3 pt3Var = (pt3) ((ai3) this.f29654e).get();
                pt3 pt3Var2 = (pt3) ((ai3) this.f29655f).get();
                qw0 qw0Var = new qw0();
                qw0Var.f28843b = executor;
                qw0Var.f28844c = vs2Var;
                qw0Var.f28842a = jp0Var;
                qw0Var.f28845d = pt3Var;
                qw0Var.f28846e = pt3Var2;
                VarHandle.storeStoreFence();
                return qw0Var;
            case 6:
                sg1 sg1Var = (sg1) ((ai3) this.f29652c).get();
                zm3 zm3Var = (zm3) ((ai3) this.f29654e).get();
                ai3 ai3Var = (ai3) this.f29655f;
                og2 i11Var = ai3Var instanceof og2 ? (og2) ai3Var : new i11(ai3Var);
                ym3 ym3Var = new ym3();
                ym3Var.f35329a = sg1Var;
                ym3Var.f35330b = zm3Var;
                ym3Var.f35331c = i11Var;
                ym3Var.f35332d = hx2.m6530a();
                VarHandle.storeStoreFence();
                return ym3Var;
            default:
                hg1 hg1Var = (hg1) ((v42) this.f29651b).f32392a;
                sg1 sg1Var2 = (sg1) ((ai3) this.f29652c).get();
                s34 s34Var = (s34) ((ai3) this.f29653d).get();
                xa1 xa1Var = (xa1) ((ai3) this.f29654e).get();
                ro0 ro0Var = (ro0) ((ai3) this.f29655f).get();
                g34 g34Var = new g34();
                g34Var.f19588a = hg1Var;
                g34Var.f19589b = sg1Var2;
                g34Var.f19590c = s34Var;
                g34Var.f19591d = xa1Var;
                g34Var.f19592e = ro0Var;
                VarHandle.storeStoreFence();
                return g34Var;
        }
    }

    /* JADX INFO: renamed from: h */
    public ig0 m10449h() {
        return new ig0(AbstractC1356y5.m12901J((ArrayList) this.f29651b), AbstractC1356y5.m12901J((ArrayList) this.f29652c), AbstractC1356y5.m12901J((ArrayList) this.f29653d), AbstractC1356y5.m12901J((ArrayList) this.f29654e), AbstractC1356y5.m12901J((ArrayList) this.f29655f));
    }

    /* JADX INFO: renamed from: i */
    public bo3 m10450i() {
        dz1 dz1Var = (dz1) this.f29651b;
        if (dz1Var == null) {
            C1077qn.m9989o("url == null");
            return null;
        }
        String str = (String) this.f29652c;
        uv1 uv1VarM11167c = ((tv1) this.f29653d).m11167c();
        zi3 zi3Var = (zi3) this.f29654e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f29655f;
        byte[] bArr = zv4.f36415a;
        Map mapUnmodifiableMap = linkedHashMap.isEmpty() ? w71.f33134a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
        bo3 bo3Var = new bo3();
        bo3Var.f15462a = dz1Var;
        bo3Var.f15463b = str;
        bo3Var.f15464c = uv1VarM11167c;
        bo3Var.f15465d = zi3Var;
        bo3Var.f15466e = mapUnmodifiableMap;
        VarHandle.storeStoreFence();
        return bo3Var;
    }

    /* JADX INFO: renamed from: j */
    public void m10451j(x50 x50Var) {
        String string = x50Var.toString();
        int length = string.length();
        tv1 tv1Var = (tv1) this.f29653d;
        if (length == 0) {
            tv1Var.m11178n("Cache-Control");
        } else {
            tv1Var.m11179o("Cache-Control", string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: k */
    public Object m10452k(ym0 ym0Var) {
        nt0 nt0Var;
        ru0 ru0Var = (ru0) this.f29655f;
        if (ym0Var instanceof nt0) {
            nt0Var = (nt0) ym0Var;
            int i = nt0Var.f26078v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nt0Var.f26078v = i - Integer.MIN_VALUE;
            } else {
                nt0Var = new nt0(this, ym0Var);
            }
        } else {
            nt0Var = new nt0(this, ym0Var);
        }
        Object obj = nt0Var.f26076t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = nt0Var.f26078v;
        wm0 wm0Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        }
        k43.m7376J(obj);
        nt0Var.f26078v = 1;
        obj = null;
        gh3 gh3Var = (gh3) obj;
        ro0 ro0Var = (ro0) this.f29653d;
        C0671g0 c0671g0 = new C0671g0(ru0Var, gh3Var, this, wm0Var, (byte) 18);
        nt0Var.f26078v = 2;
        if (lb5.m7921b0(ro0Var, c0671g0, nt0Var) == ap0Var) {
            return ap0Var;
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: l */
    public void m10453l(yp1 yp1Var) {
        int i;
        synchronized (this.f29651b) {
            try {
                cw2 cw2Var = (cw2) this.f29654e;
                this.f29654e = (cw2) this.f29655f;
                this.f29655f = cw2Var;
                C1339xp c1339xp = (C1339xp) this.f29653d;
                do {
                    i = c1339xp.get();
                } while (!c1339xp.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = cw2Var.f16533b;
                for (int i3 = 0; i3 < i2; i3++) {
                    yp1Var.invoke(cw2Var.m4206g(i3));
                }
                cw2Var.m4203d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public float m10454m(int i, boolean z) {
        Layout layout = (Layout) this.f29651b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: n */
    public float m10455n(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f29651b;
        if (!z2) {
            return m10454m(i, z);
        }
        int iM5355e0 = ev0.m5355e0(layout, i, z2);
        int lineStart = layout.getLineStart(iM5355e0);
        int lineEnd = layout.getLineEnd(iM5355e0);
        if (i != lineStart && i != lineEnd) {
            return m10454m(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m10454m(i, z);
        }
        int iM10456o = m10456o(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m10457p(iM10456o))) == -1;
        int iM10460s = m10460s(lineEnd, lineStart);
        int iM10457p = m10457p(iM10456o);
        int i4 = lineStart - iM10457p;
        int i5 = iM10460s - iM10457p;
        Bidi bidiM10448g = m10448g(iM10456o);
        Bidi bidiCreateLineBidi = bidiM10448g != null ? bidiM10448g.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM5355e0) : layout.getLineRight(iM5355e0);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        ff2[] ff2VarArr = new ff2[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            ff2VarArr[i6] = new ff2(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, ff2VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (ff2VarArr[i8].f18948a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == ff2VarArr[i3].f18950c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iM5355e0);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(ff2VarArr[i3 - 1].f18948a) : layout.getPrimaryHorizontal(ff2VarArr[i3 + 1].f18948a);
            }
            return layout.getLineRight(iM5355e0);
        }
        int iM10460s2 = i > iM10460s ? m10460s(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (ff2VarArr[i9].f18949b == iM10460s2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == ff2VarArr[i2].f18950c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iM5355e0);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(ff2VarArr[i2 - 1].f18949b) : layout.getPrimaryHorizontal(ff2VarArr[i2 + 1].f18949b);
        }
        return layout.getLineRight(iM5355e0);
    }

    /* JADX INFO: renamed from: o */
    public int m10456o(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f29652c;
        int iM7738v = kx5.m7738v(arrayList, Integer.valueOf(i));
        int i2 = iM7738v < 0 ? -(iM7738v + 1) : iM7738v + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public int m10457p(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f29652c).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: q */
    public ze4 m10458q() {
        we4 we4Var = (we4) this.f29654e;
        if (!(we4Var instanceof we4)) {
            we4Var = null;
        }
        if (we4Var != null) {
            return (ze4) we4Var.f33280a.f33090b;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m10459r(String str, String str2) {
        ((tv1) this.f29653d).m11179o(str, str2);
    }

    /* JADX INFO: renamed from: s */
    public int m10460s(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f29651b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((z62.m13393u(cCharAt, 8192) < 0 || z62.m13393u(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: t */
    public void m10461t(String str, zi3 zi3Var) {
        if (str.length() <= 0) {
            C1077qn.m9987m("method.isEmpty() == true");
            return;
        }
        if (zi3Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                C1077qn.m9988n(zi4.m13621u("method ", str, " must have a request body."));
                return;
            }
        } else if (!ks5.m7597D(str)) {
            C1077qn.m9988n(zi4.m13621u("method ", str, " must not have a request body."));
            return;
        }
        this.f29652c = str;
        this.f29654e = zi3Var;
    }

    /* JADX INFO: renamed from: u */
    public void m10462u(String str) {
        ((tv1) this.f29653d).m11178n(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: v */
    public Object m10463v(ym0 ym0Var) throws Throwable {
        it3 it3Var;
        gx2 gx2Var;
        Throwable th;
        gx2 gx2Var2;
        cf0 cf0Var = (cf0) this.f29652c;
        if (ym0Var instanceof it3) {
            it3Var = (it3) ym0Var;
            int i = it3Var.f21773w;
            if ((i & Integer.MIN_VALUE) != 0) {
                it3Var.f21773w = i - Integer.MIN_VALUE;
            } else {
                it3Var = new it3(this, ym0Var);
            }
        } else {
            it3Var = new it3(this, ym0Var);
        }
        Object obj = it3Var.f21771u;
        Object obj2 = ap0.f14763a;
        int i2 = it3Var.f21773w;
        ju4 ju4Var = ju4.f22634a;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                if (cf0Var.mo4971B()) {
                    return ju4Var;
                }
                gx2Var = (gx2) this.f29651b;
                it3Var.f21770t = gx2Var;
                it3Var.f21773w = 1;
                if (gx2Var.m6191e(it3Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gx2Var2 = it3Var.f21770t;
                try {
                    k43.m7376J(obj);
                    cf0Var.m4989U(ju4Var);
                    gx2Var2.m6193g(null);
                    return ju4Var;
                } catch (Throwable th2) {
                    th = th2;
                    gx2Var2.m6193g(null);
                    throw th;
                }
            }
            gx2 gx2Var3 = it3Var.f21770t;
            k43.m7376J(obj);
            gx2Var = gx2Var3;
            if (cf0Var.mo4971B()) {
                gx2Var.m6193g(null);
                return ju4Var;
            }
            it3Var.f21770t = gx2Var;
            it3Var.f21773w = 2;
            if (m10452k(it3Var) != obj2) {
                gx2Var2 = gx2Var;
                cf0Var.m4989U(ju4Var);
                gx2Var2.m6193g(null);
                return ju4Var;
            }
            return obj2;
        } catch (Throwable th3) {
            gx2 gx2Var4 = gx2Var;
            th = th3;
            gx2Var2 = gx2Var4;
            gx2Var2.m6193g(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m10464w(C1417zt c1417zt, np4 np4Var) {
        mp4 mp4Var = (mp4) this.f29655f;
        C0588dv c0588dv = (C0588dv) this.f29651b;
        String str = (String) this.f29652c;
        vo4 vo4Var = (vo4) this.f29654e;
        if (vo4Var == null) {
            xy4.m12782k("Null transformer");
            return;
        }
        j81 j81Var = (j81) this.f29653d;
        qw0 qw0Var = mp4Var.f25117c;
        C0588dv c0588dvM4742b = c0588dv.m4742b(c1417zt.f36350b);
        C0940nb c0940nb = new C0940nb((byte) 1);
        c0940nb.f25610g = new HashMap();
        c0940nb.f25608e = Long.valueOf(mp4Var.f25115a.mo5609j());
        c0940nb.f25609f = Long.valueOf(mp4Var.f25116b.mo5609j());
        c0940nb.f25605b = str;
        c0940nb.f25607d = new f81(j81Var, (byte[]) vo4Var.apply(c1417zt.f36349a));
        c0940nb.f25606c = null;
        C0467au c0467auM8669e = c0940nb.m8669e();
        Executor executor = qw0Var.f28843b;
        ow0 ow0Var = new ow0((byte) 0);
        ow0Var.f27155b = qw0Var;
        ow0Var.f27156c = c0588dvM4742b;
        ow0Var.f27157d = np4Var;
        ow0Var.f27158e = c0467auM8669e;
        VarHandle.storeStoreFence();
        executor.execute(ow0Var);
    }

    /* JADX INFO: renamed from: x */
    public void m10465x(Object obj, String str) {
        ((LinkedHashMap) this.f29651b).put(str, obj);
        ac4 ac4Var = (ac4) ((LinkedHashMap) this.f29653d).get(str);
        if (ac4Var != null) {
            ac4Var.m199j(obj);
        }
        ac4 ac4Var2 = (ac4) ((LinkedHashMap) this.f29654e).get(str);
        if (ac4Var2 != null) {
            ac4Var2.m199j(obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m10466y(ve4 ve4Var) {
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zy5.m13843G(ve4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((vq3) this.f29652c).f32801b + "')");
    }

    /* JADX INFO: renamed from: z */
    public void m10467z(String str) {
        if (od4.m9043X(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (od4.m9043X(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        cz1 cz1Var = new cz1();
        cz1Var.m4240c(null, str);
        this.f29651b = cz1Var.m4238a();
    }

    public /* synthetic */ C1122rv(boolean z) {
        this.f29650a = (byte) 7;
    }

    public C1122rv(Map map) {
        this.f29650a = (byte) 9;
        this.f29651b = new LinkedHashMap(map);
        this.f29652c = new LinkedHashMap();
        this.f29653d = new LinkedHashMap();
        this.f29654e = new LinkedHashMap();
        vf0 vf0Var = new vf0((byte) 4);
        vf0Var.f32563b = this;
        VarHandle.storeStoreFence();
        this.f29655f = vf0Var;
    }

    public C1122rv(byte b) {
        this.f29650a = b;
        switch (b) {
            case 7:
                this.f29655f = new LinkedHashMap();
                this.f29652c = "GET";
                this.f29653d = new tv1((byte) 0);
                break;
            default:
                this.f29651b = new Object();
                this.f29653d = new C1339xp(0);
                this.f29654e = new cw2();
                this.f29655f = new cw2();
                break;
        }
    }

    public /* synthetic */ C1122rv(byte b, boolean z) {
        this.f29650a = b;
    }
}
