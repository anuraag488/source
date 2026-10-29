package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: py */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1051py implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28075a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f28076b;

    public /* synthetic */ C1051py(byte b) {
        this.f28075a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        byte b = this.f28075a;
        Object objValueOf = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                String str = this.f28076b;
                q14 q14Var = (q14) obj;
                ic2[] ic2VarArr = o14.f26289a;
                p14 p14Var = m14.f24562k;
                ic2[] ic2VarArr2 = o14.f26289a;
                ic2 ic2Var = ic2VarArr2[3];
                jm2 jm2Var = new jm2();
                VarHandle.storeStoreFence();
                p14Var.getClass();
                q14Var.mo4898a(p14Var, jm2Var);
                p14 p14Var2 = m14.f24555d;
                ic2 ic2Var2 = ic2VarArr2[2];
                p14Var2.getClass();
                q14Var.mo4898a(p14Var2, str);
                return ju4Var;
            case 1:
                String str2 = this.f28076b;
                q14 q14Var2 = (q14) obj;
                ic2[] ic2VarArr3 = o14.f26289a;
                p14 p14Var3 = m14.f24555d;
                ic2[] ic2VarArr4 = o14.f26289a;
                ic2 ic2Var3 = ic2VarArr4[2];
                p14Var3.getClass();
                q14Var2.mo4898a(p14Var3, str2);
                p14 p14Var4 = m14.f24572u;
                ic2 ic2Var4 = ic2VarArr4[11];
                Float fValueOf = Float.valueOf(0.0f);
                p14Var4.getClass();
                q14Var2.mo4898a(p14Var4, fValueOf);
                return ju4Var;
            case 2:
                String str3 = this.f28076b;
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    gf4VarM11888b.mo5109a(1, str3);
                    ArrayList arrayList = new ArrayList();
                    while (gf4VarM11888b.mo5112g()) {
                        arrayList.add(gf4VarM11888b.mo5110b(0));
                    }
                    gf4VarM11888b.close();
                    return arrayList;
                } catch (Throwable th) {
                    gf4VarM11888b.close();
                    throw th;
                }
            case 3:
                String str4 = this.f28076b;
                gf4 gf4VarM11888b2 = ((ve4) obj).m11888b("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    gf4VarM11888b2.mo5109a(1, str4);
                    return Boolean.valueOf(gf4VarM11888b2.mo5112g() && ((int) gf4VarM11888b2.getLong(0)) != 0);
                } finally {
                    gf4VarM11888b2.close();
                }
            case 4:
                String str5 = this.f28076b;
                gf4 gf4VarM11888b3 = ((ve4) obj).m11888b("SELECT long_value FROM Preference where `key`=?");
                try {
                    gf4VarM11888b3.mo5109a(1, str5);
                    if (gf4VarM11888b3.mo5112g() && !gf4VarM11888b3.isNull(0)) {
                        objValueOf = Long.valueOf(gf4VarM11888b3.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    gf4VarM11888b3.close();
                }
            case 5:
                o14.m8921b((q14) obj, this.f28076b);
                return ju4Var;
            case 6:
                String str6 = this.f28076b;
                String str7 = (String) obj;
                if (hd4.m6345k0(str7)) {
                    return str7.length() < str6.length() ? str6 : str7;
                }
                return str6.concat(str7);
            case 7:
                String str8 = this.f28076b;
                gf4 gf4VarM11888b4 = ((ve4) obj).m11888b("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    gf4VarM11888b4.mo5109a(1, str8);
                    gf4VarM11888b4.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b4.close();
                }
            case 8:
                String str9 = this.f28076b;
                q14 q14Var3 = (q14) obj;
                ic2[] ic2VarArr5 = o14.f26289a;
                p14 p14Var5 = m14.f24562k;
                ic2[] ic2VarArr6 = o14.f26289a;
                ic2 ic2Var5 = ic2VarArr6[3];
                jm2 jm2Var2 = new jm2();
                VarHandle.storeStoreFence();
                p14Var5.getClass();
                q14Var3.mo4898a(p14Var5, jm2Var2);
                p14 p14Var6 = m14.f24555d;
                ic2 ic2Var6 = ic2VarArr6[2];
                p14Var6.getClass();
                q14Var3.mo4898a(p14Var6, str9);
                return ju4Var;
            case 9:
                f12.m5445c((f12) obj, uw4.m11675a(this.f28076b), new ga4(pb0.f27497d), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4Var;
            case 10:
                String str10 = this.f28076b;
                gf4 gf4VarM11888b5 = ((ve4) obj).m11888b("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    gf4VarM11888b5.mo5109a(1, str10);
                    ArrayList arrayList2 = new ArrayList();
                    while (gf4VarM11888b5.mo5112g()) {
                        arrayList2.add(gf4VarM11888b5.mo5110b(0));
                    }
                    gf4VarM11888b5.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    gf4VarM11888b5.close();
                    throw th2;
                }
            case 11:
                gf4 gf4VarM11888b6 = ((ve4) obj).m11888b(this.f28076b);
                try {
                    gf4VarM11888b6.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b6.close();
                }
            case 12:
                String str11 = this.f28076b;
                gf4 gf4VarM11888b7 = ((ve4) obj).m11888b("DELETE from WorkProgress where work_spec_id=?");
                try {
                    gf4VarM11888b7.mo5109a(1, str11);
                    gf4VarM11888b7.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b7.close();
                }
            case 13:
                String str12 = this.f28076b;
                gf4 gf4VarM11888b8 = ((ve4) obj).m11888b("SELECT * FROM workspec WHERE id=?");
                try {
                    gf4VarM11888b8.mo5109a(1, str12);
                    int iM10633E = sc6.m10633E(gf4VarM11888b8, "id");
                    int iM10633E2 = sc6.m10633E(gf4VarM11888b8, "state");
                    int iM10633E3 = sc6.m10633E(gf4VarM11888b8, "worker_class_name");
                    int iM10633E4 = sc6.m10633E(gf4VarM11888b8, "input_merger_class_name");
                    int iM10633E5 = sc6.m10633E(gf4VarM11888b8, "input");
                    int iM10633E6 = sc6.m10633E(gf4VarM11888b8, "output");
                    int iM10633E7 = sc6.m10633E(gf4VarM11888b8, "initial_delay");
                    int iM10633E8 = sc6.m10633E(gf4VarM11888b8, "interval_duration");
                    int iM10633E9 = sc6.m10633E(gf4VarM11888b8, "flex_duration");
                    int iM10633E10 = sc6.m10633E(gf4VarM11888b8, "run_attempt_count");
                    int iM10633E11 = sc6.m10633E(gf4VarM11888b8, "backoff_policy");
                    int iM10633E12 = sc6.m10633E(gf4VarM11888b8, "backoff_delay_duration");
                    int iM10633E13 = sc6.m10633E(gf4VarM11888b8, "last_enqueue_time");
                    int iM10633E14 = sc6.m10633E(gf4VarM11888b8, "minimum_retention_duration");
                    int iM10633E15 = sc6.m10633E(gf4VarM11888b8, "schedule_requested_at");
                    int iM10633E16 = sc6.m10633E(gf4VarM11888b8, "run_in_foreground");
                    int iM10633E17 = sc6.m10633E(gf4VarM11888b8, "out_of_quota_policy");
                    int iM10633E18 = sc6.m10633E(gf4VarM11888b8, "period_count");
                    int iM10633E19 = sc6.m10633E(gf4VarM11888b8, "generation");
                    int iM10633E20 = sc6.m10633E(gf4VarM11888b8, "next_schedule_time_override");
                    int iM10633E21 = sc6.m10633E(gf4VarM11888b8, "next_schedule_time_override_generation");
                    int iM10633E22 = sc6.m10633E(gf4VarM11888b8, "stop_reason");
                    int iM10633E23 = sc6.m10633E(gf4VarM11888b8, "trace_tag");
                    int iM10633E24 = sc6.m10633E(gf4VarM11888b8, "backoff_on_system_interruptions");
                    int iM10633E25 = sc6.m10633E(gf4VarM11888b8, "required_network_type");
                    int iM10633E26 = sc6.m10633E(gf4VarM11888b8, "required_network_request");
                    int iM10633E27 = sc6.m10633E(gf4VarM11888b8, "requires_charging");
                    int iM10633E28 = sc6.m10633E(gf4VarM11888b8, "requires_device_idle");
                    int iM10633E29 = sc6.m10633E(gf4VarM11888b8, "requires_battery_not_low");
                    int iM10633E30 = sc6.m10633E(gf4VarM11888b8, "requires_storage_not_low");
                    int iM10633E31 = sc6.m10633E(gf4VarM11888b8, "trigger_content_update_delay");
                    int iM10633E32 = sc6.m10633E(gf4VarM11888b8, "trigger_max_content_delay");
                    int iM10633E33 = sc6.m10633E(gf4VarM11888b8, "content_uri_triggers");
                    if (gf4VarM11888b8.mo5112g()) {
                        String strMo5110b = gf4VarM11888b8.mo5110b(iM10633E);
                        f25 f25VarM13003D = y70.m13003D((int) gf4VarM11888b8.getLong(iM10633E2));
                        String strMo5110b2 = gf4VarM11888b8.mo5110b(iM10633E3);
                        String strMo5110b3 = gf4VarM11888b8.mo5110b(iM10633E4);
                        byte[] blob = gf4VarM11888b8.getBlob(iM10633E5);
                        zs0 zs0Var = zs0.f36338b;
                        zs0 zs0VarM77o = C0006a5.m77o(blob);
                        zs0 zs0VarM77o2 = C0006a5.m77o(gf4VarM11888b8.getBlob(iM10633E6));
                        long j = gf4VarM11888b8.getLong(iM10633E7);
                        long j2 = gf4VarM11888b8.getLong(iM10633E8);
                        long j3 = gf4VarM11888b8.getLong(iM10633E9);
                        int i = (int) gf4VarM11888b8.getLong(iM10633E10);
                        EnumC0887lw enumC0887lwM13000A = y70.m13000A((int) gf4VarM11888b8.getLong(iM10633E11));
                        long j4 = gf4VarM11888b8.getLong(iM10633E12);
                        long j5 = gf4VarM11888b8.getLong(iM10633E13);
                        long j6 = gf4VarM11888b8.getLong(iM10633E14);
                        long j7 = gf4VarM11888b8.getLong(iM10633E15);
                        boolean z = ((int) gf4VarM11888b8.getLong(iM10633E16)) != 0;
                        f63 f63VarM13002C = y70.m13002C((int) gf4VarM11888b8.getLong(iM10633E17));
                        int i2 = (int) gf4VarM11888b8.getLong(iM10633E18);
                        int i3 = (int) gf4VarM11888b8.getLong(iM10633E19);
                        long j8 = gf4VarM11888b8.getLong(iM10633E20);
                        int i4 = (int) gf4VarM11888b8.getLong(iM10633E21);
                        int i5 = (int) gf4VarM11888b8.getLong(iM10633E22);
                        String strMo5110b4 = gf4VarM11888b8.isNull(iM10633E23) ? null : gf4VarM11888b8.mo5110b(iM10633E23);
                        Integer numValueOf = gf4VarM11888b8.isNull(iM10633E24) ? null : Integer.valueOf((int) gf4VarM11888b8.getLong(iM10633E24));
                        if (numValueOf != null) {
                            objValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        objValueOf = new q25(strMo5110b, f25VarM13003D, strMo5110b2, strMo5110b3, zs0VarM77o, zs0VarM77o2, j, j2, j3, new jl0(y70.m13017R(gf4VarM11888b8.getBlob(iM10633E26)), y70.m13001B((int) gf4VarM11888b8.getLong(iM10633E25)), ((int) gf4VarM11888b8.getLong(iM10633E27)) != 0, ((int) gf4VarM11888b8.getLong(iM10633E28)) != 0, ((int) gf4VarM11888b8.getLong(iM10633E29)) != 0, ((int) gf4VarM11888b8.getLong(iM10633E30)) != 0, gf4VarM11888b8.getLong(iM10633E31), gf4VarM11888b8.getLong(iM10633E32), y70.m13031k(gf4VarM11888b8.getBlob(iM10633E33))), i, enumC0887lwM13000A, j4, j5, j6, j7, z, f63VarM13002C, i2, i3, j8, i4, i5, strMo5110b4, (Boolean) objValueOf);
                    }
                    return objValueOf;
                } finally {
                    gf4VarM11888b8.close();
                }
            case 14:
                String str13 = this.f28076b;
                gf4 gf4VarM11888b9 = ((ve4) obj).m11888b("SELECT state FROM workspec WHERE id=?");
                try {
                    gf4VarM11888b9.mo5109a(1, str13);
                    if (gf4VarM11888b9.mo5112g()) {
                        Integer numValueOf2 = gf4VarM11888b9.isNull(0) ? null : Integer.valueOf((int) gf4VarM11888b9.getLong(0));
                        if (numValueOf2 != null) {
                            objValueOf = y70.m13003D(numValueOf2.intValue());
                            break;
                        }
                    }
                    return objValueOf;
                } finally {
                    gf4VarM11888b9.close();
                }
            case 15:
                String str14 = this.f28076b;
                ve4 ve4Var = (ve4) obj;
                gf4 gf4VarM11888b10 = ve4Var.m11888b("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    gf4VarM11888b10.mo5109a(1, str14);
                    gf4VarM11888b10.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var));
                } finally {
                    gf4VarM11888b10.close();
                }
            case 16:
                String str15 = this.f28076b;
                gf4 gf4VarM11888b11 = ((ve4) obj).m11888b("SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1");
                try {
                    gf4VarM11888b11.mo5109a(1, str15);
                    return Boolean.valueOf(gf4VarM11888b11.mo5112g() && ((int) gf4VarM11888b11.getLong(0)) != 0);
                } finally {
                    gf4VarM11888b11.close();
                }
            case 17:
                String str16 = this.f28076b;
                ve4 ve4Var2 = (ve4) obj;
                gf4 gf4VarM11888b12 = ve4Var2.m11888b("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    gf4VarM11888b12.mo5109a(1, str16);
                    gf4VarM11888b12.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var2));
                } finally {
                    gf4VarM11888b12.close();
                }
            case 18:
                gf4 gf4VarM11888b13 = ((ve4) obj).m11888b(this.f28076b);
                try {
                    int iM10633E34 = sc6.m10633E(gf4VarM11888b13, "id");
                    int iM10633E35 = sc6.m10633E(gf4VarM11888b13, "state");
                    int iM10633E36 = sc6.m10633E(gf4VarM11888b13, "worker_class_name");
                    int iM10633E37 = sc6.m10633E(gf4VarM11888b13, "input_merger_class_name");
                    int iM10633E38 = sc6.m10633E(gf4VarM11888b13, "input");
                    int iM10633E39 = sc6.m10633E(gf4VarM11888b13, "output");
                    int iM10633E40 = sc6.m10633E(gf4VarM11888b13, "initial_delay");
                    int iM10633E41 = sc6.m10633E(gf4VarM11888b13, "interval_duration");
                    int iM10633E42 = sc6.m10633E(gf4VarM11888b13, "flex_duration");
                    int iM10633E43 = sc6.m10633E(gf4VarM11888b13, "run_attempt_count");
                    int iM10633E44 = sc6.m10633E(gf4VarM11888b13, "backoff_policy");
                    int iM10633E45 = sc6.m10633E(gf4VarM11888b13, "backoff_delay_duration");
                    int iM10633E46 = sc6.m10633E(gf4VarM11888b13, "last_enqueue_time");
                    int iM10633E47 = sc6.m10633E(gf4VarM11888b13, "minimum_retention_duration");
                    int iM10633E48 = sc6.m10633E(gf4VarM11888b13, "schedule_requested_at");
                    int iM10633E49 = sc6.m10633E(gf4VarM11888b13, "run_in_foreground");
                    int iM10633E50 = sc6.m10633E(gf4VarM11888b13, "out_of_quota_policy");
                    int iM10633E51 = sc6.m10633E(gf4VarM11888b13, "period_count");
                    int iM10633E52 = sc6.m10633E(gf4VarM11888b13, "generation");
                    int iM10633E53 = sc6.m10633E(gf4VarM11888b13, "next_schedule_time_override");
                    int iM10633E54 = sc6.m10633E(gf4VarM11888b13, "next_schedule_time_override_generation");
                    int iM10633E55 = sc6.m10633E(gf4VarM11888b13, "stop_reason");
                    int iM10633E56 = sc6.m10633E(gf4VarM11888b13, "trace_tag");
                    int iM10633E57 = sc6.m10633E(gf4VarM11888b13, "backoff_on_system_interruptions");
                    int iM10633E58 = sc6.m10633E(gf4VarM11888b13, "required_network_type");
                    int iM10633E59 = sc6.m10633E(gf4VarM11888b13, "required_network_request");
                    int iM10633E60 = sc6.m10633E(gf4VarM11888b13, "requires_charging");
                    int iM10633E61 = sc6.m10633E(gf4VarM11888b13, "requires_device_idle");
                    int iM10633E62 = sc6.m10633E(gf4VarM11888b13, "requires_battery_not_low");
                    int iM10633E63 = sc6.m10633E(gf4VarM11888b13, "requires_storage_not_low");
                    int iM10633E64 = sc6.m10633E(gf4VarM11888b13, "trigger_content_update_delay");
                    int iM10633E65 = sc6.m10633E(gf4VarM11888b13, "trigger_max_content_delay");
                    int iM10633E66 = sc6.m10633E(gf4VarM11888b13, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (gf4VarM11888b13.mo5112g()) {
                        String strMo5110b5 = gf4VarM11888b13.mo5110b(iM10633E34);
                        int i6 = iM10633E47;
                        int i7 = iM10633E46;
                        f25 f25VarM13003D2 = y70.m13003D((int) gf4VarM11888b13.getLong(iM10633E35));
                        String strMo5110b6 = gf4VarM11888b13.mo5110b(iM10633E36);
                        String strMo5110b7 = gf4VarM11888b13.mo5110b(iM10633E37);
                        byte[] blob2 = gf4VarM11888b13.getBlob(iM10633E38);
                        zs0 zs0Var2 = zs0.f36338b;
                        zs0 zs0VarM77o3 = C0006a5.m77o(blob2);
                        zs0 zs0VarM77o4 = C0006a5.m77o(gf4VarM11888b13.getBlob(iM10633E39));
                        long j9 = gf4VarM11888b13.getLong(iM10633E40);
                        long j10 = gf4VarM11888b13.getLong(iM10633E41);
                        long j11 = gf4VarM11888b13.getLong(iM10633E42);
                        int i8 = (int) gf4VarM11888b13.getLong(iM10633E43);
                        int i9 = iM10633E34;
                        int i10 = iM10633E36;
                        EnumC0887lw enumC0887lwM13000A2 = y70.m13000A((int) gf4VarM11888b13.getLong(iM10633E44));
                        long j12 = gf4VarM11888b13.getLong(iM10633E45);
                        long j13 = gf4VarM11888b13.getLong(i7);
                        long j14 = gf4VarM11888b13.getLong(i6);
                        int i11 = iM10633E48;
                        long j15 = gf4VarM11888b13.getLong(i11);
                        int i12 = iM10633E35;
                        int i13 = iM10633E49;
                        boolean z2 = ((int) gf4VarM11888b13.getLong(i13)) != 0;
                        int i14 = iM10633E37;
                        int i15 = iM10633E50;
                        f63 f63VarM13002C2 = y70.m13002C((int) gf4VarM11888b13.getLong(i15));
                        iM10633E50 = i15;
                        int i16 = iM10633E51;
                        int i17 = (int) gf4VarM11888b13.getLong(i16);
                        iM10633E51 = i16;
                        int i18 = iM10633E52;
                        int i19 = (int) gf4VarM11888b13.getLong(i18);
                        int i20 = iM10633E53;
                        long j16 = gf4VarM11888b13.getLong(i20);
                        int i21 = iM10633E54;
                        int i22 = (int) gf4VarM11888b13.getLong(i21);
                        iM10633E54 = i21;
                        iM10633E55 = iM10633E55;
                        int i23 = (int) gf4VarM11888b13.getLong(iM10633E55);
                        iM10633E56 = iM10633E56;
                        String strMo5110b8 = gf4VarM11888b13.isNull(iM10633E56) ? null : gf4VarM11888b13.mo5110b(iM10633E56);
                        int i24 = iM10633E57;
                        Integer numValueOf3 = gf4VarM11888b13.isNull(i24) ? null : Integer.valueOf((int) gf4VarM11888b13.getLong(i24));
                        if (numValueOf3 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i25 = iM10633E58;
                        s03 s03VarM13001B = y70.m13001B((int) gf4VarM11888b13.getLong(i25));
                        int i26 = iM10633E59;
                        p03 p03VarM13017R = y70.m13017R(gf4VarM11888b13.getBlob(i26));
                        int i27 = iM10633E60;
                        boolean z3 = ((int) gf4VarM11888b13.getLong(i27)) != 0;
                        int i28 = iM10633E61;
                        boolean z4 = ((int) gf4VarM11888b13.getLong(i28)) != 0;
                        int i29 = iM10633E62;
                        boolean z5 = ((int) gf4VarM11888b13.getLong(i29)) != 0;
                        iM10633E62 = i29;
                        int i30 = iM10633E63;
                        int i31 = iM10633E64;
                        int i32 = iM10633E65;
                        iM10633E64 = i31;
                        int i33 = iM10633E66;
                        arrayList3.add(new q25(strMo5110b5, f25VarM13003D2, strMo5110b6, strMo5110b7, zs0VarM77o3, zs0VarM77o4, j9, j10, j11, new jl0(p03VarM13017R, s03VarM13001B, z3, z4, z5, ((int) gf4VarM11888b13.getLong(i30)) != 0, gf4VarM11888b13.getLong(i31), gf4VarM11888b13.getLong(i32), y70.m13031k(gf4VarM11888b13.getBlob(i33))), i8, enumC0887lwM13000A2, j12, j13, j14, j15, z2, f63VarM13002C2, i17, i19, j16, i22, i23, strMo5110b8, boolValueOf));
                        iM10633E37 = i14;
                        iM10633E49 = i13;
                        iM10633E52 = i18;
                        iM10633E53 = i20;
                        iM10633E57 = i24;
                        iM10633E58 = i25;
                        iM10633E59 = i26;
                        iM10633E60 = i27;
                        iM10633E61 = i28;
                        iM10633E66 = i33;
                        iM10633E65 = i32;
                        iM10633E63 = i30;
                        iM10633E47 = i6;
                        iM10633E34 = i9;
                        iM10633E36 = i10;
                        iM10633E35 = i12;
                        iM10633E48 = i11;
                        iM10633E46 = i7;
                        break;
                    }
                    return arrayList3;
                } finally {
                    gf4VarM11888b13.close();
                }
            case 19:
                String str17 = this.f28076b;
                gf4 gf4VarM11888b14 = ((ve4) obj).m11888b("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    gf4VarM11888b14.mo5109a(1, str17);
                    gf4VarM11888b14.mo5112g();
                    return ju4Var;
                } finally {
                    gf4VarM11888b14.close();
                }
            case 20:
                String str18 = this.f28076b;
                gf4 gf4VarM11888b15 = ((ve4) obj).m11888b("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    gf4VarM11888b15.mo5109a(1, str18);
                    ArrayList arrayList4 = new ArrayList();
                    while (gf4VarM11888b15.mo5112g()) {
                        byte[] blob3 = gf4VarM11888b15.getBlob(0);
                        zs0 zs0Var3 = zs0.f36338b;
                        arrayList4.add(C0006a5.m77o(blob3));
                    }
                    gf4VarM11888b15.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    gf4VarM11888b15.close();
                    throw th3;
                }
            case 21:
                String str19 = this.f28076b;
                ve4 ve4Var3 = (ve4) obj;
                gf4 gf4VarM11888b16 = ve4Var3.m11888b("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    gf4VarM11888b16.mo5109a(1, str19);
                    gf4VarM11888b16.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var3));
                } finally {
                    gf4VarM11888b16.close();
                }
            case 22:
                String str20 = this.f28076b;
                gf4 gf4VarM11888b17 = ((ve4) obj).m11888b("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    gf4VarM11888b17.mo5109a(1, str20);
                    ArrayList arrayList5 = new ArrayList();
                    while (gf4VarM11888b17.mo5112g()) {
                        arrayList5.add(gf4VarM11888b17.mo5110b(0));
                    }
                    gf4VarM11888b17.close();
                    return arrayList5;
                } catch (Throwable th4) {
                    gf4VarM11888b17.close();
                    throw th4;
                }
            default:
                String str21 = this.f28076b;
                gf4 gf4VarM11888b18 = ((ve4) obj).m11888b("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    gf4VarM11888b18.mo5109a(1, str21);
                    ArrayList arrayList6 = new ArrayList();
                    while (gf4VarM11888b18.mo5112g()) {
                        arrayList6.add(gf4VarM11888b18.mo5110b(0));
                    }
                    gf4VarM11888b18.close();
                    return arrayList6;
                } catch (Throwable th5) {
                    gf4VarM11888b18.close();
                    throw th5;
                }
        }
    }
}
