package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0981of implements xq2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26661a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26662b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26663c;

    public /* synthetic */ C0981of(byte b) {
        this.f26661a = b;
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        int iMax;
        int iMax2;
        int i;
        int i2;
        int iM10010E;
        C0853kz c0853kz;
        byte b = this.f26661a;
        Map map = w71.f33134a;
        switch (b) {
            case 0:
                ((cd3) this.f26662b).setParentLayoutDirection((df2) this.f26663c);
                return zq2Var.mo3583l0(0, 0, map, new C0891m((byte) 18));
            case 1:
                d63 d63Var = (d63) this.f26662b;
                k84 k84Var = (k84) this.f26663c;
                float[] fArr = k84Var.f22989d;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sq2 sq2Var = (sq2) list.get(i3);
                    if (qq2.m10035s(sq2Var) == v74.f32448a) {
                        db3 db3VarMo5826e = sq2Var.mo5826e(j);
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            sq2 sq2Var2 = (sq2) list.get(i4);
                            if (qq2.m10035s(sq2Var2) == v74.f32449b) {
                                d63 d63Var2 = d63.f16814a;
                                db3 db3VarMo5826e2 = d63Var == d63Var2 ? sq2Var2.mo5826e(kl0.m7532b(ll0.m8017i(0, j, -db3VarMo5826e.f16900b), 0, 0, 0, 0, 14)) : sq2Var2.mo5826e(kl0.m7532b(ll0.m8017i(-db3VarMo5826e.f16899a, j, 0), 0, 0, 0, 0, 11));
                                ol3 ol3Var = new ol3();
                                float fM7426c = k84Var.m7426c();
                                if (!z62.m13386n(fM7426c, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
                                    z62.m13386n(fM7426c, fArr.length == 0 ? null : Float.valueOf(fArr[fArr.length - 1]));
                                }
                                db3VarMo5826e2.mo4419e0(j84.f22091a);
                                int i5 = db3VarMo5826e.f16899a;
                                int i6 = db3VarMo5826e.f16900b;
                                int i7 = db3VarMo5826e2.f16899a;
                                int i8 = db3VarMo5826e2.f16900b;
                                if (d63Var == d63Var2) {
                                    iMax = Math.max(i7, i5);
                                    iMax2 = i6 + i8;
                                    i = (iMax - db3VarMo5826e2.f16899a) / 2;
                                    i2 = i6 / 2;
                                    iM10010E = (iMax - db3VarMo5826e.f16899a) / 2;
                                    ol3Var.f26851a = (i2 - (db3VarMo5826e.f16900b / 2)) + qq2.m10010E(i8 * fM7426c);
                                } else {
                                    iMax = i5 + i7;
                                    iMax2 = Math.max(i8, i6);
                                    i = i5 / 2;
                                    i2 = (iMax2 - db3VarMo5826e2.f16900b) / 2;
                                    iM10010E = (qq2.m10010E(db3VarMo5826e2.f16899a * fM7426c) + i) - (db3VarMo5826e.f16899a / 2);
                                    ol3Var.f26851a = (iMax2 - db3VarMo5826e.f16900b) / 2;
                                }
                                k84Var.f22990e.m133i(iMax);
                                k84Var.f22991f.m133i(iMax2);
                                f84 f84Var = new f84();
                                f84Var.f18845a = db3VarMo5826e2;
                                f84Var.f18846b = i;
                                f84Var.f18847c = i2;
                                f84Var.f18848d = db3VarMo5826e;
                                f84Var.f18849e = iM10010E;
                                f84Var.f18850f = ol3Var;
                                VarHandle.storeStoreFence();
                                return zq2Var.mo3583l0(iMax, iMax2, map, f84Var);
                            }
                        }
                        yl2.m13171b("Collection contains no element matching the predicate.");
                        xy4.m12794w();
                        return null;
                    }
                }
                yl2.m13171b("Collection contains no element matching the predicate.");
                xy4.m12794w();
                return null;
            default:
                nh4 nh4Var = (nh4) this.f26663c;
                mh4 mh4Var = (mh4) this.f26662b;
                long jM7539i = (((long) kl0.m7539i(j)) << 32) | (((long) kl0.m7538h(j)) & 4294967295L);
                long jM7532b = kl0.m7532b(j, 0, 0, 0, 0, 10);
                List list2 = list;
                ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((sq2) it.next()).mo5826e(jM7532b));
                }
                ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
                int size3 = arrayList.size();
                int i9 = 0;
                int i10 = 0;
                while (i10 < size3) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int i11 = i9 + 1;
                    if (i9 < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    db3 db3Var = (db3) obj;
                    Object objMo4423m = ((sq2) list.get(i9)).mo4423m();
                    qg4 qg4Var = objMo4423m instanceof qg4 ? (qg4) objMo4423m : null;
                    if (qg4Var == null || (c0853kz = qg4Var.f28458o) == null) {
                        c0853kz = ig1.f21378b;
                    }
                    long jMo3927a = c0853kz.mo3927a((((long) db3Var.f16899a) << 32) | (((long) db3Var.f16900b) & 4294967295L), jM7539i, zq2Var.getLayoutDirection());
                    if (qg4Var != null) {
                        qg4Var.f28459p.getClass();
                        jMo3927a = o52.m8958e(jMo3927a, o52.m8954a(0L).f26352a);
                    }
                    arrayList2.add(o52.m8954a(jMo3927a));
                    size3 = size3;
                    i9 = i11;
                }
                ql3 ql3Var = new ql3();
                ql3Var.f28555a = s52.f29915e;
                int size4 = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (i12 < size4) {
                    Object obj2 = arrayList.get(i12);
                    int i14 = i12 + 1;
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    db3 db3Var2 = (db3) obj2;
                    int i16 = size4;
                    s52 s52VarM12971h = y62.m12971h(((o52) arrayList2.get(i13)).f26352a, (((long) db3Var2.f16899a) << 32) | (((long) db3Var2.f16900b) & 4294967295L));
                    if (!s52VarM12971h.m10526b()) {
                        if (!((s52) ql3Var.f28555a).m10526b()) {
                            s52VarM12971h = new s52(Math.min(((s52) ql3Var.f28555a).f29916a, s52VarM12971h.f29916a), Math.min(((s52) ql3Var.f28555a).f29917b, s52VarM12971h.f29917b), Math.max(((s52) ql3Var.f28555a).f29918c, s52VarM12971h.f29918c), Math.max(((s52) ql3Var.f28555a).f29919d, s52VarM12971h.f29919d));
                        }
                        ql3Var.f28555a = s52VarM12971h;
                    }
                    size4 = i16;
                    i12 = i14;
                    i13 = i15;
                }
                if (!z62.m13387o(ql3Var.f28555a, mh4Var.f24923j)) {
                    mh4Var.f24923j = (s52) ql3Var.f28555a;
                    zg4 state = nh4Var.getState();
                    Object obj3 = ql3Var.f28555a;
                    s52 s52Var = (s52) obj3;
                    int i17 = s52Var.f29918c - s52Var.f29916a;
                    if (i17 < 1) {
                        i17 = 1;
                    }
                    s52 s52Var2 = (s52) obj3;
                    int i18 = s52Var2.f29919d - s52Var2.f29917b;
                    if (i18 < 1) {
                        i18 = 1;
                    }
                    state.f36068b.setValue(w52.m12106a((((long) i18) & 4294967295L) | (((long) i17) << 32)));
                    nh4Var.getState().f36069c.setValue(o52.m8954a(((s52) ql3Var.f28555a).m10525a()));
                }
                bh4 bh4Var = new bh4((byte) 1);
                bh4Var.f15274b = arrayList;
                bh4Var.f15275c = arrayList2;
                bh4Var.f15276d = ql3Var;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0((int) (jM7539i >> 32), (int) (jM7539i & 4294967295L), map, bh4Var);
        }
    }
}
