package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29478a;

    public /* synthetic */ ro4(byte b) {
        this.f29478a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        switch (this.f29478a) {
            case 0:
                return Boolean.valueOf(((gf4) obj).mo5112g());
            case 1:
                yz3 yz3Var = (yz3) obj;
                long j = yz3Var.f35655j;
                aa4 aa4Var = yz3Var.f35657l;
                if (aa4Var != null) {
                    aa4Var.m159e(yz3Var, zp0.f36244g, yz3Var.f35656k);
                }
                long j2 = yz3Var.f35655j;
                if (j != j2) {
                    rz3 rz3Var = yz3Var.f35647M;
                    if (rz3Var != null) {
                        if (rz3Var.f29747a > j2) {
                            yz3Var.m13282v();
                        } else {
                            rz3Var.f29753g = j2;
                            if (rz3Var.f29748b == null) {
                                rz3Var.f29754h = qq2.m10011F((1.0d - ((double) rz3Var.f29751e.mo3608a(0))) * yz3Var.f35655j);
                            }
                        }
                    } else if (j2 != 0) {
                        yz3Var.m13274B();
                    }
                }
                return ju4.f22634a;
            case 2:
                gf4 gf4Var = (gf4) obj;
                t34 t34Var = new t34();
                while (gf4Var.mo5112g()) {
                    t34Var.add(Integer.valueOf((int) gf4Var.getLong(0)));
                }
                return vd6.m11847f(t34Var);
            case 3:
                lc2 lc2Var = (lc2) obj;
                mc2 mc2Var = lc2Var.f23933a;
                bs4 bs4Var = lc2Var.f23934b;
                if (mc2Var == null) {
                    return "*";
                }
                bs4 bs4Var2 = bs4Var != null ? bs4Var : null;
                String strM3666a = bs4Var2 != null ? bs4Var2.m3666a(true) : String.valueOf(bs4Var);
                int iOrdinal = mc2Var.ordinal();
                if (iOrdinal == 0) {
                    return strM3666a;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strM3666a);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strM3666a);
                }
                C0670g.m5864c();
                return null;
            case 4:
                return new C0494bk(((Float) obj).floatValue());
            case 5:
                return new C0494bk(((Integer) obj).intValue());
            case 6:
                return Integer.valueOf((int) ((C0494bk) obj).f15339a);
            case 7:
                return new C0494bk(((p11) obj).f27285a);
            case 8:
                return p11.m9350a(((C0494bk) obj).f15339a);
            case 9:
                r11 r11Var = (r11) obj;
                return new C0530ck(Float.intBitsToFloat((int) (r11Var.f28953a >> 32)), Float.intBitsToFloat((int) (r11Var.f28953a & 4294967295L)));
            case 10:
                C0530ck c0530ck = (C0530ck) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c0530ck.f16071a)) << 32) | (((long) Float.floatToRawIntBits(c0530ck.f16072b)) & 4294967295L);
                r11 r11Var2 = new r11();
                r11Var2.f28953a = jFloatToRawIntBits;
                VarHandle.storeStoreFence();
                return r11Var2;
            case 11:
                h74 h74Var = (h74) obj;
                return new C0530ck(Float.intBitsToFloat((int) (h74Var.f20418a >> 32)), Float.intBitsToFloat((int) (h74Var.f20418a & 4294967295L)));
            case 12:
                C0530ck c0530ck2 = (C0530ck) obj;
                return h74.m6269a((((long) Float.floatToRawIntBits(c0530ck2.f16071a)) << 32) | (((long) Float.floatToRawIntBits(c0530ck2.f16072b)) & 4294967295L));
            case 13:
                b33 b33Var = (b33) obj;
                return new C0530ck(Float.intBitsToFloat((int) (b33Var.f15059a >> 32)), Float.intBitsToFloat((int) (b33Var.f15059a & 4294967295L)));
            case 14:
                C0530ck c0530ck3 = (C0530ck) obj;
                return b33.m3423a((((long) Float.floatToRawIntBits(c0530ck3.f16071a)) << 32) | (((long) Float.floatToRawIntBits(c0530ck3.f16072b)) & 4294967295L));
            case 15:
                long j3 = ((o52) obj).f26352a;
                return new C0530ck((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 16:
                C0530ck c0530ck4 = (C0530ck) obj;
                return o52.m8954a((((long) Math.round(c0530ck4.f16071a)) << 32) | (((long) Math.round(c0530ck4.f16072b)) & 4294967295L));
            case 17:
                long j4 = ((w52) obj).f33109a;
                return new C0530ck((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 18:
                C0530ck c0530ck5 = (C0530ck) obj;
                int iRound = Math.round(c0530ck5.f16071a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c0530ck5.f16072b);
                return w52.m12106a((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 19:
                jl3 jl3Var = (jl3) obj;
                return new C0615ek(jl3Var.f22396a, jl3Var.f22397b, jl3Var.f22398c, jl3Var.f22399d);
            case 20:
                C0615ek c0615ek = (C0615ek) obj;
                return new jl3(c0615ek.f18145a, c0615ek.f18146b, c0615ek.f18147c, c0615ek.f18148d);
            case 21:
                return Float.valueOf(((C0494bk) obj).f15339a);
            case 22:
                return ((y05) obj).f34786m;
            case 23:
                return ((y05) obj).f34778e;
            case 24:
                return (f15) obj;
            case 25:
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i = gf4VarM11888b.mo5112g() ? (int) gf4VarM11888b.getLong(0) : 0;
                    gf4VarM11888b.close();
                    return Integer.valueOf(i);
                } catch (Throwable th) {
                    gf4VarM11888b.close();
                    throw th;
                }
            case 26:
                gf4 gf4VarM11888b2 = ((ve4) obj).m11888b("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iM10633E = sc6.m10633E(gf4VarM11888b2, "id");
                    int iM10633E2 = sc6.m10633E(gf4VarM11888b2, "state");
                    int iM10633E3 = sc6.m10633E(gf4VarM11888b2, "worker_class_name");
                    int iM10633E4 = sc6.m10633E(gf4VarM11888b2, "input_merger_class_name");
                    int iM10633E5 = sc6.m10633E(gf4VarM11888b2, "input");
                    int iM10633E6 = sc6.m10633E(gf4VarM11888b2, "output");
                    int iM10633E7 = sc6.m10633E(gf4VarM11888b2, "initial_delay");
                    int iM10633E8 = sc6.m10633E(gf4VarM11888b2, "interval_duration");
                    int iM10633E9 = sc6.m10633E(gf4VarM11888b2, "flex_duration");
                    int iM10633E10 = sc6.m10633E(gf4VarM11888b2, "run_attempt_count");
                    int iM10633E11 = sc6.m10633E(gf4VarM11888b2, "backoff_policy");
                    int iM10633E12 = sc6.m10633E(gf4VarM11888b2, "backoff_delay_duration");
                    int iM10633E13 = sc6.m10633E(gf4VarM11888b2, "last_enqueue_time");
                    int iM10633E14 = sc6.m10633E(gf4VarM11888b2, "minimum_retention_duration");
                    int iM10633E15 = sc6.m10633E(gf4VarM11888b2, "schedule_requested_at");
                    int iM10633E16 = sc6.m10633E(gf4VarM11888b2, "run_in_foreground");
                    int iM10633E17 = sc6.m10633E(gf4VarM11888b2, "out_of_quota_policy");
                    int iM10633E18 = sc6.m10633E(gf4VarM11888b2, "period_count");
                    int iM10633E19 = sc6.m10633E(gf4VarM11888b2, "generation");
                    int iM10633E20 = sc6.m10633E(gf4VarM11888b2, "next_schedule_time_override");
                    int iM10633E21 = sc6.m10633E(gf4VarM11888b2, "next_schedule_time_override_generation");
                    int iM10633E22 = sc6.m10633E(gf4VarM11888b2, "stop_reason");
                    int iM10633E23 = sc6.m10633E(gf4VarM11888b2, "trace_tag");
                    int iM10633E24 = sc6.m10633E(gf4VarM11888b2, "backoff_on_system_interruptions");
                    int iM10633E25 = sc6.m10633E(gf4VarM11888b2, "required_network_type");
                    int iM10633E26 = sc6.m10633E(gf4VarM11888b2, "required_network_request");
                    int iM10633E27 = sc6.m10633E(gf4VarM11888b2, "requires_charging");
                    int iM10633E28 = sc6.m10633E(gf4VarM11888b2, "requires_device_idle");
                    int iM10633E29 = sc6.m10633E(gf4VarM11888b2, "requires_battery_not_low");
                    int iM10633E30 = sc6.m10633E(gf4VarM11888b2, "requires_storage_not_low");
                    int iM10633E31 = sc6.m10633E(gf4VarM11888b2, "trigger_content_update_delay");
                    int iM10633E32 = sc6.m10633E(gf4VarM11888b2, "trigger_max_content_delay");
                    int iM10633E33 = sc6.m10633E(gf4VarM11888b2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (gf4VarM11888b2.mo5112g()) {
                        String strMo5110b = gf4VarM11888b2.mo5110b(iM10633E);
                        int i2 = iM10633E14;
                        int i3 = iM10633E13;
                        f25 f25VarM13003D = y70.m13003D((int) gf4VarM11888b2.getLong(iM10633E2));
                        String strMo5110b2 = gf4VarM11888b2.mo5110b(iM10633E3);
                        String strMo5110b3 = gf4VarM11888b2.mo5110b(iM10633E4);
                        byte[] blob = gf4VarM11888b2.getBlob(iM10633E5);
                        zs0 zs0Var = zs0.f36338b;
                        zs0 zs0VarM77o = C0006a5.m77o(blob);
                        zs0 zs0VarM77o2 = C0006a5.m77o(gf4VarM11888b2.getBlob(iM10633E6));
                        long j5 = gf4VarM11888b2.getLong(iM10633E7);
                        long j6 = gf4VarM11888b2.getLong(iM10633E8);
                        long j7 = gf4VarM11888b2.getLong(iM10633E9);
                        int i4 = (int) gf4VarM11888b2.getLong(iM10633E10);
                        int i5 = iM10633E2;
                        int i6 = iM10633E;
                        EnumC0887lw enumC0887lwM13000A = y70.m13000A((int) gf4VarM11888b2.getLong(iM10633E11));
                        long j8 = gf4VarM11888b2.getLong(iM10633E12);
                        long j9 = gf4VarM11888b2.getLong(i3);
                        long j10 = gf4VarM11888b2.getLong(i2);
                        int i7 = iM10633E15;
                        long j11 = gf4VarM11888b2.getLong(i7);
                        iM10633E15 = i7;
                        int i8 = iM10633E16;
                        int i9 = iM10633E3;
                        boolean z = ((int) gf4VarM11888b2.getLong(i8)) != 0;
                        int i10 = iM10633E17;
                        f63 f63VarM13002C = y70.m13002C((int) gf4VarM11888b2.getLong(i10));
                        iM10633E17 = i10;
                        int i11 = iM10633E18;
                        int i12 = (int) gf4VarM11888b2.getLong(i11);
                        iM10633E18 = i11;
                        int i13 = iM10633E19;
                        int i14 = (int) gf4VarM11888b2.getLong(i13);
                        int i15 = iM10633E20;
                        long j12 = gf4VarM11888b2.getLong(i15);
                        int i16 = iM10633E21;
                        int i17 = (int) gf4VarM11888b2.getLong(i16);
                        int i18 = iM10633E22;
                        int i19 = (int) gf4VarM11888b2.getLong(i18);
                        int i20 = iM10633E23;
                        String strMo5110b4 = gf4VarM11888b2.isNull(i20) ? null : gf4VarM11888b2.mo5110b(i20);
                        int i21 = iM10633E24;
                        Integer numValueOf = gf4VarM11888b2.isNull(i21) ? null : Integer.valueOf((int) gf4VarM11888b2.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        iM10633E24 = i21;
                        int i22 = iM10633E25;
                        s03 s03VarM13001B = y70.m13001B((int) gf4VarM11888b2.getLong(i22));
                        int i23 = iM10633E26;
                        p03 p03VarM13017R = y70.m13017R(gf4VarM11888b2.getBlob(i23));
                        iM10633E25 = i22;
                        int i24 = iM10633E27;
                        boolean z2 = ((int) gf4VarM11888b2.getLong(i24)) != 0;
                        iM10633E27 = i24;
                        int i25 = iM10633E28;
                        boolean z3 = ((int) gf4VarM11888b2.getLong(i25)) != 0;
                        iM10633E28 = i25;
                        int i26 = iM10633E29;
                        boolean z4 = ((int) gf4VarM11888b2.getLong(i26)) != 0;
                        iM10633E29 = i26;
                        int i27 = iM10633E30;
                        int i28 = iM10633E31;
                        int i29 = iM10633E32;
                        iM10633E31 = i28;
                        int i30 = iM10633E33;
                        iM10633E33 = i30;
                        arrayList.add(new q25(strMo5110b, f25VarM13003D, strMo5110b2, strMo5110b3, zs0VarM77o, zs0VarM77o2, j5, j6, j7, new jl0(p03VarM13017R, s03VarM13001B, z2, z3, z4, ((int) gf4VarM11888b2.getLong(i27)) != 0, gf4VarM11888b2.getLong(i28), gf4VarM11888b2.getLong(i29), y70.m13031k(gf4VarM11888b2.getBlob(i30))), i4, enumC0887lwM13000A, j8, j9, j10, j11, z, f63VarM13002C, i12, i14, j12, i17, i19, strMo5110b4, boolValueOf));
                        iM10633E32 = i29;
                        iM10633E30 = i27;
                        iM10633E = i6;
                        iM10633E3 = i9;
                        iM10633E16 = i8;
                        iM10633E19 = i13;
                        iM10633E20 = i15;
                        iM10633E21 = i16;
                        iM10633E22 = i18;
                        iM10633E23 = i20;
                        iM10633E13 = i3;
                        iM10633E2 = i5;
                        iM10633E26 = i23;
                        iM10633E14 = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    gf4VarM11888b2.close();
                }
            case 27:
                gf4 gf4VarM11888b3 = ((ve4) obj).m11888b("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(gf4VarM11888b3.mo5112g() && ((int) gf4VarM11888b3.getLong(0)) != 0);
                } finally {
                    gf4VarM11888b3.close();
                }
            case 28:
                gf4 gf4VarM11888b4 = ((ve4) obj).m11888b("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    gf4VarM11888b4.mo5117z(1, 200L);
                    int iM10633E34 = sc6.m10633E(gf4VarM11888b4, "id");
                    int iM10633E35 = sc6.m10633E(gf4VarM11888b4, "state");
                    int iM10633E36 = sc6.m10633E(gf4VarM11888b4, "worker_class_name");
                    int iM10633E37 = sc6.m10633E(gf4VarM11888b4, "input_merger_class_name");
                    int iM10633E38 = sc6.m10633E(gf4VarM11888b4, "input");
                    int iM10633E39 = sc6.m10633E(gf4VarM11888b4, "output");
                    int iM10633E40 = sc6.m10633E(gf4VarM11888b4, "initial_delay");
                    int iM10633E41 = sc6.m10633E(gf4VarM11888b4, "interval_duration");
                    int iM10633E42 = sc6.m10633E(gf4VarM11888b4, "flex_duration");
                    int iM10633E43 = sc6.m10633E(gf4VarM11888b4, "run_attempt_count");
                    int iM10633E44 = sc6.m10633E(gf4VarM11888b4, "backoff_policy");
                    int iM10633E45 = sc6.m10633E(gf4VarM11888b4, "backoff_delay_duration");
                    int iM10633E46 = sc6.m10633E(gf4VarM11888b4, "last_enqueue_time");
                    int iM10633E47 = sc6.m10633E(gf4VarM11888b4, "minimum_retention_duration");
                    int iM10633E48 = sc6.m10633E(gf4VarM11888b4, "schedule_requested_at");
                    int iM10633E49 = sc6.m10633E(gf4VarM11888b4, "run_in_foreground");
                    int iM10633E50 = sc6.m10633E(gf4VarM11888b4, "out_of_quota_policy");
                    int iM10633E51 = sc6.m10633E(gf4VarM11888b4, "period_count");
                    int iM10633E52 = sc6.m10633E(gf4VarM11888b4, "generation");
                    int iM10633E53 = sc6.m10633E(gf4VarM11888b4, "next_schedule_time_override");
                    int iM10633E54 = sc6.m10633E(gf4VarM11888b4, "next_schedule_time_override_generation");
                    int iM10633E55 = sc6.m10633E(gf4VarM11888b4, "stop_reason");
                    int iM10633E56 = sc6.m10633E(gf4VarM11888b4, "trace_tag");
                    int iM10633E57 = sc6.m10633E(gf4VarM11888b4, "backoff_on_system_interruptions");
                    int iM10633E58 = sc6.m10633E(gf4VarM11888b4, "required_network_type");
                    int iM10633E59 = sc6.m10633E(gf4VarM11888b4, "required_network_request");
                    int iM10633E60 = sc6.m10633E(gf4VarM11888b4, "requires_charging");
                    int iM10633E61 = sc6.m10633E(gf4VarM11888b4, "requires_device_idle");
                    int iM10633E62 = sc6.m10633E(gf4VarM11888b4, "requires_battery_not_low");
                    int iM10633E63 = sc6.m10633E(gf4VarM11888b4, "requires_storage_not_low");
                    int iM10633E64 = sc6.m10633E(gf4VarM11888b4, "trigger_content_update_delay");
                    int iM10633E65 = sc6.m10633E(gf4VarM11888b4, "trigger_max_content_delay");
                    int iM10633E66 = sc6.m10633E(gf4VarM11888b4, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (gf4VarM11888b4.mo5112g()) {
                        String strMo5110b5 = gf4VarM11888b4.mo5110b(iM10633E34);
                        int i31 = iM10633E47;
                        ArrayList arrayList3 = arrayList2;
                        f25 f25VarM13003D2 = y70.m13003D((int) gf4VarM11888b4.getLong(iM10633E35));
                        String strMo5110b6 = gf4VarM11888b4.mo5110b(iM10633E36);
                        String strMo5110b7 = gf4VarM11888b4.mo5110b(iM10633E37);
                        byte[] blob2 = gf4VarM11888b4.getBlob(iM10633E38);
                        zs0 zs0Var2 = zs0.f36338b;
                        zs0 zs0VarM77o3 = C0006a5.m77o(blob2);
                        zs0 zs0VarM77o4 = C0006a5.m77o(gf4VarM11888b4.getBlob(iM10633E39));
                        long j13 = gf4VarM11888b4.getLong(iM10633E40);
                        long j14 = gf4VarM11888b4.getLong(iM10633E41);
                        long j15 = gf4VarM11888b4.getLong(iM10633E42);
                        int i32 = (int) gf4VarM11888b4.getLong(iM10633E43);
                        int i33 = iM10633E35;
                        int i34 = iM10633E34;
                        EnumC0887lw enumC0887lwM13000A2 = y70.m13000A((int) gf4VarM11888b4.getLong(iM10633E44));
                        long j16 = gf4VarM11888b4.getLong(iM10633E45);
                        long j17 = gf4VarM11888b4.getLong(iM10633E46);
                        long j18 = gf4VarM11888b4.getLong(i31);
                        int i35 = iM10633E48;
                        long j19 = gf4VarM11888b4.getLong(i35);
                        iM10633E48 = i35;
                        int i36 = iM10633E49;
                        boolean z5 = ((int) gf4VarM11888b4.getLong(i36)) != 0;
                        int i37 = iM10633E36;
                        int i38 = iM10633E50;
                        int i39 = iM10633E37;
                        f63 f63VarM13002C2 = y70.m13002C((int) gf4VarM11888b4.getLong(i38));
                        int i40 = iM10633E51;
                        int i41 = (int) gf4VarM11888b4.getLong(i40);
                        iM10633E51 = i40;
                        int i42 = iM10633E52;
                        int i43 = (int) gf4VarM11888b4.getLong(i42);
                        long j20 = gf4VarM11888b4.getLong(iM10633E53);
                        int i44 = iM10633E54;
                        int i45 = (int) gf4VarM11888b4.getLong(i44);
                        int i46 = iM10633E55;
                        int i47 = (int) gf4VarM11888b4.getLong(i46);
                        int i48 = iM10633E56;
                        String strMo5110b8 = gf4VarM11888b4.isNull(i48) ? null : gf4VarM11888b4.mo5110b(i48);
                        int i49 = iM10633E57;
                        Integer numValueOf2 = gf4VarM11888b4.isNull(i49) ? null : Integer.valueOf((int) gf4VarM11888b4.getLong(i49));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        iM10633E57 = i49;
                        int i50 = iM10633E58;
                        s03 s03VarM13001B2 = y70.m13001B((int) gf4VarM11888b4.getLong(i50));
                        int i51 = iM10633E59;
                        p03 p03VarM13017R2 = y70.m13017R(gf4VarM11888b4.getBlob(i51));
                        iM10633E58 = i50;
                        int i52 = iM10633E60;
                        boolean z6 = ((int) gf4VarM11888b4.getLong(i52)) != 0;
                        iM10633E60 = i52;
                        int i53 = iM10633E61;
                        boolean z7 = ((int) gf4VarM11888b4.getLong(i53)) != 0;
                        iM10633E61 = i53;
                        int i54 = iM10633E62;
                        boolean z8 = ((int) gf4VarM11888b4.getLong(i54)) != 0;
                        iM10633E62 = i54;
                        int i55 = iM10633E63;
                        int i56 = iM10633E64;
                        int i57 = iM10633E65;
                        iM10633E64 = i56;
                        int i58 = iM10633E66;
                        iM10633E66 = i58;
                        arrayList3.add(new q25(strMo5110b5, f25VarM13003D2, strMo5110b6, strMo5110b7, zs0VarM77o3, zs0VarM77o4, j13, j14, j15, new jl0(p03VarM13017R2, s03VarM13001B2, z6, z7, z8, ((int) gf4VarM11888b4.getLong(i55)) != 0, gf4VarM11888b4.getLong(i56), gf4VarM11888b4.getLong(i57), y70.m13031k(gf4VarM11888b4.getBlob(i58))), i32, enumC0887lwM13000A2, j16, j17, j18, j19, z5, f63VarM13002C2, i41, i43, j20, i45, i47, strMo5110b8, boolValueOf2));
                        iM10633E59 = i51;
                        iM10633E37 = i39;
                        iM10633E50 = i38;
                        iM10633E52 = i42;
                        iM10633E54 = i44;
                        iM10633E55 = i46;
                        iM10633E56 = i48;
                        iM10633E65 = i57;
                        iM10633E63 = i55;
                        iM10633E36 = i37;
                        iM10633E47 = i31;
                        iM10633E34 = i34;
                        iM10633E49 = i36;
                        arrayList2 = arrayList3;
                        iM10633E35 = i33;
                        break;
                    }
                    return arrayList2;
                } finally {
                    gf4VarM11888b4.close();
                }
            default:
                ve4 ve4Var = (ve4) obj;
                gf4 gf4VarM11888b5 = ve4Var.m11888b("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    gf4VarM11888b5.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var));
                } finally {
                    gf4VarM11888b5.close();
                }
        }
    }
}
