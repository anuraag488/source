package p000;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.m63;
import ads_mobile_sdk.sw1;
import ads_mobile_sdk.uh3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k54 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public Object f22904A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f22905B;

    /* JADX INFO: renamed from: C */
    public Object f22906C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ Object f22907D;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22908t = 0;

    /* JADX INFO: renamed from: u */
    public byte f22909u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f22910v;

    /* JADX INFO: renamed from: w */
    public Object f22911w;

    /* JADX INFO: renamed from: x */
    public Object f22912x;

    /* JADX INFO: renamed from: y */
    public Object f22913y;

    /* JADX INFO: renamed from: z */
    public Object f22914z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k54(long j, gx2 gx2Var, m54 m54Var, Map map, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22910v = j;
        this.f22912x = gx2Var;
        this.f22914z = m54Var;
        this.f22905B = map;
        this.f22907D = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22908t;
        Object obj2 = this.f22905B;
        switch (b) {
            case 0:
                Object obj3 = this.f22907D;
                return new k54(this.f22910v, (gx2) this.f22912x, (m54) this.f22914z, (Map) obj2, obj3, wm0Var);
            default:
                return new k54((m63) obj2, (ArrayList) this.f22906C, (C0213l2) this.f22907D, this.f22910v, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22908t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((k54) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((k54) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x00de  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {all -> 0x0151, blocks: (B:46:0x0144, B:48:0x0148), top: B:56:0x0144 }] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        gx2 gx2Var;
        m54 m54Var;
        Map map;
        sw1 sw1Var;
        ArrayList arrayList;
        uh3 uh3Var;
        Object objM1688a;
        Integer num;
        C0213l2 c0213l2;
        m63 m63Var;
        C0213l2 c0213l3;
        Object objM2298a;
        List list;
        m63 m63Var2;
        C1372yl c1372yl;
        uh3 uh3Var2;
        byte b = this.f22908t;
        ju4 ju4Var = ju4.f22634a;
        long j = this.f22910v;
        Object obj2 = this.f22905B;
        Object obj3 = this.f22907D;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f22909u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    this.f22909u = (byte) 1;
                    if (d24.m4318s(j, this) != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.f22906C;
                    map = (Map) this.f22904A;
                    m54Var = (m54) this.f22913y;
                    gx2Var = (gx2) this.f22911w;
                    k43.m7376J(obj);
                }
                try {
                    if (m54Var.f24672b == 0) {
                        m54Var.f24671a.mo4993a(null);
                        map.remove(obj3);
                        break;
                    }
                    return ju4Var;
                } finally {
                    gx2Var.m6193g(null);
                }
                gx2Var = (gx2) this.f22912x;
                m54Var = (m54) this.f22914z;
                Map map2 = (Map) obj2;
                this.f22911w = gx2Var;
                this.f22913y = m54Var;
                this.f22904A = map2;
                this.f22906C = obj3;
                this.f22909u = (byte) 2;
                if (gx2Var.m6191e(this) != ap0Var) {
                    map = map2;
                    if (m54Var.f24672b == 0) {
                        m54Var.f24671a.mo4993a(null);
                        map.remove(obj3);
                        break;
                    }
                    return ju4Var;
                }
                return ap0Var;
            default:
                C0213l2 c0213l4 = (C0213l2) obj3;
                m63 m63Var3 = (m63) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f22909u;
                if (b3 != 0) {
                    if (b3 == 1) {
                        Integer num2 = (Integer) this.f22904A;
                        c0213l2 = (C0213l2) this.f22914z;
                        uh3Var = (uh3) this.f22913y;
                        arrayList = (ArrayList) this.f22912x;
                        sw1Var = (sw1) this.f22911w;
                        k43.m7376J(obj);
                        num = num2;
                        objM1688a = obj;
                    } else {
                        if (b3 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        c0213l3 = c0213l4;
                        m63Var = m63Var3;
                        objM2298a = obj;
                    }
                    list = (List) objM2298a;
                    m63Var2 = m63Var;
                    c1372yl = m63Var2.f7137c;
                    if (c0213l3 != null) {
                        uh3Var2 = m63Var2.f7143i;
                        if (uh3Var2 != null) {
                            z62.m13366Y("serverTransaction");
                            throw null;
                        }
                        C1372yl.m13156a(c1372yl, list, c0213l3, uh3Var2.f12397b.f9007b, null, null, 56);
                    } else {
                        c1372yl.m13164a(list);
                    }
                    return ju4Var;
                }
                k43.m7376J(obj);
                sw1Var = m63Var3.f7138d;
                arrayList = (ArrayList) this.f22906C;
                uh3Var = m63Var3.f7143i;
                if (uh3Var == null) {
                    z62.m13366Y("serverTransaction");
                    throw null;
                }
                Integer num3 = new Integer(m63Var3.f7141g);
                this.f22911w = sw1Var;
                this.f22912x = arrayList;
                this.f22913y = uh3Var;
                this.f22914z = c0213l4;
                this.f22904A = num3;
                this.f22909u = (byte) 1;
                objM1688a = m63.m1688a(m63Var3, this);
                if (objM1688a == ap0Var2) {
                    return ap0Var2;
                }
                num = num3;
                c0213l2 = c0213l4;
                i41 i41VarM6644c = i41.m6644c(j);
                this.f22911w = null;
                this.f22912x = null;
                this.f22913y = null;
                this.f22914z = null;
                this.f22904A = null;
                this.f22909u = (byte) 2;
                ArrayList arrayList2 = arrayList;
                sw1 sw1Var2 = sw1Var;
                m63Var = m63Var3;
                c0213l3 = c0213l4;
                objM2298a = sw1Var2.m2298a(arrayList2, uh3Var, c0213l2, (4032 & 8) != 0 ? null : num, (4032 & 16) != 0 ? null : (String) objM1688a, (4032 & 32) != 0 ? null : i41VarM6644c, (4032 & 64) != 0 ? "" : null, (4032 & 128) != 0 ? null : null, (4032 & 256) != 0 ? null : null, (4032 & 512) != 0 ? null : null, (4032 & 1024) != 0 ? null : null, (4032 & 2048) != 0 ? null : null, this);
                if (objM2298a == ap0Var2) {
                    return ap0Var2;
                }
                list = (List) objM2298a;
                m63Var2 = m63Var;
                c1372yl = m63Var2.f7137c;
                if (c0213l3 != null) {
                    uh3Var2 = m63Var2.f7143i;
                    if (uh3Var2 != null) {
                        z62.m13366Y("serverTransaction");
                        throw null;
                    }
                    C1372yl.m13156a(c1372yl, list, c0213l3, uh3Var2.f12397b.f9007b, null, null, 56);
                } else {
                    c1372yl.m13164a(list);
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k54(m63 m63Var, ArrayList arrayList, C0213l2 c0213l2, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22905B = m63Var;
        this.f22906C = arrayList;
        this.f22907D = c0213l2;
        this.f22910v = j;
    }
}
