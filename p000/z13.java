package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z13 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35701a;

    public /* synthetic */ z13(byte b) {
        this.f35701a = b;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x03f3 A[LOOP:2: B:115:0x03ac->B:128:0x03f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x03f6 A[SYNTHETIC] */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        EnumC0949nk enumC0949nk;
        Object objM7297b;
        switch (this.f35701a) {
            case 0:
                ((Integer) obj2).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(-309796677);
                C0950nl c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
                boolean zM6894i = ir1Var.m6894i(c0950nl);
                Object objM6869O = ir1Var.m6869O();
                if (zM6894i || objM6869O == ki0.f23136a) {
                    obj3 = objM6869O;
                    C0854l c0854l = new C0854l((byte) 3);
                    c0854l.f23655b = c0950nl;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0854l);
                    obj3 = c0854l;
                }
                obj3 = objM6869O;
                mq1 mq1VarM7368B = k43.m7368B(true, (wp1) obj3, ir1Var);
                ir1Var.m6912r(false);
                return mq1VarM7368B;
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 2:
                iu3 iu3Var = (iu3) obj2;
                Map map = iu3Var.f21805a;
                lw2 lw2Var = iu3Var.f21806b;
                Object[] objArr = lw2Var.f24419b;
                Object[] objArr2 = lw2Var.f24420c;
                long[] jArr = lw2Var.f24418a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj4 = objArr[i4];
                                    Map mapMo8111c = ((lu3) objArr2[i4]).mo8111c();
                                    if (mapMo8111c.isEmpty()) {
                                        map.remove(obj4);
                                    } else {
                                        map.put(obj4, mapMo8111c);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 3:
                return obj2;
            case 4:
                C0875lk c0875lk = (C0875lk) obj2;
                return kx5.m7730r(c0875lk.f24092b, jv3.m7297b(c0875lk.f24091a, jv3.f22669b, (fu3) obj));
            case 5:
                return Integer.valueOf(((uj4) obj2).f31941a);
            case 6:
                zk4 zk4Var = (zk4) obj2;
                return kx5.m7730r(Float.valueOf(zk4Var.f36161a), Float.valueOf(zk4Var.f36162b));
            case 7:
                fu3 fu3Var = (fu3) obj;
                al4 al4Var = (al4) obj2;
                bm4 bm4VarM3631a = bm4.m3631a(al4Var.f14616a);
                iv3 iv3Var = jv3.f22691x;
                return kx5.m7730r(jv3.m7297b(bm4VarM3631a, iv3Var, fu3Var), jv3.m7297b(bm4.m3631a(al4Var.f14617b), iv3Var, fu3Var));
            case 8:
                return Integer.valueOf(((xm1) obj2).f34418a);
            case 9:
                il2 il2Var = (il2) obj2;
                return kx5.m7730r(il2Var.f21529a, jv3.m7297b(il2Var.f21530b, jv3.f22677j, (fu3) obj));
            case 10:
                return Float.valueOf(((C0471ay) obj2).f14938a);
            case 11:
                fu3 fu3Var2 = (fu3) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(jv3.m7297b((C0838kk) list.get(i5), jv3.f22670c, fu3Var2));
                }
                return arrayList;
            case 12:
                ql4 ql4Var = (ql4) obj2;
                return kx5.m7730r(Integer.valueOf((int) (ql4Var.f28558a >> 32)), Integer.valueOf((int) (ql4Var.f28558a & 4294967295L)));
            case 13:
                fu3 fu3Var3 = (fu3) obj;
                m44 m44Var = (m44) obj2;
                return kx5.m7730r(jv3.m7297b(pb0.m9462a(m44Var.f24643a), jv3.f22685r, fu3Var3), jv3.m7297b(b33.m3423a(m44Var.f24644b), jv3.f22693z, fu3Var3), Float.valueOf(m44Var.f24645c));
            case 14:
                return Integer.valueOf(((wi4) obj2).f33412a);
            case 15:
                return Integer.valueOf(((xj4) obj2).f34323a);
            case 16:
                return Integer.valueOf(((fz1) obj2).f19429a);
            case 17:
                return Integer.valueOf(((tm1) obj2).f31237a);
            case 18:
                return Integer.valueOf(((um1) obj2).f31990a);
            case 19:
                bm4 bm4Var = (bm4) obj2;
                return bm4Var != null ? bm4.m3632b(bm4Var.f15420a, bm4.f15419c) : false ? Boolean.FALSE : kx5.m7730r(Float.valueOf(bm4.m3634d(bm4Var.f15420a)), jv3.m7297b(cm4.m4047a(bm4.m3633c(bm4Var.f15420a)), jv3.f22692y, (fu3) obj));
            case 20:
                hl2 hl2Var = (hl2) obj2;
                return kx5.m7730r(hl2Var.f20671a, jv3.m7297b(hl2Var.f20672b, jv3.f22677j, (fu3) obj));
            case 21:
                long j2 = ((cm4) obj2).f16128a;
                if (cm4.m4048b(j2, 8589934592L)) {
                    return 0;
                }
                if (cm4.m4048b(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 22:
                b33 b33Var = (b33) obj2;
                return b33Var != null ? b33.m3425c(b33Var.f15059a, 9205357640488583168L) : false ? Boolean.FALSE : kx5.m7730r(Float.valueOf(Float.intBitsToFloat((int) (b33Var.f15059a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (b33Var.f15059a & 4294967295L))));
            case 23:
                fu3 fu3Var4 = (fu3) obj;
                C0838kk c0838kk = (C0838kk) obj2;
                Object obj5 = c0838kk.f23186a;
                if (obj5 instanceof r73) {
                    enumC0949nk = EnumC0949nk.f25892a;
                } else if (obj5 instanceof pa4) {
                    enumC0949nk = EnumC0949nk.f25893b;
                } else if (obj5 instanceof nx4) {
                    enumC0949nk = EnumC0949nk.f25894c;
                } else if (obj5 instanceof nv4) {
                    enumC0949nk = EnumC0949nk.f25895d;
                } else if (obj5 instanceof il2) {
                    enumC0949nk = EnumC0949nk.f25896e;
                } else if (obj5 instanceof hl2) {
                    enumC0949nk = EnumC0949nk.f25897f;
                } else {
                    if (!(obj5 instanceof cd4)) {
                        xy4.m12791t();
                        return null;
                    }
                    enumC0949nk = EnumC0949nk.f25898g;
                }
                switch (enumC0949nk.ordinal()) {
                    case 0:
                        objM7297b = jv3.m7297b((r73) obj5, jv3.f22675h, fu3Var4);
                        break;
                    case 1:
                        objM7297b = jv3.m7297b((pa4) obj5, jv3.f22676i, fu3Var4);
                        break;
                    case 2:
                        objM7297b = jv3.m7297b((nx4) obj5, jv3.f22671d, fu3Var4);
                        break;
                    case 3:
                        objM7297b = jv3.m7297b((nv4) obj5, jv3.f22672e, fu3Var4);
                        break;
                    case 4:
                        objM7297b = jv3.m7297b((il2) obj5, jv3.f22673f, fu3Var4);
                        break;
                    case 5:
                        objM7297b = jv3.m7297b((hl2) obj5, jv3.f22674g, fu3Var4);
                        break;
                    case 6:
                        objM7297b = ((cd4) obj5).f15961a;
                        break;
                    default:
                        C0670g.m5864c();
                        return null;
                }
                return kx5.m7730r(enumC0949nk, objM7297b, Integer.valueOf(c0838kk.f23187b), Integer.valueOf(c0838kk.f23188c), c0838kk.f23189d);
            case 24:
                fu3 fu3Var5 = (fu3) obj;
                List list2 = ((zm2) obj2).f36183a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(jv3.m7297b((ym2) list2.get(i6), jv3.f22663B, fu3Var5));
                }
                return arrayList2;
            case 25:
                return ((ym2) obj2).f35328a.toLanguageTag();
            case 26:
                fu3 fu3Var6 = (fu3) obj;
                dl2 dl2Var = (dl2) obj2;
                float f = dl2Var.f17144a;
                al2 al2Var = new al2();
                al2Var.f14612a = f;
                VarHandle.storeStoreFence();
                Object objM7297b2 = jv3.m7297b(al2Var, jv3.f22665D, fu3Var6);
                int i7 = dl2Var.f17145b;
                cl2 cl2Var = new cl2();
                cl2Var.f16098a = i7;
                VarHandle.storeStoreFence();
                Object objM7297b3 = jv3.m7297b(cl2Var, jv3.f22666E, fu3Var6);
                int i8 = dl2Var.f17146c;
                bl2 bl2Var = new bl2();
                bl2Var.f15402a = i8;
                VarHandle.storeStoreFence();
                return kx5.m7730r(objM7297b2, objM7297b3, jv3.m7297b(bl2Var, jv3.f22667F, fu3Var6));
            case 27:
                return Float.valueOf(((al2) obj2).f14612a);
            case 28:
                return Integer.valueOf(((cl2) obj2).f16098a);
            default:
                return Integer.valueOf(((bl2) obj2).f15402a);
        }
    }
}
