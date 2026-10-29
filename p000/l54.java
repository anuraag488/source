package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l54 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public /* synthetic */ Object f23798A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ gx2 f23799B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ LinkedHashMap f23800C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ zo0 f23801D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ro0 f23802E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ y93 f23803F;

    /* JADX INFO: renamed from: t */
    public Object f23804t;

    /* JADX INFO: renamed from: u */
    public Object f23805u;

    /* JADX INFO: renamed from: v */
    public Object f23806v;

    /* JADX INFO: renamed from: w */
    public Object f23807w;

    /* JADX INFO: renamed from: x */
    public Object f23808x;

    /* JADX INFO: renamed from: y */
    public LinkedHashMap f23809y;

    /* JADX INFO: renamed from: z */
    public byte f23810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l54(gx2 gx2Var, LinkedHashMap linkedHashMap, zo0 zo0Var, ro0 ro0Var, y93 y93Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f23799B = gx2Var;
        this.f23800C = linkedHashMap;
        this.f23801D = zo0Var;
        this.f23802E = ro0Var;
        this.f23803F = y93Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        l54 l54Var = new l54(this.f23799B, this.f23800C, this.f23801D, this.f23802E, this.f23803F, wm0Var);
        l54Var.f23798A = obj;
        return l54Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((l54) create((wm0) obj2, obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128 A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #3 {all -> 0x0137, blocks: (B:42:0x0120, B:44:0x0128), top: B:75:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0168 A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #4 {all -> 0x0177, blocks: (B:57:0x0160, B:59:0x0168), top: B:77:0x0160 }] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        ro0 ro0Var;
        mq1 mq1Var;
        zo0 zo0Var;
        Map map;
        gx2 gx2Var;
        m54 m54Var;
        Object objM5007w;
        m54 m54Var2;
        gx2 gx2Var2;
        gx2 gx2Var3;
        Throwable th;
        m54 m54Var3;
        gx2 gx2Var4;
        gx2 gx2Var5;
        Object obj2;
        zo0 zo0Var2;
        LinkedHashMap linkedHashMap;
        int i;
        zo0 zo0Var3;
        LinkedHashMap linkedHashMap2;
        int i2;
        Object obj3 = this.f23798A;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f23810z;
        zo0 zo0Var4 = this.f23801D;
        LinkedHashMap linkedHashMap3 = this.f23800C;
        gx2 gx2Var6 = this.f23799B;
        try {
            try {
                if (b == 0) {
                    k43.m7376J(obj);
                    this.f23798A = obj3;
                    this.f23804t = gx2Var6;
                    this.f23805u = linkedHashMap3;
                    this.f23806v = zo0Var4;
                    ro0Var = this.f23802E;
                    this.f23807w = ro0Var;
                    mq1Var = this.f23803F;
                    this.f23808x = mq1Var;
                    this.f23810z = (byte) 1;
                    if (gx2Var6.m6191e(this) != ap0Var) {
                        zo0Var = zo0Var4;
                        map = linkedHashMap3;
                        gx2Var = gx2Var6;
                    }
                    return ap0Var;
                }
                if (b != 1) {
                    if (b == 2) {
                        m54 m54Var4 = (m54) this.f23804t;
                        try {
                            k43.m7376J(obj);
                            objM5007w = obj;
                            m54Var = m54Var4;
                            this.f23798A = obj3;
                            this.f23804t = m54Var;
                            this.f23805u = objM5007w;
                            this.f23806v = gx2Var6;
                            this.f23807w = zo0Var4;
                            this.f23808x = gx2Var6;
                            this.f23809y = linkedHashMap3;
                            this.f23810z = (byte) 3;
                            if (gx2Var6.m6191e(this) != ap0Var) {
                                m54Var3 = m54Var;
                                gx2Var4 = gx2Var6;
                                gx2Var5 = gx2Var4;
                                obj2 = objM5007w;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            m54Var = m54Var4;
                            this.f23798A = obj3;
                            this.f23804t = m54Var;
                            this.f23805u = th;
                            this.f23806v = gx2Var6;
                            this.f23807w = zo0Var4;
                            this.f23808x = gx2Var6;
                            this.f23809y = linkedHashMap3;
                            this.f23810z = (byte) 4;
                            if (gx2Var6.m6191e(this) != ap0Var) {
                                m54Var2 = m54Var;
                                gx2Var2 = gx2Var6;
                                gx2Var3 = gx2Var2;
                                th = th;
                                zo0Var3 = zo0Var4;
                                linkedHashMap2 = linkedHashMap3;
                                i2 = m54Var2.f24672b - 1;
                                m54Var2.f24672b = i2;
                                if (i2 == 0) {
                                    m54Var2.f24673c = lb5.m7910S(zo0Var3, null, null, new k54(0L, gx2Var2, m54Var2, linkedHashMap2, obj3, null), 3);
                                }
                                throw th;
                            }
                        }
                        return ap0Var;
                    }
                    if (b != 3) {
                        if (b != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        linkedHashMap3 = this.f23809y;
                        gx2 gx2Var7 = (gx2) this.f23808x;
                        zo0Var4 = (zo0) this.f23807w;
                        gx2 gx2Var8 = (gx2) this.f23806v;
                        Throwable th3 = (Throwable) this.f23805u;
                        m54 m54Var5 = (m54) this.f23804t;
                        k43.m7376J(obj);
                        gx2Var3 = gx2Var8;
                        m54Var2 = m54Var5;
                        gx2Var2 = gx2Var7;
                        th = th3;
                        zo0Var3 = zo0Var4;
                        linkedHashMap2 = linkedHashMap3;
                        try {
                            i2 = m54Var2.f24672b - 1;
                            m54Var2.f24672b = i2;
                            if (i2 == 0) {
                                m54Var2.f24673c = lb5.m7910S(zo0Var3, null, null, new k54(0L, gx2Var2, m54Var2, linkedHashMap2, obj3, null), 3);
                            }
                            throw th;
                        } finally {
                            gx2Var3.m6193g(null);
                        }
                    }
                    linkedHashMap3 = this.f23809y;
                    gx2 gx2Var9 = (gx2) this.f23808x;
                    zo0Var4 = (zo0) this.f23807w;
                    gx2 gx2Var10 = (gx2) this.f23806v;
                    Object obj4 = this.f23805u;
                    m54 m54Var6 = (m54) this.f23804t;
                    k43.m7376J(obj);
                    gx2Var5 = gx2Var10;
                    m54Var3 = m54Var6;
                    gx2Var4 = gx2Var9;
                    obj2 = obj4;
                    zo0Var2 = zo0Var4;
                    linkedHashMap = linkedHashMap3;
                    try {
                        i = m54Var3.f24672b - 1;
                        m54Var3.f24672b = i;
                        if (i == 0) {
                            m54Var3.f24673c = lb5.m7910S(zo0Var2, null, null, new k54(0L, gx2Var4, m54Var3, linkedHashMap, obj3, null), 3);
                        }
                        return obj2;
                    } finally {
                        gx2Var5.m6193g(null);
                    }
                }
                mq1Var = (mq1) this.f23808x;
                ro0Var = (ro0) this.f23807w;
                zo0Var = (zo0) this.f23806v;
                map = (Map) this.f23805u;
                gx2Var = (gx2) this.f23804t;
                k43.m7376J(obj);
                ix0 ix0Var = m54Var.f24671a;
                this.f23798A = obj3;
                this.f23804t = m54Var;
                this.f23805u = null;
                this.f23806v = null;
                this.f23807w = null;
                this.f23808x = null;
                this.f23810z = (byte) 2;
                objM5007w = ix0Var.m5007w(this);
                if (objM5007w != ap0Var) {
                    this.f23798A = obj3;
                    this.f23804t = m54Var;
                    this.f23805u = objM5007w;
                    this.f23806v = gx2Var6;
                    this.f23807w = zo0Var4;
                    this.f23808x = gx2Var6;
                    this.f23809y = linkedHashMap3;
                    this.f23810z = (byte) 3;
                    if (gx2Var6.m6191e(this) != ap0Var) {
                        m54Var3 = m54Var;
                        gx2Var4 = gx2Var6;
                        gx2Var5 = gx2Var4;
                        obj2 = objM5007w;
                        zo0Var2 = zo0Var4;
                        linkedHashMap = linkedHashMap3;
                        i = m54Var3.f24672b - 1;
                        m54Var3.f24672b = i;
                        if (i == 0) {
                            m54Var3.f24673c = lb5.m7910S(zo0Var2, null, null, new k54(0L, gx2Var4, m54Var3, linkedHashMap, obj3, null), 3);
                        }
                        return obj2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                this.f23798A = obj3;
                this.f23804t = m54Var;
                this.f23805u = th;
                this.f23806v = gx2Var6;
                this.f23807w = zo0Var4;
                this.f23808x = gx2Var6;
                this.f23809y = linkedHashMap3;
                this.f23810z = (byte) 4;
                if (gx2Var6.m6191e(this) != ap0Var) {
                    m54Var2 = m54Var;
                    gx2Var2 = gx2Var6;
                    gx2Var3 = gx2Var2;
                    th = th;
                    zo0Var3 = zo0Var4;
                    linkedHashMap2 = linkedHashMap3;
                    i2 = m54Var2.f24672b - 1;
                    m54Var2.f24672b = i2;
                    if (i2 == 0) {
                        m54Var2.f24673c = lb5.m7910S(zo0Var3, null, null, new k54(0L, gx2Var2, m54Var2, linkedHashMap2, obj3, null), 3);
                    }
                    throw th;
                }
            }
            Object obj5 = map.get(obj3);
            if (obj5 == null) {
                ix0 ix0VarM7937r = lb5.m7937r(zo0Var, ro0Var, new w93(mq1Var, obj3, (wm0) null), 2);
                m54 m54Var7 = new m54();
                m54Var7.f24671a = ix0VarM7937r;
                VarHandle.storeStoreFence();
                map.put(obj3, m54Var7);
                obj5 = m54Var7;
            }
            m54Var = (m54) obj5;
            m54Var.f24672b++;
            t82 t82Var = m54Var.f24673c;
            if (t82Var != null) {
                t82Var.mo4993a(null);
            }
            m54Var.f24673c = null;
            gx2Var.m6193g(null);
            return ap0Var;
        } catch (Throwable th5) {
            gx2Var.m6193g(null);
            throw th5;
        }
    }
}
