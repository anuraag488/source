package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class el3 extends ui0 {

    /* JADX INFO: renamed from: a */
    public final C1034ph f18214a;

    /* JADX INFO: renamed from: b */
    public final tt2 f18215b;

    /* JADX INFO: renamed from: c */
    public final Object f18216c;

    /* JADX INFO: renamed from: d */
    public t82 f18217d;

    /* JADX INFO: renamed from: e */
    public Throwable f18218e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f18219f;

    /* JADX INFO: renamed from: g */
    public List f18220g;

    /* JADX INFO: renamed from: h */
    public mw2 f18221h;

    /* JADX INFO: renamed from: i */
    public final uw2 f18222i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f18223j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f18224k;

    /* JADX INFO: renamed from: l */
    public final lw2 f18225l;

    /* JADX INFO: renamed from: m */
    public final z32 f18226m;

    /* JADX INFO: renamed from: n */
    public final lw2 f18227n;

    /* JADX INFO: renamed from: o */
    public final lw2 f18228o;

    /* JADX INFO: renamed from: p */
    public ArrayList f18229p;

    /* JADX INFO: renamed from: q */
    public mw2 f18230q;

    /* JADX INFO: renamed from: r */
    public b70 f18231r;

    /* JADX INFO: renamed from: s */
    public final ac4 f18232s;

    /* JADX INFO: renamed from: t */
    public boolean f18233t;

    /* JADX INFO: renamed from: u */
    public final ac4 f18234u;

    /* JADX INFO: renamed from: v */
    public final tt2 f18235v;

    /* JADX INFO: renamed from: w */
    public final v82 f18236w;

    /* JADX INFO: renamed from: x */
    public final ro0 f18237x;

    /* JADX INFO: renamed from: y */
    public final q50 f18238y;

    /* JADX INFO: renamed from: z */
    public static final ac4 f18213z = bc4.m3547a(qa3.f28341d);

    /* JADX INFO: renamed from: A */
    public static final AtomicReference f18212A = new AtomicReference(Boolean.FALSE);

    public el3(ro0 ro0Var) {
        al3 al3Var = new al3((byte) 0);
        al3Var.f14614b = this;
        VarHandle.storeStoreFence();
        C1034ph c1034ph = new C1034ph(al3Var);
        this.f18214a = c1034ph;
        al3 al3Var2 = new al3((byte) 1);
        al3Var2.f14614b = this;
        VarHandle.storeStoreFence();
        tt2 tt2Var = new tt2((byte) 1, false);
        tt2Var.f31428b = new C1339xp(0);
        tt2Var.f31429c = new C1122rv((byte) 0);
        jp1 jp1Var = new jp1((byte) 10);
        jp1Var.f22485b = tt2Var;
        jp1Var.f22486c = al3Var2;
        VarHandle.storeStoreFence();
        tt2Var.f31430d = jp1Var;
        VarHandle.storeStoreFence();
        this.f18215b = tt2Var;
        this.f18216c = new Object();
        this.f18219f = new ArrayList();
        this.f18221h = new mw2();
        this.f18222i = new uw2(new zi0[16]);
        this.f18223j = new ArrayList();
        this.f18224k = new ArrayList();
        this.f18225l = new lw2();
        z32 z32Var = new z32((byte) 22);
        z32Var.f35738b = new lw2();
        z32Var.f35739c = new lw2();
        VarHandle.storeStoreFence();
        this.f18226m = z32Var;
        this.f18227n = new lw2();
        this.f18228o = new lw2();
        this.f18232s = bc4.m3547a(null);
        this.f18234u = bc4.m3547a(cl3.f16101c);
        this.f18235v = new tt2((byte) 13);
        v82 v82Var = new v82((t82) ro0Var.get(o85.f26448h));
        b71 b71Var = new b71((byte) 24);
        b71Var.f15141b = this;
        VarHandle.storeStoreFence();
        v82Var.mo4972C(b71Var);
        this.f18236w = v82Var;
        this.f18237x = ro0Var.plus(c1034ph).plus(v82Var);
        this.f18238y = new q50((byte) 16);
    }

    /* JADX INFO: renamed from: B */
    public static final void m5161B(el3 el3Var, uu2 uu2Var, uu2 uu2Var2) {
        List list = uu2Var2.f32186h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                uu2 uu2Var3 = (uu2) list.get(i);
                z32 z32Var = el3Var.f18226m;
                su2 su2Var = uu2Var3.f32179a;
                a03 a03Var = new a03();
                a03Var.f18a = uu2Var3;
                a03Var.f19b = uu2Var;
                VarHandle.storeStoreFence();
                ev2.m5404a((lw2) z32Var.f35738b, su2Var, a03Var);
                ev2.m5404a((lw2) z32Var.f35739c, uu2Var, su2Var);
                m5161B(el3Var, uu2Var, uu2Var3);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m5162K(ArrayList arrayList, el3 el3Var, zi0 zi0Var) {
        arrayList.clear();
        synchronized (el3Var.f18216c) {
            Iterator it = el3Var.f18224k.iterator();
            while (it.hasNext()) {
                uu2 uu2Var = (uu2) it.next();
                if (uu2Var.f32181c.equals(zi0Var)) {
                    arrayList.add(uu2Var);
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5163z(rw2 rw2Var) {
        try {
            if (rw2Var.mo3385w() instanceof f94) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            rw2Var.mo3384c();
        } catch (Throwable th) {
            rw2Var.mo3384c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m5164A() {
        synchronized (this.f18216c) {
            if (((cl3) this.f18234u.getValue()).compareTo(cl3.f16103e) >= 0) {
                ac4 ac4Var = this.f18234u;
                cl3 cl3Var = cl3.f16100b;
                ac4Var.getClass();
                ac4Var.m200k(null, cl3Var);
            }
        }
        this.f18236w.mo4993a(null);
    }

    /* JADX INFO: renamed from: C */
    public final a70 m5165C() {
        cl3 cl3Var;
        ac4 ac4Var = this.f18234u;
        int iCompareTo = ((cl3) ac4Var.getValue()).compareTo(cl3.f16100b);
        ac4 ac4Var2 = this.f18232s;
        ArrayList arrayList = this.f18224k;
        ArrayList arrayList2 = this.f18223j;
        uw2 uw2Var = this.f18222i;
        if (iCompareTo > 0) {
            if (ac4Var2.getValue() != null) {
                cl3Var = cl3.f16101c;
            } else if (this.f18217d == null) {
                this.f18221h = new mw2();
                uw2Var.m11668g();
                cl3Var = (m5166D() || m5168F()) ? cl3.f16102d : cl3.f16101c;
            } else {
                cl3Var = (uw2Var.f32213c != 0 || this.f18221h.m8416h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m5166D() || m5168F() || this.f18225l.m8135j()) ? cl3.f16104f : cl3.f16103e;
            }
            ac4Var.m200k(null, cl3Var);
            if (cl3Var != cl3.f16104f) {
                return null;
            }
            b70 b70Var = this.f18231r;
            this.f18231r = null;
            return b70Var;
        }
        List listM5170H = m5170H();
        int size = listM5170H.size();
        for (int i = 0; i < size; i++) {
        }
        this.f18219f.clear();
        this.f18220g = v71.f32439a;
        this.f18221h = new mw2();
        uw2Var.m11668g();
        arrayList2.clear();
        arrayList.clear();
        this.f18229p = null;
        b70 b70Var2 = this.f18231r;
        if (b70Var2 != null) {
            b70Var2.mo115m(null);
        }
        this.f18231r = null;
        ac4Var2.m199j(null);
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5166D() {
        return !this.f18233t && (((C1339xp) ((C1122rv) this.f18214a.f27604c).f29653d).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m5167E() {
        return this.f18222i.f32213c != 0 || m5166D() || m5168F() || this.f18225l.m8135j();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m5168F() {
        return !this.f18233t && (((C1339xp) ((C1122rv) this.f18215b.f31429c).f29653d).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m5169G() {
        boolean z;
        synchronized (this.f18216c) {
            z = this.f18221h.m8416h() || this.f18222i.f32213c != 0 || m5166D() || m5168F();
        }
        return z;
    }

    /* JADX INFO: renamed from: H */
    public final List m5170H() {
        List list = this.f18220g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f18219f;
        List arrayList2 = arrayList.isEmpty() ? v71.f32439a : new ArrayList(arrayList);
        this.f18220g = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: I */
    public final void m5171I() {
        a70 a70VarM5165C;
        synchronized (this.f18216c) {
            a70VarM5165C = m5165C();
            if (((cl3) this.f18234u.getValue()).compareTo(cl3.f16100b) <= 0) {
                Throwable th = this.f18218e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (a70VarM5165C != null) {
            ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m5172J(zi0 zi0Var) {
        synchronized (this.f18216c) {
            ArrayList arrayList = this.f18224k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((uu2) arrayList.get(i)).f32181c.equals(zi0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    m5162K(arrayList2, this, zi0Var);
                    while (!arrayList2.isEmpty()) {
                        m5173L(arrayList2, null);
                        m5162K(arrayList2, this, zi0Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final List m5173L(List list, mw2 mw2Var) {
        rw2 rw2VarMo6057C;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            zi0 zi0Var = ((uu2) obj).f32181c;
            Object arrayList2 = map.get(zi0Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(zi0Var, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            zi0 zi0Var2 = (zi0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (zi0Var2.f36132v.f21669F) {
                qi0.m9889a("Check failed");
            }
            byte b = 23;
            b71 b71Var = new b71(b);
            b71Var.f15141b = zi0Var2;
            VarHandle.storeStoreFence();
            na1 na1Var = new na1(b);
            na1Var.f25595b = zi0Var2;
            na1Var.f25596c = mw2Var;
            VarHandle.storeStoreFence();
            e94 e94VarM7451h = k94.m7451h();
            rw2 rw2Var = e94VarM7451h instanceof rw2 ? (rw2) e94VarM7451h : null;
            if (rw2Var == null || (rw2VarMo6057C = rw2Var.mo6057C(b71Var, na1Var)) == null) {
                C1077qn.m9989o("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                e94 e94VarM5018j = rw2VarMo6057C.m5018j();
                try {
                    synchronized (this.f18216c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                uu2 uu2Var = (uu2) list2.get(i2);
                                Object objM5405b = ev2.m5405b(this.f18225l, uu2Var.f32179a);
                                uu2 uu2Var2 = (uu2) objM5405b;
                                if (uu2Var2 != null) {
                                    this.f18226m.m13318P(uu2Var2);
                                }
                                arrayList.add(new l73(uu2Var, objM5405b));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                l73 l73Var = (l73) arrayList.get(i3);
                                if (l73Var.f23834b == null) {
                                    if (((lw2) this.f18226m.f35738b).m8127b(((uu2) l73Var.f23833a).f32179a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            l73 l73Var2 = (l73) arrayList.get(i4);
                                            if (l73Var2.f23834b == null) {
                                                z32 z32Var = this.f18226m;
                                                su2 su2Var = ((uu2) l73Var2.f23833a).f32179a;
                                                lw2 lw2Var = (lw2) z32Var.f35738b;
                                                a03 a03Var = (a03) ev2.m5405b(lw2Var, su2Var);
                                                if (lw2Var.m8134i()) {
                                                    ((lw2) z32Var.f35739c).m8126a();
                                                }
                                                if (a03Var != null) {
                                                    uu2 uu2Var3 = a03Var.f18a;
                                                    ev2.m5404a(this.f18228o, a03Var.f19b, uu2Var3);
                                                    l73Var2 = new l73(l73Var2.f23833a, uu2Var3);
                                                }
                                            }
                                            arrayList3.add(l73Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((l73) arrayList.get(i5)).f23834b != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((l73) arrayList.get(i6)).f23834b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        l73 l73Var3 = (l73) arrayList.get(i7);
                                        uu2 uu2Var4 = l73Var3.f23834b == null ? (uu2) l73Var3.f23833a : null;
                                        if (uu2Var4 != null) {
                                            arrayList4.add(uu2Var4);
                                        }
                                    }
                                    synchronized (this.f18216c) {
                                        mb0.m8260A0(this.f18224k, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((l73) obj2).f23834b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    zi0Var2.m13590u(arrayList);
                    e94.m5011q(e94VarM5018j);
                    m5163z(rw2VarMo6057C);
                } catch (Throwable th2) {
                    e94.m5011q(e94VarM5018j);
                    throw th2;
                }
            } catch (Throwable th3) {
                m5163z(rw2VarMo6057C);
                throw th3;
            }
        }
        return hb0.m6319e1(map.keySet());
    }

    /* JADX INFO: renamed from: M */
    public final zi0 m5174M(zi0 zi0Var, mw2 mw2Var) {
        rw2 rw2VarMo6057C;
        if (zi0Var.f36132v.f21669F || zi0Var.f36133w == 3) {
            return null;
        }
        mw2 mw2Var2 = this.f18230q;
        if (mw2Var2 == null || !mw2Var2.m8411c(zi0Var)) {
            byte b = 23;
            b71 b71Var = new b71(b);
            b71Var.f15141b = zi0Var;
            VarHandle.storeStoreFence();
            na1 na1Var = new na1(b);
            na1Var.f25595b = zi0Var;
            na1Var.f25596c = mw2Var;
            VarHandle.storeStoreFence();
            e94 e94VarM7451h = k94.m7451h();
            rw2 rw2Var = e94VarM7451h instanceof rw2 ? (rw2) e94VarM7451h : null;
            if (rw2Var == null || (rw2VarMo6057C = rw2Var.mo6057C(b71Var, na1Var)) == null) {
                C1077qn.m9989o("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    e94 e94VarM5018j = rw2VarMo6057C.m5018j();
                    if (mw2Var != null) {
                        try {
                            if (mw2Var.m8416h()) {
                                jp1 jp1Var = new jp1((byte) 14);
                                jp1Var.f22485b = mw2Var;
                                jp1Var.f22486c = zi0Var;
                                VarHandle.storeStoreFence();
                                ir1 ir1Var = zi0Var.f36132v;
                                if (ir1Var.f21669F) {
                                    qi0.m9889a("Preparing a composition while composing is not supported");
                                }
                                ir1Var.f21669F = true;
                                try {
                                    jp1Var.invoke();
                                    ir1Var.f21669F = false;
                                } catch (Throwable th) {
                                    ir1Var.f21669F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            e94.m5011q(e94VarM5018j);
                            throw th2;
                        }
                    }
                    boolean zM13594y = zi0Var.m13594y();
                    e94.m5011q(e94VarM5018j);
                    m5163z(rw2VarMo6057C);
                    if (zM13594y) {
                        return zi0Var;
                    }
                } catch (Throwable th3) {
                    m5163z(rw2VarMo6057C);
                    throw th3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final void m5175N(Throwable th, zi0 zi0Var) throws Throwable {
        if (!((Boolean) f18212A.get()).booleanValue() || (th instanceof uh0)) {
            synchronized (this.f18216c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                bl3 bl3Var = (bl3) this.f18232s.getValue();
                if (bl3Var != null) {
                    throw bl3Var.f15403a;
                }
                ac4 ac4Var = this.f18232s;
                bl3 bl3Var2 = new bl3(th);
                ac4Var.getClass();
                ac4Var.m200k(null, bl3Var2);
            }
            throw th;
        }
        synchronized (this.f18216c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f18223j.clear();
                this.f18222i.m11668g();
                this.f18221h = new mw2();
                this.f18224k.clear();
                this.f18225l.m8126a();
                this.f18227n.m8126a();
                ac4 ac4Var2 = this.f18232s;
                bl3 bl3Var3 = new bl3(th);
                ac4Var2.getClass();
                ac4Var2.m200k(null, bl3Var3);
                if (zi0Var != null) {
                    m5177P(zi0Var);
                }
                if (m5165C() != null) {
                    qi0.m9889a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m5176O() {
        boolean zM5167E;
        synchronized (this.f18216c) {
            if (this.f18221h.m8415g()) {
                return m5167E();
            }
            List listM5170H = m5170H();
            vv3 vv3VarM6574I = i20.m6574I(this.f18221h);
            this.f18221h = new mw2();
            try {
                int size = listM5170H.size();
                for (int i = 0; i < size; i++) {
                    ((zi0) listM5170H.get(i)).m13595z(vv3VarM6574I);
                    if (((cl3) this.f18234u.getValue()).compareTo(cl3.f16100b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f18216c) {
                    if (m5165C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM5167E = m5167E();
                }
                return zM5167E;
            } catch (Throwable th) {
                synchronized (this.f18216c) {
                    mw2 mw2Var = this.f18221h;
                    int i2 = mw2Var.f25260d;
                    Iterator<E> it = vv3VarM6574I.iterator();
                    while (it.hasNext()) {
                        mw2Var.m8419k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5177P(zi0 zi0Var) {
        ArrayList arrayList = this.f18229p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f18229p = arrayList;
        }
        if (!arrayList.contains(zi0Var)) {
            arrayList.add(zi0Var);
        }
        if (this.f18219f.remove(zi0Var)) {
            this.f18220g = null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final Object m5178Q(of4 of4Var) throws Throwable {
        Object objM7921b0 = lb5.m7921b0(this.f18214a, new C0980oe((Object) this, (Object) new dl3(this, null), (Object) C0006a5.m84v(of4Var.getContext()), (wm0) null, (byte) 7), of4Var);
        ap0 ap0Var = ap0.f14763a;
        ju4 ju4Var = ju4.f22634a;
        if (objM7921b0 != ap0Var) {
            objM7921b0 = ju4Var;
        }
        return objM7921b0 == ap0Var ? objM7921b0 : ju4Var;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: a */
    public final void mo5179a(zi0 zi0Var, mq1 mq1Var) throws Throwable {
        cl3 cl3Var;
        boolean zContains;
        rw2 rw2VarMo6057C;
        boolean z = zi0Var.f36132v.f21669F;
        synchronized (this.f18216c) {
            cl3 cl3Var2 = (cl3) this.f18234u.getValue();
            cl3Var = cl3.f16100b;
            zContains = cl3Var2.compareTo(cl3Var) > 0 ? true ^ m5170H().contains(zi0Var) : true;
        }
        try {
            byte b = 23;
            b71 b71Var = new b71(b);
            b71Var.f15141b = zi0Var;
            VarHandle.storeStoreFence();
            na1 na1Var = new na1(b);
            na1Var.f25595b = zi0Var;
            na1Var.f25596c = null;
            VarHandle.storeStoreFence();
            e94 e94VarM7451h = k94.m7451h();
            rw2 rw2Var = e94VarM7451h instanceof rw2 ? (rw2) e94VarM7451h : null;
            if (rw2Var == null || (rw2VarMo6057C = rw2Var.mo6057C(b71Var, na1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                e94 e94VarM5018j = rw2VarMo6057C.m5018j();
                try {
                    zi0Var.m13583n(mq1Var);
                    e94.m5011q(e94VarM5018j);
                    m5163z(rw2VarMo6057C);
                    synchronized (this.f18216c) {
                        if (((cl3) this.f18234u.getValue()).compareTo(cl3Var) > 0 && !m5170H().contains(zi0Var)) {
                            this.f18219f.add(zi0Var);
                            this.f18220g = null;
                        }
                    }
                    if (!z) {
                        k94.m7451h().mo5021m();
                    }
                    try {
                        m5172J(zi0Var);
                        try {
                            zi0Var.m13577e();
                            zi0Var.m13579i();
                            if (z) {
                                return;
                            }
                            k94.m7451h().mo5021m();
                        } catch (Throwable th) {
                            m5175N(th, null);
                        }
                    } catch (Throwable th2) {
                        m5175N(th2, zi0Var);
                    }
                } catch (Throwable th3) {
                    e94.m5011q(e94VarM5018j);
                    throw th3;
                }
            } catch (Throwable th4) {
                m5163z(rw2VarMo6057C);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.f18216c) {
                }
            }
            m5175N(th5, zi0Var);
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: b */
    public final mw2 mo5180b(zi0 zi0Var, o64 o64Var, mq1 mq1Var) {
        tt2 tt2Var = this.f18235v;
        try {
            o64 o64Var2 = zi0Var.f36126p;
            zi0Var.f36126p = o64Var;
            try {
                mo5179a(zi0Var, mq1Var);
                mw2 mw2Var = (mw2) tt2Var.get();
                if (mw2Var == null) {
                    mw2Var = uv3.f32207a;
                }
                zi0Var.f36126p = o64Var2;
                tt2Var.m11143B(null);
                return mw2Var;
            } catch (Throwable th) {
                zi0Var.f36126p = o64Var2;
                throw th;
            }
        } catch (Throwable th2) {
            tt2Var.m11143B(null);
            throw th2;
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: c */
    public final void mo5181c(uu2 uu2Var) {
        a70 a70VarM5165C;
        synchronized (this.f18216c) {
            try {
                ev2.m5404a(this.f18225l, uu2Var.f32179a, uu2Var);
                if (uu2Var.f32186h != null) {
                    m5161B(this, uu2Var, uu2Var);
                }
                a70VarM5165C = m5165C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a70VarM5165C != null) {
            ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: k */
    public final ro0 mo5182k() {
        return this.f18237x;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: m */
    public final void mo5183m(uu2 uu2Var) {
        a70 a70VarM5165C;
        synchronized (this.f18216c) {
            this.f18224k.add(uu2Var);
            a70VarM5165C = m5165C();
        }
        if (a70VarM5165C != null) {
            ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: n */
    public final void mo5184n(zi0 zi0Var) {
        a70 a70VarM5165C;
        synchronized (this.f18216c) {
            if (this.f18222i.m11669h(zi0Var)) {
                a70VarM5165C = null;
            } else {
                this.f18222i.m11663b(zi0Var);
                a70VarM5165C = m5165C();
            }
        }
        if (a70VarM5165C != null) {
            ((b70) a70VarM5165C).resumeWith(ju4.f22634a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[LOOP:0: B:16:0x0047->B:29:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[EDGE_INSN: B:37:0x008a->B:30:0x008a BREAK  A[LOOP:0: B:16:0x0047->B:29:0x0087], SYNTHETIC] */
    @Override // p000.ui0
    /* JADX INFO: renamed from: o */
    public final void mo5185o(uu2 uu2Var, tu2 tu2Var, InterfaceC0618en interfaceC0618en) {
        cw2 cw2Var;
        synchronized (this.f18216c) {
            this.f18227n.m8138m(uu2Var, tu2Var);
            Object objM8132g = this.f18228o.m8132g(uu2Var);
            if (objM8132g == null) {
                cw2Var = q23.f28159b;
            } else if (objM8132g instanceof cw2) {
                cw2Var = (cw2) objM8132g;
            } else {
                Object[] objArr = q23.f28158a;
                cw2 cw2Var2 = new cw2(1);
                cw2Var2.m4200a(objM8132g);
                cw2Var = cw2Var2;
            }
            if (cw2Var.m4209j()) {
                lw2 lw2VarM8229c = tu2Var.f31455a.m8229c(interfaceC0618en, cw2Var);
                Object[] objArr2 = lw2VarM8229c.f24419b;
                Object[] objArr3 = lw2VarM8229c.f24420c;
                long[] jArr = lw2VarM8229c.f24418a;
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
                                    Object obj = objArr2[i4];
                                    this.f18227n.m8138m((uu2) obj, (tu2) objArr3[i4]);
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
            }
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: p */
    public final tu2 mo5186p(uu2 uu2Var) {
        tu2 tu2Var;
        synchronized (this.f18216c) {
            tu2Var = (tu2) this.f18227n.m8136k(uu2Var);
        }
        return tu2Var;
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: q */
    public final mw2 mo5187q(zi0 zi0Var, o64 o64Var, mw2 mw2Var) {
        tt2 tt2Var = this.f18235v;
        try {
            m5176O();
            zi0Var.m13595z(i20.m6574I(mw2Var));
            o64 o64Var2 = zi0Var.f36126p;
            zi0Var.f36126p = o64Var;
            try {
                zi0 zi0VarM5174M = m5174M(zi0Var, null);
                if (zi0VarM5174M != null) {
                    m5172J(zi0Var);
                    zi0VarM5174M.m13577e();
                    zi0VarM5174M.m13579i();
                }
                mw2 mw2Var2 = (mw2) tt2Var.get();
                if (mw2Var2 == null) {
                    mw2Var2 = uv3.f32207a;
                }
                zi0Var.f36126p = o64Var2;
                tt2Var.m11143B(null);
                return mw2Var2;
            } catch (Throwable th) {
                zi0Var.f36126p = o64Var2;
                throw th;
            }
        } catch (Throwable th2) {
            tt2Var.m11143B(null);
            throw th2;
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: t */
    public final void mo5188t(yk3 yk3Var) {
        tt2 tt2Var = this.f18235v;
        mw2 mw2Var = (mw2) tt2Var.get();
        if (mw2Var == null) {
            mw2 mw2Var2 = uv3.f32207a;
            mw2Var = new mw2();
            tt2Var.m11143B(mw2Var);
        }
        mw2Var.m8409a(yk3Var);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: u */
    public final void mo5189u(zi0 zi0Var) {
        synchronized (this.f18216c) {
            try {
                mw2 mw2Var = this.f18230q;
                if (mw2Var == null) {
                    mw2 mw2Var2 = uv3.f32207a;
                    mw2Var = new mw2();
                    this.f18230q = mw2Var;
                }
                mw2Var.m8409a(zi0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: v */
    public final d70 mo5190v(g32 g32Var) {
        tt2 tt2Var = this.f18215b;
        C1122rv c1122rv = (C1122rv) tt2Var.f31429c;
        v03 v03Var = new v03();
        v03Var.f32288a = g32Var;
        return c1122rv.m10447f(v03Var, (jp1) tt2Var.f31430d);
    }

    @Override // p000.ui0
    /* JADX INFO: renamed from: y */
    public final void mo5191y(zi0 zi0Var) {
        synchronized (this.f18216c) {
            if (this.f18219f.remove(zi0Var)) {
                this.f18220g = null;
            }
            this.f18222i.m11671k(zi0Var);
            this.f18223j.remove(zi0Var);
        }
    }
}
