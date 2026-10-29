package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rn3 {

    /* JADX INFO: renamed from: a */
    public wd3 f29440a;

    /* JADX INFO: renamed from: b */
    public zo0 f29441b;

    /* JADX INFO: renamed from: c */
    public sw2 f29442c;

    /* JADX INFO: renamed from: d */
    public float f29443d;

    /* JADX INFO: renamed from: e */
    public C1313x f29444e;

    /* JADX INFO: renamed from: f */
    public py3 f29445f;

    /* JADX INFO: renamed from: g */
    public px3 f29446g;

    /* JADX INFO: renamed from: h */
    public df2 f29447h;

    /* JADX INFO: renamed from: i */
    public mq1 f29448i;

    /* JADX INFO: renamed from: j */
    public gx2 f29449j;

    /* JADX INFO: renamed from: k */
    public d83 f29450k;

    /* JADX INFO: renamed from: l */
    public wy0 f29451l;

    /* JADX INFO: renamed from: m */
    public d83 f29452m;

    /* JADX INFO: renamed from: n */
    public d83 f29453n;

    /* JADX INFO: renamed from: o */
    public d83 f29454o;

    /* JADX INFO: renamed from: p */
    public d83 f29455p;

    /* JADX INFO: renamed from: q */
    public long f29456q;

    /* JADX INFO: renamed from: r */
    public HashSet f29457r;

    /* JADX INFO: renamed from: s */
    public d83 f29458s;

    /* JADX INFO: renamed from: t */
    public C0910mi f29459t;

    /* JADX INFO: renamed from: u */
    public vt0 f29460u;

    /* JADX INFO: renamed from: a */
    public static qn3 m10374a(rn3 rn3Var, jl3 jl3Var, ArrayList arrayList, ky3 ky3Var, C1183ti c1183ti, int i) {
        if ((i & 4) != 0) {
            ky3Var = ky3.f23620b;
        }
        Object obj = c1183ti;
        if ((i & 8) != 0) {
            obj = C1035pi.f27628z;
        }
        C1257vi c1257vi = new C1257vi(rn3Var, jl3Var, obj, (byte) 1);
        int iOrdinal = ky3Var.ordinal();
        Object obj2 = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((Boolean) c1257vi.invoke(objPrevious)).booleanValue()) {
                    obj2 = objPrevious;
                    break;
                }
            }
            return (qn3) obj2;
        }
        if (iOrdinal != 1) {
            C0670g.m5864c();
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            if (((Boolean) c1257vi.invoke(obj3)).booleanValue()) {
                obj2 = obj3;
                break;
            }
        }
        return (qn3) obj2;
    }

    /* JADX INFO: renamed from: b */
    public final qn3 m10375b() {
        Object value = this.f29450k.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        ArrayList arrayListM12087m = this.f29440a.m12236d().m12087m();
        int size = arrayListM12087m.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListM12087m.get(i);
            i++;
            if (((qn3) obj2).f28622a.f25855j.equals(value)) {
                obj = obj2;
                break;
            }
        }
        return (qn3) obj;
    }

    /* JADX INFO: renamed from: c */
    public final long m10376c() {
        long jM9991a;
        d83 d83Var = this.f29455p;
        d83 d83Var2 = this.f29454o;
        qn3 qn3VarM10375b = m10375b();
        if (qn3VarM10375b == null) {
            return 0L;
        }
        int i = qn3VarM10375b.f28622a.f25846a;
        Integer num = (Integer) d83Var2.getValue();
        if (num == null || i != num.intValue() || ((Integer) d83Var2.getValue()) == null) {
            d83Var2.setValue(null);
            d83Var.setValue(null);
            jM9991a = qn3VarM10375b.m9991a();
        } else {
            o52 o52Var = (o52) d83Var.getValue();
            jM9991a = o52Var != null ? o52Var.f26352a : qn3VarM10375b.m9991a();
        }
        long j = ((b33) this.f29452m.getValue()).f15059a;
        long j2 = ((o52) this.f29453n.getValue()).f26352a;
        long jM10381h = m10381h(b33.m3429g(i20.m6580e((int) (j2 >> 32), (int) (j2 & 4294967295L)), i20.m6580e((int) (jM9991a >> 32), (int) (jM9991a & 4294967295L))));
        m10382i(jM10381h);
        return b33.m3430h(j, jM10381h);
    }

    /* JADX INFO: renamed from: d */
    public final d63 m10377d() {
        return ((mi2) this.f29440a.m12236d().f33090b).f24955p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ac, code lost:
    
        if (r6.f25846a > r11.f25846a) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b9, code lost:
    
        if (r6.f25846a < r11.f25846a) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02bb, code lost:
    
        r0 = p000.lb5.m7910S(r9.f29441b, null, null, new p000.in3(r9, r1, r12, r4, 0), 3);
        r15.m6193g(null);
        r2.f20720t = null;
        r2.f20721u = null;
        r2.f20724x = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02da, code lost:
    
        if (((p000.e92) r0).mo5005t(r2) != r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02dd, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02de, code lost:
    
        r15.m6193g(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e1, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r11.f25846a == r12.f28622a.f25846a) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r11.f25846a == ((p000.si2) r4.f33259b).m10788g()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r15.m6193g(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        return r7;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10378e(ky3 ky3Var, ym0 ym0Var) {
        hn3 hn3Var;
        rn3 rn3Var;
        ky3 ky3Var2;
        eb0 eb0Var;
        wd3 wd3Var;
        ArrayList arrayList;
        ky3 ky3Var3;
        Object obj;
        qn3 qn3Var;
        Object obj2;
        d63 d63Var;
        if (ym0Var instanceof hn3) {
            hn3Var = (hn3) ym0Var;
            int i = hn3Var.f20724x;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn3Var.f20724x = i - Integer.MIN_VALUE;
            } else {
                hn3Var = new hn3(this, ym0Var);
            }
        } else {
            hn3Var = new hn3(this, ym0Var);
        }
        Object obj3 = hn3Var.f20722v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = hn3Var.f20724x;
        ju4 ju4Var = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj3);
            gx2 gx2Var = this.f29449j;
            hn3Var.f20720t = this;
            hn3Var.f20721u = ky3Var;
            hn3Var.f20724x = 1;
            if (gx2Var.m6191e(hn3Var) != ap0Var) {
                rn3Var = this;
                ky3Var2 = ky3Var;
            }
            return ap0Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(obj3);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ky3Var2 = hn3Var.f20721u;
        rn3 rn3Var2 = hn3Var.f20720t;
        k43.m7376J(obj3);
        rn3Var = rn3Var2;
        qn3 qn3VarM10375b = rn3Var.m10375b();
        wd3 wd3Var2 = rn3Var.f29440a;
        gx2 gx2Var2 = rn3Var.f29449j;
        if (qn3VarM10375b == null) {
            gx2Var2.m6193g(null);
            return ju4Var;
        }
        ni2 ni2Var = qn3VarM10375b.f28622a;
        int iOrdinal = ky3Var2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return null;
            }
            qn3 qn3Var2 = (qn3) hb0.m6307S0(wd3Var2.m12236d().m12087m());
            if (qn3Var2 != null) {
            }
            long jM10381h = rn3Var.m10381h(rn3Var.m10376c());
            rn3Var.m10382i(jM10381h);
            long jM9991a = qn3VarM10375b.m9991a();
            long jM3430h = b33.m3430h(i20.m6580e((int) (jM9991a >> 32), (int) (jM9991a & 4294967295L)), jM10381h);
            long jM13369a0 = z62.m13369a0(qn3VarM10375b.m9992b());
            jl3 jl3VarM5671i = AbstractC0647fd.m5671i(jM3430h, i20.m6580e(h74.m6273e(jM13369a0) + b33.m3427e(jM3430h), h74.m6271c(jM13369a0) + b33.m3428f(jM3430h)));
            int iOrdinal2 = rn3Var.f29446g.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    C0670g.m5864c();
                    return null;
                }
                int iOrdinal3 = rn3Var.m10377d().ordinal();
                if (iOrdinal3 == 0) {
                    d63Var = d63.f16815b;
                } else {
                    if (iOrdinal3 != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    d63Var = d63.f16814a;
                }
                int iOrdinal4 = d63Var.ordinal();
                if (iOrdinal4 == 0) {
                    jl3VarM5671i = jl3.m7165b(jl3VarM5671i, 0.0f, 0.0f, 5);
                } else {
                    if (iOrdinal4 != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    jl3VarM5671i = jl3.m7165b(jl3VarM5671i, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 10);
                }
            }
            jl3 jl3Var = jl3VarM5671i;
            w42 w42VarM12236d = wd3Var2.m12236d();
            C1313x c1313x = rn3Var.f29444e;
            int iOrdinal5 = ((mi2) w42VarM12236d.f33090b).f24955p.ordinal();
            if (iOrdinal5 == 0) {
                eb0Var = new eb0(c1313x.f33889c, c1313x.f33890d);
            } else {
                if (iOrdinal5 != 1) {
                    C0670g.m5864c();
                    return null;
                }
                eb0Var = new eb0(c1313x.f33887a, c1313x.f33888b);
            }
            vw3 vw3VarM12086l = w42VarM12236d.m12086l(eb0Var);
            float f = vw3VarM12086l.f32897a;
            float f2 = vw3VarM12086l.f32898b;
            int iOrdinal6 = ((mi2) w42VarM12236d.f33090b).f24955p.ordinal();
            if (iOrdinal6 == 0) {
                wd3Var = wd3Var2;
                ArrayList arrayListM12087m = w42VarM12236d.m12087m();
                arrayList = new ArrayList();
                int size = arrayListM12087m.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj4 = arrayListM12087m.get(i3);
                    i3++;
                    qn3 qn3Var3 = (qn3) obj4;
                    ArrayList arrayList2 = arrayListM12087m;
                    int i4 = size;
                    if (((int) (qn3Var3.m9991a() & 4294967295L)) >= f) {
                        if (((int) (qn3Var3.m9992b() & 4294967295L)) + ((int) (qn3Var3.m9991a() & 4294967295L)) <= f2) {
                            arrayList.add(obj4);
                        }
                    }
                    arrayListM12087m = arrayList2;
                    size = i4;
                }
            } else if (iOrdinal6 == 1) {
                ArrayList arrayListM12087m2 = w42VarM12236d.m12087m();
                arrayList = new ArrayList();
                int size2 = arrayListM12087m2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj5 = arrayListM12087m2.get(i5);
                    i5++;
                    qn3 qn3Var4 = (qn3) obj5;
                    wd3 wd3Var3 = wd3Var2;
                    ArrayList arrayList3 = arrayListM12087m2;
                    if (((int) (qn3Var4.m9991a() >> 32)) >= f && ((int) (qn3Var4.m9991a() >> 32)) + ((int) (qn3Var4.m9992b() >> 32)) <= f2) {
                        arrayList.add(obj5);
                    }
                    arrayListM12087m2 = arrayList3;
                    wd3Var2 = wd3Var3;
                }
                wd3Var = wd3Var2;
            } else {
                wd3Var = wd3Var2;
                C0670g.m5864c();
                arrayList = null;
            }
            if (arrayList.isEmpty()) {
                arrayList = wd3Var.m12236d().m12087m();
            }
            ArrayList arrayList4 = arrayList;
            int iOrdinal7 = ky3Var2.ordinal();
            if (iOrdinal7 == 0) {
                ky3Var3 = ky3.f23620b;
            } else {
                if (iOrdinal7 != 1) {
                    C0670g.m5864c();
                    return null;
                }
                ky3Var3 = ky3.f23619a;
            }
            ky3 ky3Var4 = ky3Var3;
            wm0 wm0Var = null;
            qn3 qn3VarM10374a = m10374a(rn3Var, jl3Var, arrayList4, ky3Var4, null, 8);
            byte b = 3;
            if (qn3VarM10374a == null) {
                l20 l20Var = new l20(rn3Var, qn3VarM10375b, b);
                int iOrdinal8 = ky3Var2.ordinal();
                if (iOrdinal8 == 0) {
                    int size3 = arrayList4.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            obj = null;
                            break;
                        }
                        Object obj6 = arrayList4.get(i6);
                        i6++;
                        if (((Boolean) l20Var.invoke(obj6)).booleanValue()) {
                            obj = obj6;
                            break;
                        }
                    }
                    qn3Var = (qn3) obj;
                } else {
                    if (iOrdinal8 != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    ListIterator listIterator = arrayList4.listIterator(arrayList4.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        }
                        Object objPrevious = listIterator.previous();
                        if (((Boolean) l20Var.invoke(objPrevious)).booleanValue()) {
                            obj2 = objPrevious;
                            break;
                        }
                    }
                    qn3Var = (qn3) obj2;
                }
                qn3VarM10374a = qn3Var;
            }
            qn3 qn3Var5 = qn3VarM10374a;
            if (qn3Var5 == null) {
                gx2Var2.m6193g(null);
                return ju4Var;
            }
            ni2 ni2Var2 = qn3Var5.f28622a;
            int iOrdinal9 = ky3Var2.ordinal();
            if (iOrdinal9 != 0) {
                if (iOrdinal9 != 1) {
                    C0670g.m5864c();
                    return null;
                }
            }
        }
        return ap0Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e A[Catch: all -> 0x0043, PHI: r0 r1 r2 r3
  0x014e: PHI (r0v9 rn3) = (r0v6 rn3), (r0v16 rn3) binds: [B:58:0x014b, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r1v9 gx2) = (r1v19 gx2), (r1v20 gx2) binds: [B:58:0x014b, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r2v6 qn3) = (r2v3 qn3), (r2v29 qn3) binds: [B:58:0x014b, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r3v9 ??) = (r3v20 ??), (r3v19 ??) binds: [B:58:0x014b, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:67:0x01bd, B:22:0x0056, B:60:0x014e, B:62:0x0158, B:64:0x019d, B:63:0x0195, B:25:0x0068, B:57:0x0121), top: B:74:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:67:0x01bd, B:22:0x0056, B:60:0x014e, B:62:0x0158, B:64:0x019d, B:63:0x0195, B:25:0x0068, B:57:0x0121), top: B:74:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0195 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:67:0x01bd, B:22:0x0056, B:60:0x014e, B:62:0x0158, B:64:0x019d, B:63:0x0195, B:25:0x0068, B:57:0x0121), top: B:74:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ba, code lost:
    
        if (p000.se0.m10723g0(1000, r2, r4) == r5) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qn3] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [gx2] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [gx2] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qn3] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, qn3] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [qn3] */
    /* JADX WARN: Type inference failed for: r6v25, types: [qn3] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10379f(qn3 qn3Var, qn3 qn3Var2, ym0 ym0Var) throws Throwable {
        jn3 jn3Var;
        gx2 gx2Var;
        ?? r1;
        rn3 rn3Var;
        qn3 qn3Var3;
        ?? r2;
        gx2 gx2Var2;
        ?? r3;
        gx2 gx2Var3;
        oq1 oq1Var;
        zo0 zo0Var;
        ni2 ni2Var;
        ni2 ni2Var2;
        ?? r4;
        gx2 gx2Var4;
        o52 o52VarM8954a;
        rn3 rn3Var2 = this;
        ?? r5 = qn3Var;
        qn3 qn3Var4 = qn3Var2;
        if (ym0Var instanceof jn3) {
            jn3Var = (jn3) ym0Var;
            int i = jn3Var.f22450z;
            if ((i & Integer.MIN_VALUE) != 0) {
                jn3Var.f22450z = i - Integer.MIN_VALUE;
            } else {
                jn3Var = new jn3(rn3Var2, ym0Var);
            }
        } else {
            jn3Var = new jn3(rn3Var2, ym0Var);
        }
        Object obj = jn3Var.f22448x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = jn3Var.f22450z;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        try {
            try {
                try {
                    if (i2 == 0) {
                        k43.m7376J(obj);
                        if (r5.f28622a.f25846a != qn3Var4.f28622a.f25846a) {
                            gx2Var = rn3Var2.f29449j;
                            jn3Var.f22444t = rn3Var2;
                            jn3Var.f22445u = r5;
                            jn3Var.f22446v = qn3Var4;
                            jn3Var.f22447w = gx2Var;
                            jn3Var.f22450z = 1;
                            if (gx2Var.m6191e(jn3Var) != ap0Var) {
                            }
                            r1 = r5;
                            return ap0Var;
                        }
                        return ju4Var;
                    }
                    if (i2 == 1) {
                        gx2 gx2Var5 = jn3Var.f22447w;
                        qn3 qn3Var5 = jn3Var.f22446v;
                        qn3 qn3Var6 = (qn3) jn3Var.f22445u;
                        rn3 rn3Var3 = jn3Var.f22444t;
                        k43.m7376J(obj);
                        qn3Var4 = qn3Var5;
                        r1 = qn3Var6;
                        gx2Var = gx2Var5;
                        rn3Var2 = rn3Var3;
                    } else {
                        if (i2 == 2) {
                            gx2 gx2Var6 = jn3Var.f22447w;
                            qn3Var3 = jn3Var.f22446v;
                            qn3 qn3Var7 = (qn3) jn3Var.f22445u;
                            rn3Var = jn3Var.f22444t;
                            k43.m7376J(obj);
                            gx2Var2 = gx2Var6;
                            r2 = qn3Var7;
                            r3 = r2;
                            qn3Var4 = qn3Var3;
                            rn3Var2 = rn3Var;
                            gx2Var3 = gx2Var2;
                            rn3Var2.f29454o.setValue(new Integer(r3.f28622a.f25846a));
                            oq1Var = (oq1) rn3Var2.f29442c.getValue();
                            zo0Var = rn3Var2.f29441b;
                            ni2Var = r3.f28622a;
                            ni2Var2 = qn3Var4.f28622a;
                            jn3Var.f22444t = rn3Var2;
                            jn3Var.f22445u = r3;
                            jn3Var.f22446v = qn3Var4;
                            jn3Var.f22447w = gx2Var3;
                            jn3Var.f22450z = 3;
                            gx2Var4 = gx2Var3;
                            r4 = r3;
                            if (oq1Var.mo183g(zo0Var, ni2Var, ni2Var2, jn3Var) != ap0Var) {
                                if (qn3Var4.f28622a.f25846a > r4.f28622a.f25846a) {
                                    long jM9991a = qn3Var4.m9991a();
                                    long jM9992b = qn3Var4.m9992b();
                                    long jM12830H = y42.m12830H(((int) (jM9991a >> 32)) + ((int) (jM9992b >> 32)), ((int) (jM9991a & 4294967295L)) + ((int) (jM9992b & 4294967295L)));
                                    long jM9992b2 = r4.m9992b();
                                    o52VarM8954a = o52.m8954a(y42.m12830H(((int) (jM12830H >> 32)) - ((int) (jM9992b2 >> 32)), ((int) (jM12830H & 4294967295L)) - ((int) (4294967295L & jM9992b2))));
                                } else {
                                    o52VarM8954a = o52.m8954a(qn3Var4.m9991a());
                                }
                                rn3Var2.f29455p.setValue(o52VarM8954a);
                                C0982og c0982og = new C0982og((Object) rn3Var2, wm0Var, (byte) 20);
                                jn3Var.f22444t = rn3Var2;
                                jn3Var.f22445u = gx2Var4;
                                jn3Var.f22446v = null;
                                jn3Var.f22447w = null;
                                jn3Var.f22450z = 4;
                                r5 = gx2Var4;
                            }
                            r1 = r5;
                            return ap0Var;
                        }
                        if (i2 == 3) {
                            gx2 gx2Var7 = jn3Var.f22447w;
                            qn3 qn3Var8 = jn3Var.f22446v;
                            qn3 qn3Var9 = (qn3) jn3Var.f22445u;
                            rn3 rn3Var4 = jn3Var.f22444t;
                            k43.m7376J(obj);
                            r4 = qn3Var9;
                            qn3Var4 = qn3Var8;
                            rn3Var2 = rn3Var4;
                            gx2Var4 = gx2Var7;
                            if (qn3Var4.f28622a.f25846a > r4.f28622a.f25846a) {
                                long jM9991a2 = qn3Var4.m9991a();
                                long jM9992b3 = qn3Var4.m9992b();
                                long jM12830H2 = y42.m12830H(((int) (jM9991a2 >> 32)) + ((int) (jM9992b3 >> 32)), ((int) (jM9991a2 & 4294967295L)) + ((int) (jM9992b3 & 4294967295L)));
                                long jM9992b4 = r4.m9992b();
                                o52VarM8954a = o52.m8954a(y42.m12830H(((int) (jM12830H2 >> 32)) - ((int) (jM9992b4 >> 32)), ((int) (jM12830H2 & 4294967295L)) - ((int) (4294967295L & jM9992b4))));
                            } else {
                                o52VarM8954a = o52.m8954a(qn3Var4.m9991a());
                            }
                            rn3Var2.f29455p.setValue(o52VarM8954a);
                            C0982og c0982og2 = new C0982og((Object) rn3Var2, wm0Var, (byte) 20);
                            jn3Var.f22444t = rn3Var2;
                            jn3Var.f22445u = gx2Var4;
                            jn3Var.f22446v = null;
                            jn3Var.f22447w = null;
                            jn3Var.f22450z = 4;
                            r5 = gx2Var4;
                        } else {
                            if (i2 != 4) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            gx2 gx2Var8 = (gx2) jn3Var.f22445u;
                            rn3Var2 = jn3Var.f22444t;
                            k43.m7376J(obj);
                            r5 = gx2Var8;
                        }
                    }
                    rn3Var2.f29454o.setValue(null);
                    rn3Var2.f29455p.setValue(null);
                    r5.m6193g(null);
                    return ju4Var;
                    r1 = r5;
                    boolean zBooleanValue = ((Boolean) rn3Var2.f29451l.getValue()).booleanValue();
                    wd3 wd3Var = rn3Var2.f29440a;
                    if (!zBooleanValue) {
                        gx2Var.m6193g(null);
                        return ju4Var;
                    }
                    int i3 = r1.f28622a.f25846a;
                    si2 si2Var = (si2) wd3Var.f33259b;
                    si2 si2Var2 = (si2) wd3Var.f33259b;
                    if (i3 == si2Var.m10788g() || qn3Var4.f28622a.f25846a == si2Var2.m10788g()) {
                        int iM10788g = si2Var2.m10788g();
                        int iM132h = ((a83) si2Var2.f30299e.f19663c).m132h();
                        jn3Var.f22444t = rn3Var2;
                        jn3Var.f22445u = r1;
                        jn3Var.f22446v = qn3Var4;
                        jn3Var.f22447w = gx2Var;
                        jn3Var.f22450z = 2;
                        if (si2Var2.f30303i.mo6019b()) {
                            lb5.m7910S(((mi2) si2Var2.f30300f.getValue()).f24947h, null, null, new C0982og((Object) si2Var2, wm0Var, (byte) 13), 3);
                        }
                        si2Var2.m10791j(iM10788g, iM132h, false);
                        if (ju4Var != ap0Var) {
                            rn3Var = rn3Var2;
                            qn3Var3 = qn3Var4;
                            r2 = r1;
                            gx2Var2 = gx2Var;
                            r3 = r2;
                            qn3Var4 = qn3Var3;
                            rn3Var2 = rn3Var;
                            gx2Var3 = gx2Var2;
                            rn3Var2.f29454o.setValue(new Integer(r3.f28622a.f25846a));
                            oq1Var = (oq1) rn3Var2.f29442c.getValue();
                            zo0Var = rn3Var2.f29441b;
                            ni2Var = r3.f28622a;
                            ni2Var2 = qn3Var4.f28622a;
                            jn3Var.f22444t = rn3Var2;
                            jn3Var.f22445u = r3;
                            jn3Var.f22446v = qn3Var4;
                            jn3Var.f22447w = gx2Var3;
                            jn3Var.f22450z = 3;
                            gx2Var4 = gx2Var3;
                            r4 = r3;
                            if (oq1Var.mo183g(zo0Var, ni2Var, ni2Var2, jn3Var) != ap0Var) {
                                if (qn3Var4.f28622a.f25846a > r4.f28622a.f25846a) {
                                    long jM9991a3 = qn3Var4.m9991a();
                                    long jM9992b5 = qn3Var4.m9992b();
                                    long jM12830H3 = y42.m12830H(((int) (jM9991a3 >> 32)) + ((int) (jM9992b5 >> 32)), ((int) (jM9991a3 & 4294967295L)) + ((int) (jM9992b5 & 4294967295L)));
                                    long jM9992b6 = r4.m9992b();
                                    o52VarM8954a = o52.m8954a(y42.m12830H(((int) (jM12830H3 >> 32)) - ((int) (jM9992b6 >> 32)), ((int) (jM12830H3 & 4294967295L)) - ((int) (4294967295L & jM9992b6))));
                                } else {
                                    o52VarM8954a = o52.m8954a(qn3Var4.m9991a());
                                }
                                rn3Var2.f29455p.setValue(o52VarM8954a);
                                C0982og c0982og3 = new C0982og((Object) rn3Var2, wm0Var, (byte) 20);
                                jn3Var.f22444t = rn3Var2;
                                jn3Var.f22445u = gx2Var4;
                                jn3Var.f22446v = null;
                                jn3Var.f22447w = null;
                                jn3Var.f22450z = 4;
                                r5 = gx2Var4;
                            }
                        }
                    } else {
                        gx2 gx2Var9 = gx2Var;
                        r3 = r1;
                        gx2Var3 = gx2Var9;
                        rn3Var2.f29454o.setValue(new Integer(r3.f28622a.f25846a));
                        oq1Var = (oq1) rn3Var2.f29442c.getValue();
                        zo0Var = rn3Var2.f29441b;
                        ni2Var = r3.f28622a;
                        ni2Var2 = qn3Var4.f28622a;
                        jn3Var.f22444t = rn3Var2;
                        jn3Var.f22445u = r3;
                        jn3Var.f22446v = qn3Var4;
                        jn3Var.f22447w = gx2Var3;
                        jn3Var.f22450z = 3;
                        gx2Var4 = gx2Var3;
                        r4 = r3;
                        if (oq1Var.mo183g(zo0Var, ni2Var, ni2Var2, jn3Var) != ap0Var) {
                            if (qn3Var4.f28622a.f25846a > r4.f28622a.f25846a) {
                                long jM9991a4 = qn3Var4.m9991a();
                                long jM9992b7 = qn3Var4.m9992b();
                                long jM12830H4 = y42.m12830H(((int) (jM9991a4 >> 32)) + ((int) (jM9992b7 >> 32)), ((int) (jM9991a4 & 4294967295L)) + ((int) (jM9992b7 & 4294967295L)));
                                long jM9992b8 = r4.m9992b();
                                o52VarM8954a = o52.m8954a(y42.m12830H(((int) (jM12830H4 >> 32)) - ((int) (jM9992b8 >> 32)), ((int) (jM12830H4 & 4294967295L)) - ((int) (4294967295L & jM9992b8))));
                            } else {
                                o52VarM8954a = o52.m8954a(qn3Var4.m9991a());
                            }
                            rn3Var2.f29455p.setValue(o52VarM8954a);
                            C0982og c0982og4 = new C0982og((Object) rn3Var2, wm0Var, (byte) 20);
                            jn3Var.f22444t = rn3Var2;
                            jn3Var.f22445u = gx2Var4;
                            jn3Var.f22446v = null;
                            jn3Var.f22447w = null;
                            jn3Var.f22450z = 4;
                            r5 = gx2Var4;
                        }
                    }
                    r1 = r5;
                    return ap0Var;
                } catch (Throwable th) {
                    th = th;
                    r5 = gx2Var;
                    r5.m6193g(null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (CancellationException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: g */
    public final Object m10380g(Object obj, long j, ym0 ym0Var) {
        ln3 ln3Var;
        Object obj2;
        qn3 qn3Var;
        long j2;
        wd3 wd3Var = this.f29440a;
        if (ym0Var instanceof ln3) {
            ln3Var = (ln3) ym0Var;
            int i = ln3Var.f24213z;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln3Var.f24213z = i - Integer.MIN_VALUE;
            } else {
                ln3Var = new ln3(this, ym0Var);
            }
        } else {
            ln3Var = new ln3(this, ym0Var);
        }
        Object obj3 = ln3Var.f24211x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ln3Var.f24213z;
        if (i2 == 0) {
            k43.m7376J(obj3);
            ArrayList arrayListM12087m = wd3Var.m12236d().m12087m();
            int size = arrayListM12087m.size();
            int i3 = 0;
            do {
                if (i3 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayListM12087m.get(i3);
                i3++;
            } while (!((qn3) obj2).f28622a.f25855j.equals(obj));
            qn3Var = (qn3) obj2;
            if (qn3Var != null) {
                long jM9991a = qn3Var.m9991a();
                int iOrdinal = m10377d().ordinal();
                if (iOrdinal == 0) {
                    j2 = jM9991a & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    j2 = jM9991a >> 32;
                }
                int i4 = (int) j2;
                if (i4 < 0) {
                    db4 db4VarM10014I = qq2.m10014I(0.0f, 0.0f, null, 7);
                    ln3Var.f24207t = this;
                    ln3Var.f24208u = obj;
                    ln3Var.f24209v = qn3Var;
                    ln3Var.f24210w = j;
                    ln3Var.f24213z = 1;
                    if (z62.m13385m((si2) wd3Var.f33259b, i4, db4VarM10014I, ln3Var) == ap0Var) {
                        return ap0Var;
                    }
                }
            }
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = ln3Var.f24210w;
        qn3 qn3Var2 = ln3Var.f24209v;
        obj = ln3Var.f24208u;
        rn3 rn3Var = ln3Var.f24207t;
        k43.m7376J(obj3);
        qn3Var = qn3Var2;
        this = rn3Var;
        this.f29450k.setValue(obj);
        this.f29453n.setValue(o52.m8954a(qn3Var.m9991a()));
        this.f29456q = j;
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: h */
    public final long m10381h(long j) {
        ((mi2) this.f29440a.m12236d().f33090b).getClass();
        int iOrdinal = m10377d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return 0L;
            }
            int iOrdinal2 = this.f29447h.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return d24.m4294I(j, d63.f16815b);
                }
                C0670g.m5864c();
                return 0L;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public final long m10382i(long j) {
        int iOrdinal = this.f29447h.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        C0670g.m5864c();
        return 0L;
    }
}
