package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15273a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15274b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15275c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f15276d;

    public /* synthetic */ bh4(byte b) {
        this.f15273a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v166, types: [yp1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
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
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        Integer numM4529e;
        Integer numM4528d;
        Integer numM4528d2;
        Integer numM4529e2;
        jl4 jl4Var;
        jl4 jl4Var2;
        kl4 kl4Var;
        kl4 kl4Var2;
        jl4 jl4Var3;
        jl4 jl4Var4;
        kl4 kl4Var3;
        kl4 kl4Var4;
        Integer numM4528d3;
        Integer numM4529e3;
        Integer numM4529e4;
        Integer numM4528d4;
        yg3 yg3Var;
        xk4 xk4Var;
        byte b = this.f15273a;
        byte b2 = 7;
        ju4 ju4Var = ju4.f22634a;
        ?? r6 = 0;
        xk4 xk4Var2 = null;
        r6 = 0;
        int i = 0;
        boolean z = false;
        byte b3 = 1;
        switch (b) {
            case 0:
                nh4 nh4Var = (nh4) this.f15274b;
                fh4 fh4Var = (fh4) this.f15275c;
                zg4 zg4Var = (zg4) this.f15276d;
                nh4Var.getLocationOnScreen(fh4Var.getThisLocation());
                long jMo4009k = ((cf2) obj).mo4009k(0L);
                zg4Var.f36069c.setValue(o52.m8954a((((long) qq2.m10010E(Float.intBitsToFloat((int) (jMo4009k & 4294967295L)) + fh4Var.getThisLocation()[1])) & 4294967295L) | (((long) qq2.m10010E(Float.intBitsToFloat((int) (jMo4009k >> 32)) + fh4Var.getThisLocation()[0])) << 32)));
                return ju4Var;
            case 1:
                ArrayList arrayList = (ArrayList) this.f15274b;
                ArrayList arrayList2 = (ArrayList) this.f15275c;
                ql3 ql3Var = (ql3) this.f15276d;
                cb3 cb3Var = (cb3) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    cb3.m3943m(cb3Var, (db3) obj2, o52.m8957d(((o52) arrayList2.get(i)).f26352a, ((s52) ql3Var.f28555a).m10525a()));
                    i = i3;
                }
                return ju4Var;
            case 2:
                nh3 nh3Var = (nh3) this.f15274b;
                zn0 zn0Var = (zn0) this.f15275c;
                el4 el4Var = (el4) ((ql3) this.f15276d).f28555a;
                xk4 xk4VarM8747e = nh3Var.m8747e((List) obj);
                if (el4Var != null) {
                    el4Var.m5192a(null, xk4VarM8747e);
                }
                zn0Var.invoke(xk4VarM8747e);
                return ju4Var;
            case 3:
                oc2 oc2Var = (oc2) this.f15274b;
                ak4 ak4Var = (ak4) this.f15275c;
                ml3 ml3Var = (ml3) this.f15276d;
                dk4 dk4Var = (dk4) obj;
                switch (oc2Var.ordinal()) {
                    case 0:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        if (ql4.m9900d(dk4Var.f17126f)) {
                            dk4Var.m4533i();
                            return ju4Var;
                        }
                        boolean zM4530f = dk4Var.m4530f();
                        long j = dk4Var.f17126f;
                        if (zM4530f) {
                            int iM9903g = ql4.m9903g(j);
                            dk4Var.m4541q(iM9903g, iM9903g);
                            return ju4Var;
                        }
                        int iM9902f = ql4.m9902f(j);
                        dk4Var.m4541q(iM9902f, iM9902f);
                        return ju4Var;
                    case 1:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        if (ql4.m9900d(dk4Var.f17126f)) {
                            dk4Var.m4537m();
                            return ju4Var;
                        }
                        boolean zM4530f2 = dk4Var.m4530f();
                        long j2 = dk4Var.f17126f;
                        if (zM4530f2) {
                            int iM9902f2 = ql4.m9902f(j2);
                            dk4Var.m4541q(iM9902f2, iM9902f2);
                            return ju4Var;
                        }
                        int iM9903g2 = ql4.m9903g(j2);
                        dk4Var.m4541q(iM9903g2, iM9903g2);
                        return ju4Var;
                    case 2:
                        pl4 pl4Var = dk4Var.f17125e;
                        pl4Var.f27737a = null;
                        C0875lk c0875lk = dk4Var.f17127g;
                        String str = c0875lk.f24092b;
                        String str2 = c0875lk.f24092b;
                        if (str.length() <= 0) {
                            return ju4Var;
                        }
                        if (dk4Var.m4530f()) {
                            pl4Var.f27737a = null;
                            if (str2.length() <= 0 || (numM4528d = dk4Var.m4528d()) == null) {
                                return ju4Var;
                            }
                            int iIntValue = numM4528d.intValue();
                            dk4Var.m4541q(iIntValue, iIntValue);
                            return ju4Var;
                        }
                        pl4Var.f27737a = null;
                        if (str2.length() <= 0 || (numM4529e = dk4Var.m4529e()) == null) {
                            return ju4Var;
                        }
                        int iIntValue2 = numM4529e.intValue();
                        dk4Var.m4541q(iIntValue2, iIntValue2);
                        return ju4Var;
                    case 3:
                        pl4 pl4Var2 = dk4Var.f17125e;
                        pl4Var2.f27737a = null;
                        C0875lk c0875lk2 = dk4Var.f17127g;
                        String str3 = c0875lk2.f24092b;
                        String str4 = c0875lk2.f24092b;
                        if (str3.length() <= 0) {
                            return ju4Var;
                        }
                        if (dk4Var.m4530f()) {
                            pl4Var2.f27737a = null;
                            if (str4.length() <= 0 || (numM4529e2 = dk4Var.m4529e()) == null) {
                                return ju4Var;
                            }
                            int iIntValue3 = numM4529e2.intValue();
                            dk4Var.m4541q(iIntValue3, iIntValue3);
                            return ju4Var;
                        }
                        pl4Var2.f27737a = null;
                        if (str4.length() <= 0 || (numM4528d2 = dk4Var.m4528d()) == null) {
                            return ju4Var;
                        }
                        int iIntValue4 = numM4528d2.intValue();
                        dk4Var.m4541q(iIntValue4, iIntValue4);
                        return ju4Var;
                    case 4:
                        dk4Var.m4534j();
                        return ju4Var;
                    case 5:
                        dk4Var.m4536l();
                        return ju4Var;
                    case 6:
                        dk4Var.m4539o();
                        return ju4Var;
                    case 7:
                        dk4Var.m4538n();
                        return ju4Var;
                    case 8:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        if (dk4Var.m4530f()) {
                            dk4Var.m4539o();
                            return ju4Var;
                        }
                        dk4Var.m4538n();
                        return ju4Var;
                    case 9:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        if (dk4Var.m4530f()) {
                            dk4Var.m4538n();
                            return ju4Var;
                        }
                        dk4Var.m4539o();
                        return ju4Var;
                    case 10:
                        if (dk4Var.f17127g.f24092b.length() <= 0 || (jl4Var = dk4Var.f17123c) == null) {
                            return ju4Var;
                        }
                        int iM4531g = dk4Var.m4531g(jl4Var, -1);
                        dk4Var.m4541q(iM4531g, iM4531g);
                        return ju4Var;
                    case 11:
                        if (dk4Var.f17127g.f24092b.length() <= 0 || (jl4Var2 = dk4Var.f17123c) == null) {
                            return ju4Var;
                        }
                        int iM4531g2 = dk4Var.m4531g(jl4Var2, 1);
                        dk4Var.m4541q(iM4531g2, iM4531g2);
                        return ju4Var;
                    case 12:
                    case 48:
                        return ju4Var;
                    case 13:
                        if (dk4Var.f17127g.f24092b.length() <= 0 || (kl4Var = dk4Var.f17129i) == null) {
                            return ju4Var;
                        }
                        int iM4532h = dk4Var.m4532h(kl4Var, -1);
                        dk4Var.m4541q(iM4532h, iM4532h);
                        return ju4Var;
                    case 14:
                        if (dk4Var.f17127g.f24092b.length() <= 0 || (kl4Var2 = dk4Var.f17129i) == null) {
                            return ju4Var;
                        }
                        int iM4532h2 = dk4Var.m4532h(kl4Var2, 1);
                        dk4Var.m4541q(iM4532h2, iM4532h2);
                        return ju4Var;
                    case 15:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        dk4Var.m4541q(0, 0);
                        return ju4Var;
                    case 16:
                        dk4Var.f17125e.f27737a = null;
                        C0875lk c0875lk3 = dk4Var.f17127g;
                        if (c0875lk3.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        int length = c0875lk3.f24092b.length();
                        dk4Var.m4541q(length, length);
                        return ju4Var;
                    case 17:
                        ak4Var.f14589b.m9540a(false);
                        return ju4Var;
                    case 18:
                        ak4Var.f14589b.m9553o();
                        return ju4Var;
                    case 19:
                        ak4Var.f14589b.m9541c();
                        return ju4Var;
                    case 20:
                        List listM4525a = dk4Var.m4525a(new r54((byte) 16));
                        if (listM4525a == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a);
                        return ju4Var;
                    case 21:
                        List listM4525a2 = dk4Var.m4525a(new r54((byte) 17));
                        if (listM4525a2 == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a2);
                        return ju4Var;
                    case 22:
                        List listM4525a3 = dk4Var.m4525a(new r54((byte) 18));
                        if (listM4525a3 == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a3);
                        return ju4Var;
                    case 23:
                        List listM4525a4 = dk4Var.m4525a(new r54((byte) 19));
                        if (listM4525a4 == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a4);
                        return ju4Var;
                    case 24:
                        List listM4525a5 = dk4Var.m4525a(new r54((byte) 20));
                        if (listM4525a5 == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a5);
                        return ju4Var;
                    case 25:
                        List listM4525a6 = dk4Var.m4525a(new r54((byte) 21));
                        if (listM4525a6 == null) {
                            return ju4Var;
                        }
                        ak4Var.m3041a(listM4525a6);
                        return ju4Var;
                    case 26:
                        dk4Var.f17125e.f27737a = null;
                        C0875lk c0875lk4 = dk4Var.f17127g;
                        if (c0875lk4.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        dk4Var.m4541q(0, c0875lk4.f24092b.length());
                        return ju4Var;
                    case 27:
                        dk4Var.m4533i();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 28:
                        dk4Var.m4537m();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 29:
                        if (dk4Var.f17127g.f24092b.length() > 0 && (jl4Var3 = dk4Var.f17123c) != null) {
                            int iM4531g3 = dk4Var.m4531g(jl4Var3, -1);
                            dk4Var.m4541q(iM4531g3, iM4531g3);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 30:
                        if (dk4Var.f17127g.f24092b.length() > 0 && (jl4Var4 = dk4Var.f17123c) != null) {
                            int iM4531g4 = dk4Var.m4531g(jl4Var4, 1);
                            dk4Var.m4541q(iM4531g4, iM4531g4);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 31:
                        if (dk4Var.f17127g.f24092b.length() > 0 && (kl4Var3 = dk4Var.f17129i) != null) {
                            int iM4532h3 = dk4Var.m4532h(kl4Var3, -1);
                            dk4Var.m4541q(iM4532h3, iM4532h3);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 32:
                        if (dk4Var.f17127g.f24092b.length() > 0 && (kl4Var4 = dk4Var.f17129i) != null) {
                            int iM4532h4 = dk4Var.m4532h(kl4Var4, 1);
                            dk4Var.m4541q(iM4532h4, iM4532h4);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 33:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() > 0) {
                            dk4Var.m4541q(0, 0);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 34:
                        dk4Var.f17125e.f27737a = null;
                        C0875lk c0875lk5 = dk4Var.f17127g;
                        if (c0875lk5.f24092b.length() > 0) {
                            int length2 = c0875lk5.f24092b.length();
                            dk4Var.m4541q(length2, length2);
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 35:
                        pl4 pl4Var3 = dk4Var.f17125e;
                        pl4Var3.f27737a = null;
                        C0875lk c0875lk6 = dk4Var.f17127g;
                        String str5 = c0875lk6.f24092b;
                        String str6 = c0875lk6.f24092b;
                        if (str5.length() > 0) {
                            if (dk4Var.m4530f()) {
                                pl4Var3.f27737a = null;
                                if (str6.length() > 0 && (numM4529e3 = dk4Var.m4529e()) != null) {
                                    int iIntValue5 = numM4529e3.intValue();
                                    dk4Var.m4541q(iIntValue5, iIntValue5);
                                }
                            } else {
                                pl4Var3.f27737a = null;
                                if (str6.length() > 0 && (numM4528d3 = dk4Var.m4528d()) != null) {
                                    int iIntValue6 = numM4528d3.intValue();
                                    dk4Var.m4541q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 36:
                        pl4 pl4Var4 = dk4Var.f17125e;
                        pl4Var4.f27737a = null;
                        C0875lk c0875lk7 = dk4Var.f17127g;
                        String str7 = c0875lk7.f24092b;
                        String str8 = c0875lk7.f24092b;
                        if (str7.length() > 0) {
                            if (dk4Var.m4530f()) {
                                pl4Var4.f27737a = null;
                                if (str8.length() > 0 && (numM4528d4 = dk4Var.m4528d()) != null) {
                                    int iIntValue7 = numM4528d4.intValue();
                                    dk4Var.m4541q(iIntValue7, iIntValue7);
                                }
                            } else {
                                pl4Var4.f27737a = null;
                                if (str8.length() > 0 && (numM4529e4 = dk4Var.m4529e()) != null) {
                                    int iIntValue8 = numM4529e4.intValue();
                                    dk4Var.m4541q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 37:
                        dk4Var.m4534j();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 38:
                        dk4Var.m4536l();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 39:
                        dk4Var.m4539o();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 40:
                        dk4Var.m4538n();
                        dk4Var.m4540p();
                        return ju4Var;
                    case 41:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() > 0) {
                            if (dk4Var.m4530f()) {
                                dk4Var.m4539o();
                            } else {
                                dk4Var.m4538n();
                            }
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 42:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() > 0) {
                            if (dk4Var.m4530f()) {
                                dk4Var.m4538n();
                            } else {
                                dk4Var.m4539o();
                            }
                        }
                        dk4Var.m4540p();
                        return ju4Var;
                    case 43:
                        dk4Var.f17125e.f27737a = null;
                        if (dk4Var.f17127g.f24092b.length() <= 0) {
                            return ju4Var;
                        }
                        long j3 = dk4Var.f17126f;
                        int i4 = ql4.f28557c;
                        int i5 = (int) (j3 & 4294967295L);
                        dk4Var.m4541q(i5, i5);
                        return ju4Var;
                    case 44:
                        if (ak4Var.f14592e) {
                            ml3Var.f25002a = ((Boolean) ak4Var.f14588a.f31935x.invoke(k12.m7357a(ak4Var.f14599l))).booleanValue();
                            return ju4Var;
                        }
                        ak4Var.m3041a(Collections.singletonList(new xd0("\n", 1)));
                        return ju4Var;
                    case 45:
                        if (ak4Var.f14592e) {
                            ml3Var.f25002a = false;
                            return ju4Var;
                        }
                        ak4Var.m3041a(Collections.singletonList(new xd0("\t", 1)));
                        return ju4Var;
                    case 46:
                        ak4Var.f14595h.m3314a(xk4.m12702a(dk4Var.f17128h, dk4Var.f17127g, dk4Var.f17126f, 4));
                        au4 au4Var = ak4Var.f14595h;
                        yg3 yg3Var2 = au4Var.f14881a;
                        if (yg3Var2 != null && (yg3Var = (yg3) yg3Var2.f35215b) != null) {
                            au4Var.f14881a = yg3Var;
                            au4Var.f14883c -= ((xk4) yg3Var2.f35216c).f34341a.f24092b.length();
                            au4Var.f14882b = new yg3(au4Var.f14882b, (xk4) yg3Var2.f35216c, b2);
                            xk4Var = (xk4) yg3Var.f35216c;
                        }
                        if (r6 == 0) {
                            r6 = xk4Var;
                            return ju4Var;
                        }
                        r6 = xk4Var;
                        ak4Var.f14598k.invoke(r6);
                        return ju4Var;
                    case 47:
                        au4 au4Var2 = ak4Var.f14595h;
                        yg3 yg3Var3 = au4Var2.f14882b;
                        if (yg3Var3 != null) {
                            au4Var2.f14882b = (yg3) yg3Var3.f35215b;
                            xk4 xk4Var3 = (xk4) yg3Var3.f35216c;
                            au4Var2.f14881a = new yg3(au4Var2.f14881a, xk4Var3, b2);
                            au4Var2.f14883c = xk4Var3.f34341a.f24092b.length() + au4Var2.f14883c;
                            xk4Var2 = (xk4) yg3Var3.f35216c;
                        }
                        if (xk4Var2 == null) {
                            return ju4Var;
                        }
                        ak4Var.f14598k.invoke(xk4Var2);
                        return ju4Var;
                    default:
                        C0670g.m5864c();
                        return null;
                }
            case 4:
                pk4 pk4Var = (pk4) this.f15274b;
                zo0 zo0Var = (zo0) this.f15275c;
                Context context = (Context) this.f15276d;
                bj4 bj4Var = (bj4) obj;
                cw2 cw2Var = bj4Var.f15334a;
                oj4 oj4Var = oj4.f26787b;
                cw2Var.m4200a(oj4Var);
                ks5.m7609j(bj4Var, zo0Var, context, lj4.Cut, (ql4.m9900d(pk4Var.m9550l().f34342b) || !pk4Var.m9546h() || pk4Var.f27699g == null) ? false : true, new jk4(pk4Var, r6, b3));
                byte b4 = 2;
                ks5.m7609j(bj4Var, zo0Var, context, lj4.Copy, (ql4.m9900d(pk4Var.m9550l().f34342b) || pk4Var.f27699g == null) ? false : true, new jk4(pk4Var, r6, b4));
                ks5.m7609j(bj4Var, zo0Var, context, lj4.Paste, pk4Var.m9546h() && ((Boolean) pk4Var.f27715w.getValue()).booleanValue() && pk4Var.f27699g != null, new jk4(pk4Var, r6, (byte) 3));
                lj4 lj4Var = lj4.SelectAll;
                boolean z2 = ql4.m9901e(pk4Var.m9550l().f34342b) != pk4Var.m9550l().f34341a.f24092b.length();
                tk4 tk4Var = new tk4(z ? 1 : 0);
                tk4Var.f31215b = pk4Var;
                VarHandle.storeStoreFence();
                tk4 tk4Var2 = new tk4(b3);
                tk4Var2.f31215b = pk4Var;
                VarHandle.storeStoreFence();
                ks5.m7608i(bj4Var, context, lj4Var, z2, tk4Var, tk4Var2);
                lj4 lj4Var2 = lj4.Autofill;
                boolean z3 = pk4Var.m9546h() && ql4.m9900d(pk4Var.m9550l().f34342b);
                tk4 tk4Var3 = new tk4(b4);
                tk4Var3.f31215b = pk4Var;
                VarHandle.storeStoreFence();
                ks5.m7608i(bj4Var, context, lj4Var2, z3, null, tk4Var3);
                bj4Var.f15334a.m4200a(oj4Var);
                return ju4Var;
            default:
                pn0 pn0Var = (pn0) this.f15274b;
                yp1 yp1Var = (yp1) this.f15275c;
                wp1 wp1Var = (wp1) this.f15276d;
                at1 at1Var = new at1(b2);
                at1Var.f14855b = pn0Var;
                at1Var.f14856c = yp1Var;
                at1Var.f14857d = wp1Var;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(767930190, true, at1Var));
                return ju4Var;
        }
    }
}
