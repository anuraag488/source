package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv3 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20147a;

    public /* synthetic */ gv3(byte b) {
        this.f20147a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        xn2 xn2Var;
        byte b = this.f20147a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((nx4) obj2).f26180a;
            case 1:
                fu3 fu3Var = (fu3) obj;
                r73 r73Var = (r73) obj2;
                int i = r73Var.f29064a;
                wi4 wi4Var = new wi4();
                wi4Var.f33412a = i;
                VarHandle.storeStoreFence();
                Object objM7297b = jv3.m7297b(wi4Var, jv3.f22686s, fu3Var);
                int i2 = r73Var.f29065b;
                xj4 xj4Var = new xj4();
                xj4Var.f34323a = i2;
                VarHandle.storeStoreFence();
                Object objM7297b2 = jv3.m7297b(xj4Var, jv3.f22687t, fu3Var);
                Object objM7297b3 = jv3.m7297b(bm4.m3631a(r73Var.f29066c), jv3.f22691x, fu3Var);
                al4 al4Var = r73Var.f29067d;
                al4 al4Var2 = al4.f14615c;
                Object objM7297b4 = jv3.m7297b(al4Var, jv3.f22680m, fu3Var);
                Object objM7297b5 = jv3.m7297b(r73Var.f29068e, kv3.f23539a, fu3Var);
                dl2 dl2Var = r73Var.f29069f;
                dl2 dl2Var2 = dl2.f17143d;
                Object objM7297b6 = jv3.m7297b(dl2Var, jv3.f22664C, fu3Var);
                int i3 = r73Var.f29070g;
                yk2 yk2Var = new yk2();
                yk2Var.f35296a = i3;
                VarHandle.storeStoreFence();
                Object objM7297b7 = jv3.m7297b(yk2Var, kv3.f23541c, fu3Var);
                int i4 = r73Var.f29071h;
                fz1 fz1Var = new fz1();
                fz1Var.f19429a = i4;
                VarHandle.storeStoreFence();
                return kx5.m7730r(objM7297b, objM7297b2, objM7297b3, objM7297b4, objM7297b5, objM7297b6, objM7297b7, jv3.m7297b(fz1Var, jv3.f22688u, fu3Var), jv3.m7297b(r73Var.f29072i, kv3.f23542d, fu3Var));
            case 2:
                return ((nv4) obj2).f26126a;
            case 3:
                fu3 fu3Var2 = (fu3) obj;
                pa4 pa4Var = (pa4) obj2;
                pb0 pb0VarM9462a = pb0.m9462a(pa4Var.f27478a.mo5689a());
                iv3 iv3Var = jv3.f22685r;
                Object objM7297b8 = jv3.m7297b(pb0VarM9462a, iv3Var, fu3Var2);
                bm4 bm4VarM3631a = bm4.m3631a(pa4Var.f27479b);
                iv3 iv3Var2 = jv3.f22691x;
                Object objM7297b9 = jv3.m7297b(bm4VarM3631a, iv3Var2, fu3Var2);
                xm1 xm1Var = pa4Var.f27480c;
                xm1 xm1Var2 = xm1.f34409b;
                Object objM7297b10 = jv3.m7297b(xm1Var, jv3.f22681n, fu3Var2);
                Object objM7297b11 = jv3.m7297b(pa4Var.f27481d, jv3.f22689v, fu3Var2);
                Object objM7297b12 = jv3.m7297b(pa4Var.f27482e, jv3.f22690w, fu3Var2);
                String str = pa4Var.f27484g;
                Object objM7297b13 = jv3.m7297b(bm4.m3631a(pa4Var.f27485h), iv3Var2, fu3Var2);
                Object objM7297b14 = jv3.m7297b(pa4Var.f27486i, jv3.f22682o, fu3Var2);
                Object objM7297b15 = jv3.m7297b(pa4Var.f27487j, jv3.f22679l, fu3Var2);
                zm2 zm2Var = pa4Var.f27488k;
                zm2 zm2Var2 = zm2.f36182c;
                Object objM7297b16 = jv3.m7297b(zm2Var, jv3.f22662A, fu3Var2);
                Object objM7297b17 = jv3.m7297b(pb0.m9462a(pa4Var.f27489l), iv3Var, fu3Var2);
                Object objM7297b18 = jv3.m7297b(pa4Var.f27490m, jv3.f22678k, fu3Var2);
                m44 m44Var = pa4Var.f27491n;
                m44 m44Var2 = m44.f24642d;
                return kx5.m7730r(objM7297b8, objM7297b9, objM7297b10, objM7297b11, objM7297b12, -1, str, objM7297b13, objM7297b14, objM7297b15, objM7297b16, objM7297b17, objM7297b18, jv3.m7297b(m44Var, jv3.f22684q, fu3Var2));
            case 4:
                fu3 fu3Var3 = (fu3) obj;
                ml4 ml4Var = (ml4) obj2;
                pa4 pa4Var2 = ml4Var.f25003a;
                yg3 yg3Var = jv3.f22676i;
                return kx5.m7730r(jv3.m7297b(pa4Var2, yg3Var, fu3Var3), jv3.m7297b(ml4Var.f25004b, yg3Var, fu3Var3), jv3.m7297b(ml4Var.f25005c, yg3Var, fu3Var3), jv3.m7297b(ml4Var.f25006d, yg3Var, fu3Var3));
            case 5:
                mb3 mb3Var = (mb3) obj2;
                Boolean boolValueOf = Boolean.valueOf(mb3Var.f24799a);
                yg3 yg3Var2 = jv3.f22668a;
                int i5 = mb3Var.f24800b;
                m71 m71Var = new m71();
                m71Var.f24704a = i5;
                VarHandle.storeStoreFence();
                return kx5.m7730r(boolValueOf, jv3.m7297b(m71Var, kv3.f23540b, (fu3) obj));
            case 6:
                return Integer.valueOf(((m71) obj2).f24704a);
            case 7:
                return Integer.valueOf(((yk2) obj2).f35296a);
            case 8:
                ol4 ol4Var = (ol4) obj2;
                int i6 = ol4Var.f26854a;
                nl4 nl4Var = new nl4();
                nl4Var.f25934a = i6;
                VarHandle.storeStoreFence();
                return kx5.m7730r(jv3.m7297b(nl4Var, kv3.f23543e, (fu3) obj), Boolean.valueOf(ol4Var.f26855b));
            case 9:
                return Integer.valueOf(((nl4) obj2).f25934a);
            case 10:
                ((Integer) obj2).getClass();
                y42.m12822D(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 11:
                ((Integer) obj2).getClass();
                y42.m12834J(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 12:
                ((Integer) obj2).getClass();
                y42.m12828G(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 13:
                ((Integer) obj2).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(-1701082182);
                C1354y3 c1354y3 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
                C0459am c0459am = (C0459am) ir1Var.m6898k(AbstractC0496bm.m3626a());
                xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
                i50 i50Var = ki0.f23136a;
                if (xn2Var2 == null) {
                    ir1Var.m6885d0(-1476823888);
                    ir1Var.m6912r(false);
                    xn2Var = null;
                } else {
                    ir1Var.m6885d0(-1476823887);
                    boolean zM6890g = ir1Var.m6890g("ScrollToTop") | ir1Var.m6890g(xn2Var2);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        objM6869O = xn2Var2.m12723c("ScrollToTop");
                        ir1Var.m6905n0(objM6869O);
                    }
                    ir1Var.m6912r(false);
                    xn2Var = (xn2) objM6869O;
                }
                Object objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = k43.m7398w(null);
                    ir1Var.m6905n0(objM6869O2);
                }
                sw2 sw2Var = (sw2) objM6869O2;
                Object objM6869O3 = ir1Var.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = lb5.m7942w(r71.f29063a, ir1Var);
                    ir1Var.m6905n0(objM6869O3);
                }
                zo0 zo0Var = (zo0) objM6869O3;
                gr1 gr1VarM4685N = dt0.m4685N(ir1Var);
                z93 z93VarM10793B = sj3.m10793B(ir1Var, 0, 1);
                le0 le0Var = new le0((byte) 3);
                le0Var.f23974b = sw2Var;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R = vd6.m11834R(-1736068073, le0Var, ir1Var);
                boolean zM6890g2 = ir1Var.m6890g(z93VarM10793B) | ir1Var.m6890g(zo0Var) | ir1Var.m6890g(c1354y3) | ir1Var.m6894i(gr1VarM4685N) | ir1Var.m6894i(xn2Var) | ir1Var.m6890g(c0459am);
                Object objM6869O4 = ir1Var.m6869O();
                if (zM6890g2 || objM6869O4 == i50Var) {
                    lx3 lx3Var = new lx3(z93VarM10793B, zo0Var, sw2Var, c1354y3, gr1VarM4685N, xn2Var, c0459am, null);
                    ir1Var.m6905n0(lx3Var);
                    objM6869O4 = lx3Var;
                }
                gn0 gn0VarM8039a = ln0.m8039a("Scroll to top", null, pg0VarM11834R, null, null, (yp1) objM6869O4, 90);
                ir1Var.m6912r(false);
                return gn0VarM8039a;
            case 14:
                return Integer.valueOf(((wx3) obj2).f33828a.m132h());
            case 15:
                pg0 pg0Var = y70.f34985p;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    pg0Var.invoke(ir1Var2, 0);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 16:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = v71.f32439a;
                }
                return hb0.m6310V0(collection, list);
            case 17:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 18:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 20:
                return (lq3) obj;
            case 21:
                return (String) obj;
            case 22:
                return (ju4) obj;
            case 23:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 24:
                return (p44) obj;
            case 25:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 26:
                return (mm0) obj;
            case 27:
                return (bm0) obj;
            case 28:
                return (C1401zd) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
        }
    }
}
