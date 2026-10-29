package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s25 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f29841a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ byte f29842b;

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        String str = this.f29841a;
        byte b = this.f29842b;
        gf4 gf4VarM11888b = ((ve4) obj).m11888b(str);
        try {
            gf4VarM11888b.mo5117z(1, b);
            int iM10633E = sc6.m10633E(gf4VarM11888b, "id");
            int iM10633E2 = sc6.m10633E(gf4VarM11888b, "state");
            int iM10633E3 = sc6.m10633E(gf4VarM11888b, "worker_class_name");
            int iM10633E4 = sc6.m10633E(gf4VarM11888b, "input_merger_class_name");
            int iM10633E5 = sc6.m10633E(gf4VarM11888b, "input");
            int iM10633E6 = sc6.m10633E(gf4VarM11888b, "output");
            int iM10633E7 = sc6.m10633E(gf4VarM11888b, "initial_delay");
            int iM10633E8 = sc6.m10633E(gf4VarM11888b, "interval_duration");
            int iM10633E9 = sc6.m10633E(gf4VarM11888b, "flex_duration");
            int iM10633E10 = sc6.m10633E(gf4VarM11888b, "run_attempt_count");
            int iM10633E11 = sc6.m10633E(gf4VarM11888b, "backoff_policy");
            int iM10633E12 = sc6.m10633E(gf4VarM11888b, "backoff_delay_duration");
            int iM10633E13 = sc6.m10633E(gf4VarM11888b, "last_enqueue_time");
            int iM10633E14 = sc6.m10633E(gf4VarM11888b, "minimum_retention_duration");
            int iM10633E15 = sc6.m10633E(gf4VarM11888b, "schedule_requested_at");
            int iM10633E16 = sc6.m10633E(gf4VarM11888b, "run_in_foreground");
            int iM10633E17 = sc6.m10633E(gf4VarM11888b, "out_of_quota_policy");
            int iM10633E18 = sc6.m10633E(gf4VarM11888b, "period_count");
            int iM10633E19 = sc6.m10633E(gf4VarM11888b, "generation");
            int iM10633E20 = sc6.m10633E(gf4VarM11888b, "next_schedule_time_override");
            int iM10633E21 = sc6.m10633E(gf4VarM11888b, "next_schedule_time_override_generation");
            int iM10633E22 = sc6.m10633E(gf4VarM11888b, "stop_reason");
            int iM10633E23 = sc6.m10633E(gf4VarM11888b, "trace_tag");
            int iM10633E24 = sc6.m10633E(gf4VarM11888b, "backoff_on_system_interruptions");
            int iM10633E25 = sc6.m10633E(gf4VarM11888b, "required_network_type");
            int iM10633E26 = sc6.m10633E(gf4VarM11888b, "required_network_request");
            int iM10633E27 = sc6.m10633E(gf4VarM11888b, "requires_charging");
            int iM10633E28 = sc6.m10633E(gf4VarM11888b, "requires_device_idle");
            int iM10633E29 = sc6.m10633E(gf4VarM11888b, "requires_battery_not_low");
            int iM10633E30 = sc6.m10633E(gf4VarM11888b, "requires_storage_not_low");
            int iM10633E31 = sc6.m10633E(gf4VarM11888b, "trigger_content_update_delay");
            int iM10633E32 = sc6.m10633E(gf4VarM11888b, "trigger_max_content_delay");
            int iM10633E33 = sc6.m10633E(gf4VarM11888b, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (gf4VarM11888b.mo5112g()) {
                String strMo5110b = gf4VarM11888b.mo5110b(iM10633E);
                int i = iM10633E13;
                int i2 = iM10633E14;
                f25 f25VarM13003D = y70.m13003D((int) gf4VarM11888b.getLong(iM10633E2));
                String strMo5110b2 = gf4VarM11888b.mo5110b(iM10633E3);
                String strMo5110b3 = gf4VarM11888b.mo5110b(iM10633E4);
                byte[] blob = gf4VarM11888b.getBlob(iM10633E5);
                zs0 zs0Var = zs0.f36338b;
                zs0 zs0VarM77o = C0006a5.m77o(blob);
                zs0 zs0VarM77o2 = C0006a5.m77o(gf4VarM11888b.getBlob(iM10633E6));
                long j = gf4VarM11888b.getLong(iM10633E7);
                long j2 = gf4VarM11888b.getLong(iM10633E8);
                long j3 = gf4VarM11888b.getLong(iM10633E9);
                int i3 = (int) gf4VarM11888b.getLong(iM10633E10);
                int i4 = iM10633E;
                int i5 = iM10633E2;
                EnumC0887lw enumC0887lwM13000A = y70.m13000A((int) gf4VarM11888b.getLong(iM10633E11));
                long j4 = gf4VarM11888b.getLong(iM10633E12);
                long j5 = gf4VarM11888b.getLong(i);
                long j6 = gf4VarM11888b.getLong(i2);
                int i6 = iM10633E15;
                long j7 = gf4VarM11888b.getLong(i6);
                iM10633E15 = i6;
                int i7 = iM10633E16;
                int i8 = iM10633E3;
                boolean z = ((int) gf4VarM11888b.getLong(i7)) != 0;
                int i9 = iM10633E17;
                int i10 = iM10633E4;
                f63 f63VarM13002C = y70.m13002C((int) gf4VarM11888b.getLong(i9));
                int i11 = iM10633E18;
                int i12 = (int) gf4VarM11888b.getLong(i11);
                int i13 = iM10633E19;
                int i14 = (int) gf4VarM11888b.getLong(i13);
                int i15 = iM10633E20;
                long j8 = gf4VarM11888b.getLong(i15);
                int i16 = iM10633E21;
                int i17 = (int) gf4VarM11888b.getLong(i16);
                iM10633E21 = i16;
                iM10633E22 = iM10633E22;
                int i18 = (int) gf4VarM11888b.getLong(iM10633E22);
                int i19 = iM10633E23;
                Boolean boolValueOf = null;
                String strMo5110b4 = gf4VarM11888b.isNull(i19) ? null : gf4VarM11888b.mo5110b(i19);
                int i20 = iM10633E24;
                Integer numValueOf = gf4VarM11888b.isNull(i20) ? null : Integer.valueOf((int) gf4VarM11888b.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iM10633E25;
                s03 s03VarM13001B = y70.m13001B((int) gf4VarM11888b.getLong(i21));
                int i22 = iM10633E26;
                p03 p03VarM13017R = y70.m13017R(gf4VarM11888b.getBlob(i22));
                int i23 = iM10633E27;
                boolean z2 = ((int) gf4VarM11888b.getLong(i23)) != 0;
                int i24 = iM10633E28;
                boolean z3 = ((int) gf4VarM11888b.getLong(i24)) != 0;
                int i25 = iM10633E29;
                boolean z4 = ((int) gf4VarM11888b.getLong(i25)) != 0;
                iM10633E29 = i25;
                int i26 = iM10633E30;
                int i27 = iM10633E31;
                int i28 = iM10633E32;
                iM10633E31 = i27;
                int i29 = iM10633E33;
                arrayList.add(new q25(strMo5110b, f25VarM13003D, strMo5110b2, strMo5110b3, zs0VarM77o, zs0VarM77o2, j, j2, j3, new jl0(p03VarM13017R, s03VarM13001B, z2, z3, z4, ((int) gf4VarM11888b.getLong(i26)) != 0, gf4VarM11888b.getLong(i27), gf4VarM11888b.getLong(i28), y70.m13031k(gf4VarM11888b.getBlob(i29))), i3, enumC0887lwM13000A, j4, j5, j6, j7, z, f63VarM13002C, i12, i14, j8, i17, i18, strMo5110b4, bool));
                iM10633E28 = i24;
                iM10633E4 = i10;
                iM10633E17 = i9;
                iM10633E18 = i11;
                iM10633E19 = i13;
                iM10633E20 = i15;
                iM10633E23 = i19;
                iM10633E24 = i20;
                iM10633E25 = i21;
                iM10633E26 = i22;
                iM10633E27 = i23;
                iM10633E33 = i29;
                iM10633E32 = i28;
                iM10633E30 = i26;
                iM10633E = i4;
                iM10633E3 = i8;
                iM10633E13 = i;
                iM10633E14 = i2;
                iM10633E2 = i5;
                iM10633E16 = i7;
            }
            return arrayList;
        } finally {
            gf4VarM11888b.close();
        }
    }
}
