package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv3 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ a05 f25236a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ mq1 f25237b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f25238c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ pg0 f25239d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ byte f25240e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ mq1 f25241f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ ov3 f25242g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ pg0 f25243h;

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
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        ArrayList arrayList;
        Object obj4;
        Object obj5;
        int i;
        vi3 vi3Var;
        Object obj6;
        a05 a05Var;
        Integer numValueOf;
        int iIntValue;
        int iMo9a;
        Object obj7;
        Object obj8;
        int iMo3579U;
        int iMo3579U2;
        a05 a05Var2 = this.f25236a;
        mq1 mq1Var = this.f25237b;
        mq1 mq1Var2 = this.f25238c;
        pg0 pg0Var = this.f25239d;
        byte b = this.f25240e;
        mq1 mq1Var3 = this.f25241f;
        ov3 ov3Var = this.f25242g;
        pg0 pg0Var2 = this.f25243h;
        fe4 fe4Var = (fe4) obj;
        kl0 kl0Var = (kl0) obj2;
        int iM7539i = kl0.m7539i(kl0Var.f23210a);
        int iM7538h = kl0.m7538h(kl0Var.f23210a);
        long jM7532b = kl0.m7532b(kl0Var.f23210a, 0, 0, 0, 0, 10);
        int iMo12d = a05Var2.mo12d(fe4Var, fe4Var.getLayoutDirection());
        int iMo11c = a05Var2.mo11c(fe4Var, fe4Var.getLayoutDirection());
        int iMo9a2 = a05Var2.mo9a(fe4Var);
        List listMo3576L = fe4Var.mo3576L(mq1Var, pv3.f28030a);
        ArrayList arrayList2 = new ArrayList(listMo3576L.size());
        int size = listMo3576L.size();
        int i2 = 0;
        while (i2 < size) {
            arrayList2.add(((sq2) listMo3576L.get(i2)).mo5826e(jM7532b));
            i2++;
            listMo3576L = listMo3576L;
        }
        int i3 = 1;
        if (arrayList2.isEmpty()) {
            arrayList = arrayList2;
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int i4 = ((db3) obj3).f16900b;
            int iM7689T = kx5.m7689T(arrayList2);
            if (1 <= iM7689T) {
                while (true) {
                    Object obj9 = arrayList2.get(i3);
                    arrayList = arrayList2;
                    int i5 = ((db3) obj9).f16900b;
                    if (i4 < i5) {
                        i4 = i5;
                        obj3 = obj9;
                    }
                    if (i3 == iM7689T) {
                        break;
                    }
                    i3++;
                    arrayList2 = arrayList;
                }
            } else {
                arrayList = arrayList2;
            }
        }
        db3 db3Var = (db3) obj3;
        int i6 = db3Var != null ? db3Var.f16900b : 0;
        List listMo3576L2 = fe4Var.mo3576L(mq1Var2, pv3.f28032c);
        ArrayList arrayList3 = new ArrayList(listMo3576L2.size());
        int size2 = listMo3576L2.size();
        int i7 = 0;
        while (i7 < size2) {
            arrayList3.add(((sq2) listMo3576L2.get(i7)).mo5826e(ll0.m8017i((-iMo12d) - iMo11c, jM7532b, -iMo9a2)));
            i7++;
            size2 = size2;
            listMo3576L2 = listMo3576L2;
            a05Var2 = a05Var2;
            pg0Var2 = pg0Var2;
        }
        pg0 pg0Var3 = pg0Var2;
        a05 a05Var3 = a05Var2;
        if (!arrayList3.isEmpty()) {
            obj4 = arrayList3.get(0);
            int i8 = ((db3) obj4).f16900b;
            int iM7689T2 = kx5.m7689T(arrayList3);
            if (1 <= iM7689T2) {
                int i9 = 1;
                while (true) {
                    Object obj10 = arrayList3.get(i9);
                    Object obj11 = obj4;
                    int i10 = ((db3) obj10).f16900b;
                    if (i8 < i10) {
                        i8 = i10;
                        obj4 = obj10;
                    } else {
                        obj4 = obj11;
                    }
                    if (i9 == iM7689T2) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            obj4 = null;
        }
        db3 db3Var2 = (db3) obj4;
        int i11 = db3Var2 != null ? db3Var2.f16900b : 0;
        if (arrayList3.isEmpty()) {
            i = i11;
            obj5 = null;
        } else {
            obj5 = arrayList3.get(0);
            int i12 = ((db3) obj5).f16899a;
            int iM7689T3 = kx5.m7689T(arrayList3);
            if (1 <= iM7689T3) {
                int i13 = 1;
                while (true) {
                    Object obj12 = arrayList3.get(i13);
                    i = i11;
                    int i14 = ((db3) obj12).f16899a;
                    if (i12 < i14) {
                        i12 = i14;
                        obj5 = obj12;
                    }
                    if (i13 == iM7689T3) {
                        break;
                    }
                    i13++;
                    i11 = i;
                }
            } else {
                i = i11;
            }
        }
        db3 db3Var3 = (db3) obj5;
        int i15 = db3Var3 != null ? db3Var3.f16899a : 0;
        List listMo3576L3 = fe4Var.mo3576L(pg0Var, pv3.f28033d);
        ArrayList arrayList4 = new ArrayList(listMo3576L3.size());
        int size3 = listMo3576L3.size();
        int i16 = 0;
        while (i16 < size3) {
            List list = listMo3576L3;
            int i17 = size3;
            int i18 = i15;
            db3 db3VarMo5826e = ((sq2) listMo3576L3.get(i16)).mo5826e(ll0.m8017i((-iMo12d) - iMo11c, jM7532b, -iMo9a2));
            if (db3VarMo5826e.f16900b == 0 || db3VarMo5826e.f16899a == 0) {
                db3VarMo5826e = null;
            }
            if (db3VarMo5826e != null) {
                arrayList4.add(db3VarMo5826e);
            }
            i16++;
            listMo3576L3 = list;
            size3 = i17;
            i15 = i18;
        }
        int i19 = i15;
        if (arrayList4.isEmpty()) {
            vi3Var = null;
        } else {
            if (!arrayList4.isEmpty()) {
                obj7 = arrayList4.get(0);
                int i20 = ((db3) obj7).f16899a;
                int iM7689T4 = kx5.m7689T(arrayList4);
                if (1 <= iM7689T4) {
                    int i21 = 1;
                    while (true) {
                        Object obj13 = arrayList4.get(i21);
                        int i22 = ((db3) obj13).f16899a;
                        if (i20 < i22) {
                            i20 = i22;
                            obj7 = obj13;
                        }
                        if (i21 == iM7689T4) {
                            break;
                        }
                        i21++;
                    }
                }
            } else {
                obj7 = null;
            }
            int i23 = ((db3) obj7).f16899a;
            if (!arrayList4.isEmpty()) {
                obj8 = arrayList4.get(0);
                int i24 = ((db3) obj8).f16900b;
                int iM7689T5 = kx5.m7689T(arrayList4);
                if (1 <= iM7689T5) {
                    int i25 = 1;
                    while (true) {
                        Object obj14 = arrayList4.get(i25);
                        int i26 = ((db3) obj14).f16900b;
                        if (i24 < i26) {
                            i24 = i26;
                            obj8 = obj14;
                        }
                        if (i25 == iM7689T5) {
                            break;
                        }
                        i25++;
                    }
                }
            } else {
                obj8 = null;
            }
            int i27 = ((db3) obj8).f16900b;
            if (b == 0) {
                if (fe4Var.getLayoutDirection() == df2.f17011a) {
                    iMo3579U = fe4Var.mo3579U(16.0f);
                    iMo3579U2 = iMo3579U + iMo12d;
                } else {
                    iMo3579U2 = ((iM7539i - fe4Var.mo3579U(16.0f)) - i23) - iMo11c;
                }
            } else if (b != 2 && b != 3) {
                iMo3579U2 = (((iM7539i - i23) + iMo12d) - iMo11c) / 2;
            } else if (fe4Var.getLayoutDirection() == df2.f17011a) {
                iMo3579U2 = ((iM7539i - fe4Var.mo3579U(16.0f)) - i23) - iMo11c;
            } else {
                iMo3579U = fe4Var.mo3579U(16.0f);
                iMo3579U2 = iMo3579U + iMo12d;
            }
            vi3Var = new vi3();
            vi3Var.f32649b = iMo3579U2;
            vi3Var.f32650c = i27;
            VarHandle.storeStoreFence();
        }
        List listMo3576L4 = fe4Var.mo3576L(mq1Var3, pv3.f28034e);
        ArrayList arrayList5 = new ArrayList(listMo3576L4.size());
        int size4 = listMo3576L4.size();
        for (int i28 = 0; i28 < size4; i28++) {
            arrayList5.add(((sq2) listMo3576L4.get(i28)).mo5826e(jM7532b));
        }
        if (!arrayList5.isEmpty()) {
            obj6 = arrayList5.get(0);
            int i29 = ((db3) obj6).f16900b;
            int iM7689T6 = kx5.m7689T(arrayList5);
            if (1 <= iM7689T6) {
                int i30 = 1;
                while (true) {
                    Object obj15 = arrayList5.get(i30);
                    int i31 = ((db3) obj15).f16900b;
                    if (i29 < i31) {
                        i29 = i31;
                        obj6 = obj15;
                    }
                    if (i30 == iM7689T6) {
                        break;
                    }
                    i30++;
                }
            }
        } else {
            obj6 = null;
        }
        db3 db3Var4 = (db3) obj6;
        Integer numValueOf2 = db3Var4 != null ? Integer.valueOf(db3Var4.f16900b) : null;
        if (vi3Var != null) {
            int i32 = vi3Var.f32650c;
            if (numValueOf2 == null || b == 3) {
                int iMo3579U3 = fe4Var.mo3579U(16.0f) + i32;
                a05Var = a05Var3;
                iMo9a = iMo3579U3 + a05Var.mo9a(fe4Var);
            } else {
                iMo9a = fe4Var.mo3579U(16.0f) + numValueOf2.intValue() + i32;
                a05Var = a05Var3;
            }
            numValueOf = Integer.valueOf(iMo9a);
        } else {
            a05Var = a05Var3;
            numValueOf = null;
        }
        if (i != 0) {
            iIntValue = i + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : a05Var.mo9a(fe4Var));
        } else {
            iIntValue = 0;
        }
        o42 o42Var = new o42();
        o42Var.f26331b = a05Var;
        o42Var.f26332c = fe4Var;
        VarHandle.storeStoreFence();
        Integer num = numValueOf2;
        ov3Var.f27150b.setValue(new g73(AbstractC0647fd.m5681t(o42Var, fe4Var.getLayoutDirection()), arrayList.isEmpty() ? o42Var.mo3505d() : fe4Var.mo3586w0(i6), AbstractC0647fd.m5680s(o42Var, fe4Var.getLayoutDirection()), numValueOf2 != null ? fe4Var.mo3586w0(numValueOf2.intValue()) : o42Var.mo3504c()));
        pv3 pv3Var = pv3.f28031b;
        er1 er1Var = new er1((byte) 10);
        er1Var.f18412b = pg0Var3;
        er1Var.f18413c = ov3Var;
        VarHandle.storeStoreFence();
        List listMo3576L5 = fe4Var.mo3576L(new pg0(-278021671, true, er1Var), pv3Var);
        ArrayList arrayList6 = new ArrayList(listMo3576L5.size());
        int size5 = listMo3576L5.size();
        for (int i33 = 0; i33 < size5; i33++) {
            arrayList6.add(((sq2) listMo3576L5.get(i33)).mo5826e(jM7532b));
        }
        nv3 nv3Var = new nv3();
        nv3Var.f26112a = arrayList;
        nv3Var.f26113b = arrayList6;
        nv3Var.f26114c = arrayList3;
        nv3Var.f26115d = vi3Var;
        nv3Var.f26116e = arrayList5;
        nv3Var.f26117f = iM7539i;
        nv3Var.f26118g = i19;
        nv3Var.f26119h = a05Var;
        nv3Var.f26120i = fe4Var;
        nv3Var.f26121j = iM7538h;
        nv3Var.f26122k = iIntValue;
        nv3Var.f26123l = arrayList4;
        nv3Var.f26124m = numValueOf;
        nv3Var.f26125n = num;
        VarHandle.storeStoreFence();
        return fe4Var.mo3583l0(iM7539i, iM7538h, w71.f33134a, nv3Var);
    }
}
