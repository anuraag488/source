package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fv3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19339a;

    public /* synthetic */ fv3(byte b) {
        this.f19339a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        C0838kk c0838kk;
        byte b = this.f19339a;
        ju4 ju4Var = ju4.f22634a;
        m71Var = null;
        m71 m71Var = null;
        m44Var = null;
        m44 m44Var = null;
        ol4Var = null;
        ol4 ol4Var = null;
        hl2Var = null;
        hl2 hl2Var = null;
        il2Var = null;
        il2 il2Var = null;
        nv4Var = null;
        nv4 nv4Var = null;
        nx4Var = null;
        nx4 nx4Var = null;
        pa4Var = null;
        pa4 pa4Var = null;
        r73Var = null;
        r73 r73Var = null;
        bl2Var = null;
        bl2 bl2Var = null;
        ml4Var = null;
        ml4 ml4Var = null;
        switch (b) {
            case 0:
                if (z62.m13387o(obj, Boolean.FALSE)) {
                    return b33.m3423a(9205357640488583168L);
                }
                List list = (List) obj;
                Object obj2 = list.get(0);
                float fFloatValue = (obj2 != null ? (Float) obj2 : null).floatValue();
                Object obj3 = list.get(1);
                return b33.m3423a((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits((obj3 != null ? (Float) obj3 : null).floatValue())) & 4294967295L));
            case 1:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    Object obj4 = list2.get(i);
                    arrayList.add((z62.m13387o(obj4, Boolean.FALSE) || obj4 == null) ? null : (ym2) ((yp1) jv3.f22663B.f35216c).invoke(obj4));
                }
                return new zm2(arrayList);
            case 2:
                String str = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (z62.m13387o(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new ym2(localeForLanguageTag);
            case 3:
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                String str2 = obj5 != null ? (String) obj5 : null;
                Object obj6 = list3.get(1);
                yg3 yg3Var = jv3.f22677j;
                if (!z62.m13387o(obj6, Boolean.FALSE) && obj6 != null) {
                    ml4Var = (ml4) ((yp1) yg3Var.f35216c).invoke(obj6);
                }
                ml4 ml4Var2 = ml4Var;
                hl2 hl2Var2 = new hl2();
                hl2Var2.f20671a = str2;
                hl2Var2.f20672b = ml4Var2;
                VarHandle.storeStoreFence();
                return hl2Var2;
            case 4:
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f = al2.f14609b;
                iv3 iv3Var = jv3.f22665D;
                Boolean bool = Boolean.FALSE;
                float f2 = (((z62.m13387o(obj7, bool) && iv3Var == null) || obj7 == null) ? null : (al2) iv3Var.f21823b.invoke(obj7)).f14612a;
                Object obj8 = list4.get(1);
                iv3 iv3Var2 = jv3.f22666E;
                int i2 = (((z62.m13387o(obj8, bool) && iv3Var2 == null) || obj8 == null) ? null : (cl2) iv3Var2.f21823b.invoke(obj8)).f16098a;
                Object obj9 = list4.get(2);
                iv3 iv3Var3 = jv3.f22667F;
                if ((!z62.m13387o(obj9, bool) || iv3Var3 != null) && obj9 != null) {
                    bl2Var = (bl2) iv3Var3.f21823b.invoke(obj9);
                }
                return new dl2(f2, i2, bl2Var.f15402a);
            case 5:
                float fFloatValue2 = ((Float) obj).floatValue();
                al2.m3043a(fFloatValue2);
                al2 al2Var = new al2();
                al2Var.f14612a = fFloatValue2;
                VarHandle.storeStoreFence();
                return al2Var;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                cl2 cl2Var = new cl2();
                cl2Var.f16098a = iIntValue;
                VarHandle.storeStoreFence();
                return cl2Var;
            case 7:
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                EnumC0949nk enumC0949nk = obj10 != null ? (EnumC0949nk) obj10 : null;
                Object obj11 = list5.get(2);
                int iIntValue2 = (obj11 != null ? (Integer) obj11 : null).intValue();
                Object obj12 = list5.get(3);
                int iIntValue3 = (obj12 != null ? (Integer) obj12 : null).intValue();
                Object obj13 = list5.get(4);
                String str3 = obj13 != null ? (String) obj13 : null;
                switch (enumC0949nk.ordinal()) {
                    case 0:
                        Object obj14 = list5.get(1);
                        yg3 yg3Var2 = jv3.f22675h;
                        if (!z62.m13387o(obj14, Boolean.FALSE) && obj14 != null) {
                            r73Var = (r73) ((yp1) yg3Var2.f35216c).invoke(obj14);
                        }
                        c0838kk = new C0838kk(r73Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 1:
                        Object obj15 = list5.get(1);
                        yg3 yg3Var3 = jv3.f22676i;
                        if (!z62.m13387o(obj15, Boolean.FALSE) && obj15 != null) {
                            pa4Var = (pa4) ((yp1) yg3Var3.f35216c).invoke(obj15);
                        }
                        c0838kk = new C0838kk(pa4Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 2:
                        Object obj16 = list5.get(1);
                        yg3 yg3Var4 = jv3.f22671d;
                        if (!z62.m13387o(obj16, Boolean.FALSE) && obj16 != null) {
                            nx4Var = (nx4) ((yp1) yg3Var4.f35216c).invoke(obj16);
                        }
                        c0838kk = new C0838kk(nx4Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 3:
                        Object obj17 = list5.get(1);
                        yg3 yg3Var5 = jv3.f22672e;
                        if (!z62.m13387o(obj17, Boolean.FALSE) && obj17 != null) {
                            nv4Var = (nv4) ((yp1) yg3Var5.f35216c).invoke(obj17);
                        }
                        c0838kk = new C0838kk(nv4Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 4:
                        Object obj18 = list5.get(1);
                        yg3 yg3Var6 = jv3.f22673f;
                        if (!z62.m13387o(obj18, Boolean.FALSE) && obj18 != null) {
                            il2Var = (il2) ((yp1) yg3Var6.f35216c).invoke(obj18);
                        }
                        c0838kk = new C0838kk(il2Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 5:
                        Object obj19 = list5.get(1);
                        yg3 yg3Var7 = jv3.f22674g;
                        if (!z62.m13387o(obj19, Boolean.FALSE) && obj19 != null) {
                            hl2Var = (hl2) ((yp1) yg3Var7.f35216c).invoke(obj19);
                        }
                        c0838kk = new C0838kk(hl2Var, iIntValue2, iIntValue3, str3);
                        break;
                    case 6:
                        Object obj20 = list5.get(1);
                        String str4 = obj20 != null ? (String) obj20 : null;
                        cd4 cd4Var = new cd4();
                        cd4Var.f15961a = str4;
                        VarHandle.storeStoreFence();
                        c0838kk = new C0838kk(cd4Var, iIntValue2, iIntValue3, str3);
                        break;
                    default:
                        C0670g.m5864c();
                        return null;
                }
                return c0838kk;
            case 8:
                int iIntValue4 = ((Integer) obj).intValue();
                bl2 bl2Var2 = new bl2();
                bl2Var2.f15402a = iIntValue4;
                VarHandle.storeStoreFence();
                return bl2Var2;
            case 9:
                String str5 = obj != null ? (String) obj : null;
                nx4 nx4Var2 = new nx4();
                nx4Var2.f26180a = str5;
                VarHandle.storeStoreFence();
                return nx4Var2;
            case 10:
                String str6 = obj != null ? (String) obj : null;
                nv4 nv4Var2 = new nv4();
                nv4Var2.f26126a = str6;
                VarHandle.storeStoreFence();
                return nv4Var2;
            case 11:
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                iv3 iv3Var4 = jv3.f22686s;
                Boolean bool2 = Boolean.FALSE;
                int i3 = (((z62.m13387o(obj21, bool2) && iv3Var4 == null) || obj21 == null) ? null : (wi4) iv3Var4.f21823b.invoke(obj21)).f33412a;
                Object obj22 = list6.get(1);
                iv3 iv3Var5 = jv3.f22687t;
                int i4 = (((z62.m13387o(obj22, bool2) && iv3Var5 == null) || obj22 == null) ? null : (xj4) iv3Var5.f21823b.invoke(obj22)).f34323a;
                Object obj23 = list6.get(2);
                cm4[] cm4VarArr = bm4.f15418b;
                iv3 iv3Var6 = jv3.f22691x;
                long j = (((z62.m13387o(obj23, bool2) && iv3Var6 == null) || obj23 == null) ? null : (bm4) iv3Var6.f21823b.invoke(obj23)).f15420a;
                Object obj24 = list6.get(3);
                al4 al4Var = al4.f14615c;
                al4 al4Var2 = (z62.m13387o(obj24, bool2) || obj24 == null) ? null : (al4) ((yp1) jv3.f22680m.f35216c).invoke(obj24);
                Object obj25 = list6.get(4);
                mb3 mb3Var = (z62.m13387o(obj25, bool2) || obj25 == null) ? null : (mb3) ((yp1) kv3.f23539a.f35216c).invoke(obj25);
                Object obj26 = list6.get(5);
                dl2 dl2Var = dl2.f17143d;
                dl2 dl2Var2 = (z62.m13387o(obj26, bool2) || obj26 == null) ? null : (dl2) ((yp1) jv3.f22664C.f35216c).invoke(obj26);
                Object obj27 = list6.get(6);
                int i5 = ((z62.m13387o(obj27, bool2) || obj27 == null) ? null : (yk2) ((yp1) kv3.f23541c.f35216c).invoke(obj27)).f35296a;
                Object obj28 = list6.get(7);
                iv3 iv3Var7 = jv3.f22688u;
                int i6 = (((z62.m13387o(obj28, bool2) && iv3Var7 == null) || obj28 == null) ? null : (fz1) iv3Var7.f21823b.invoke(obj28)).f19429a;
                Object obj29 = list6.get(8);
                yg3 yg3Var8 = kv3.f23542d;
                if (!z62.m13387o(obj29, bool2) && obj29 != null) {
                    ol4Var = (ol4) ((yp1) yg3Var8.f35216c).invoke(obj29);
                }
                return new r73(i3, i4, j, al4Var2, mb3Var, dl2Var2, i5, i6, ol4Var);
            case 12:
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i7 = pb0.f27502i;
                iv3 iv3Var8 = jv3.f22685r;
                Boolean bool3 = Boolean.FALSE;
                long j2 = (((z62.m13387o(obj30, bool3) && iv3Var8 == null) || obj30 == null) ? null : (pb0) iv3Var8.f21823b.invoke(obj30)).f27503a;
                Object obj31 = list7.get(1);
                cm4[] cm4VarArr2 = bm4.f15418b;
                iv3 iv3Var9 = jv3.f22691x;
                long j3 = (((z62.m13387o(obj31, bool3) && iv3Var9 == null) || obj31 == null) ? null : (bm4) iv3Var9.f21823b.invoke(obj31)).f15420a;
                Object obj32 = list7.get(2);
                xm1 xm1Var = xm1.f34409b;
                xm1 xm1Var2 = (z62.m13387o(obj32, bool3) || obj32 == null) ? null : (xm1) ((yp1) jv3.f22681n.f35216c).invoke(obj32);
                Object obj33 = list7.get(3);
                tm1 tm1Var = (z62.m13387o(obj33, bool3) || obj33 == null) ? null : (tm1) ((yp1) jv3.f22689v.f35216c).invoke(obj33);
                Object obj34 = list7.get(4);
                um1 um1Var = (z62.m13387o(obj34, bool3) || obj34 == null) ? null : (um1) ((yp1) jv3.f22690w.f35216c).invoke(obj34);
                Object obj35 = list7.get(6);
                String str7 = obj35 != null ? (String) obj35 : null;
                Object obj36 = list7.get(7);
                long j4 = (((z62.m13387o(obj36, bool3) && iv3Var9 == null) || obj36 == null) ? null : (bm4) iv3Var9.f21823b.invoke(obj36)).f15420a;
                Object obj37 = list7.get(8);
                C0471ay c0471ay = (z62.m13387o(obj37, bool3) || obj37 == null) ? null : (C0471ay) ((yp1) jv3.f22682o.f35216c).invoke(obj37);
                Object obj38 = list7.get(9);
                zk4 zk4Var = (z62.m13387o(obj38, bool3) || obj38 == null) ? null : (zk4) ((yp1) jv3.f22679l.f35216c).invoke(obj38);
                Object obj39 = list7.get(10);
                zm2 zm2Var = zm2.f36182c;
                zm2 zm2Var2 = (z62.m13387o(obj39, bool3) || obj39 == null) ? null : (zm2) ((yp1) jv3.f22662A.f35216c).invoke(obj39);
                Object obj40 = list7.get(11);
                long j5 = (((z62.m13387o(obj40, bool3) && iv3Var8 == null) || obj40 == null) ? null : (pb0) iv3Var8.f21823b.invoke(obj40)).f27503a;
                Object obj41 = list7.get(12);
                uj4 uj4Var = (z62.m13387o(obj41, bool3) || obj41 == null) ? null : (uj4) ((yp1) jv3.f22678k.f35216c).invoke(obj41);
                Object obj42 = list7.get(13);
                m44 m44Var2 = m44.f24642d;
                yg3 yg3Var9 = jv3.f22684q;
                if (!z62.m13387o(obj42, bool3) && obj42 != null) {
                    m44Var = (m44) ((yp1) yg3Var9.f35216c).invoke(obj42);
                }
                return new pa4(j2, j3, xm1Var2, tm1Var, um1Var, (bm1) null, str7, j4, c0471ay, zk4Var, zm2Var2, j5, uj4Var, m44Var, 49184);
            case 13:
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                boolean zBooleanValue = (obj43 != null ? (Boolean) obj43 : null).booleanValue();
                Object obj44 = list8.get(1);
                yg3 yg3Var10 = kv3.f23540b;
                if (!z62.m13387o(obj44, Boolean.FALSE) && obj44 != null) {
                    m71Var = (m71) ((yp1) yg3Var10.f35216c).invoke(obj44);
                }
                int i8 = m71Var.f24704a;
                mb3 mb3Var2 = new mb3();
                mb3Var2.f24799a = zBooleanValue;
                mb3Var2.f24800b = i8;
                return mb3Var2;
            case 14:
                int iIntValue5 = ((Integer) obj).intValue();
                m71 m71Var2 = new m71();
                m71Var2.f24704a = iIntValue5;
                VarHandle.storeStoreFence();
                return m71Var2;
            case 15:
                int iIntValue6 = ((Integer) obj).intValue();
                yk2 yk2Var = new yk2();
                yk2Var.f35296a = iIntValue6;
                VarHandle.storeStoreFence();
                return yk2Var;
            case 16:
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                int i9 = ((z62.m13387o(obj45, Boolean.FALSE) || obj45 == null) ? null : (nl4) ((yp1) kv3.f23543e.f35216c).invoke(obj45)).f25934a;
                Object obj46 = list9.get(1);
                return new ol4(i9, (obj46 != null ? (Boolean) obj46 : null).booleanValue());
            case 17:
                int iIntValue7 = ((Integer) obj).intValue();
                nl4 nl4Var = new nl4();
                nl4Var.f25934a = iIntValue7;
                VarHandle.storeStoreFence();
                return nl4Var;
            case 18:
                ((kz3) obj).m7753a("system_navigation_bar_not_enabled_alert", se0.f30194g);
                return ju4Var;
            case 19:
                ((kz3) obj).m7753a("enabled_switch", se0.f30195h);
                return ju4Var;
            case 20:
                return c75.m3877i(((Integer) obj).intValue() + 1, "Button ");
            case 21:
                return ((vx2) obj).f32907a;
            case 22:
                return ((vx2) obj).f32908b;
            case 23:
                return Integer.valueOf(((zw3) obj).f36429b);
            case 24:
                s52 s52Var = ((zw3) obj).f36430c;
                return Integer.valueOf(s52Var.f29919d - s52Var.f29917b);
            case 25:
                boolean zM13387o = z62.m13387o((g12) obj, (g12) o02.f26246c.getValue());
                kt2 kt2Var = kt2.f23428a;
                return !zM13387o ? kt2Var : C0006a5.m52H(n74.m8579g(kt2Var, 20.0f));
            case 26:
                return new wx3(((Integer) obj).intValue());
            case 27:
                b33 b33Var = (b33) obj;
                long j6 = b33Var.f15059a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new C0530ck(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (b33Var.f15059a & 4294967295L))) : b14.f15024a;
            case 28:
                C0530ck c0530ck = (C0530ck) obj;
                return b33.m3423a((((long) Float.floatToRawIntBits(c0530ck.f16071a)) << 32) | (((long) Float.floatToRawIntBits(c0530ck.f16072b)) & 4294967295L));
            default:
                return ju4Var;
        }
    }
}
