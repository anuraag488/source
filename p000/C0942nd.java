package p000;

import android.graphics.BlendModeColorFilter;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: renamed from: nd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0942nd implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25689a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f25690b;

    public /* synthetic */ C0942nd(byte b) {
        this.f25689a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        b70 b70Var;
        Object objM7389n;
        byte b = this.f25689a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                long j = this.f25690b;
                z50 z50Var = (z50) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32)) / 2.0f;
                t02 t02VarM6593r = i20.m6593r(z50Var, fIntBitsToFloat);
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(5));
                o00 o00Var = new o00();
                o00Var.f26229a = blendModeColorFilter;
                o00Var.f26230b = j;
                o00Var.f26231c = 5;
                VarHandle.storeStoreFence();
                C0979od c0979od = new C0979od((byte) 0);
                c0979od.f26627b = fIntBitsToFloat;
                c0979od.f26628c = t02VarM6593r;
                c0979od.f26629d = o00Var;
                VarHandle.storeStoreFence();
                return z50Var.m13338a(c0979od);
            case 1:
                long j2 = this.f25690b;
                n30 n30Var = (n30) obj;
                yp1 yp1Var = n30Var.f25417b;
                if (yp1Var != null && (b70Var = n30Var.f25416a) != null) {
                    try {
                        objM7389n = yp1Var.invoke(Long.valueOf(j2));
                    } catch (Throwable th) {
                        objM7389n = k43.m7389n(th);
                    }
                    b70Var.resumeWith(objM7389n);
                    break;
                }
                return ju4Var;
            case 2:
                ((q14) obj).mo4898a(z04.f35677a, new y04(uu1.f32175a, this.f25690b, x04.f33901b, true));
                return ju4Var;
            case 3:
                ((hw2) obj).m6527e(zv1.f36407b, Long.valueOf(this.f25690b));
                return null;
            default:
                long j3 = this.f25690b;
                gf4 gf4VarM11888b = ((ve4) obj).m11888b("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    gf4VarM11888b.mo5117z(1, j3);
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
                        ArrayList arrayList2 = arrayList;
                        int i = iM10633E13;
                        f25 f25VarM13003D = y70.m13003D((int) gf4VarM11888b.getLong(iM10633E2));
                        String strMo5110b2 = gf4VarM11888b.mo5110b(iM10633E3);
                        String strMo5110b3 = gf4VarM11888b.mo5110b(iM10633E4);
                        byte[] blob = gf4VarM11888b.getBlob(iM10633E5);
                        zs0 zs0Var = zs0.f36338b;
                        zs0 zs0VarM77o = C0006a5.m77o(blob);
                        zs0 zs0VarM77o2 = C0006a5.m77o(gf4VarM11888b.getBlob(iM10633E6));
                        long j4 = gf4VarM11888b.getLong(iM10633E7);
                        long j5 = gf4VarM11888b.getLong(iM10633E8);
                        long j6 = gf4VarM11888b.getLong(iM10633E9);
                        int i2 = (int) gf4VarM11888b.getLong(iM10633E10);
                        int i3 = iM10633E;
                        int i4 = iM10633E2;
                        EnumC0887lw enumC0887lwM13000A = y70.m13000A((int) gf4VarM11888b.getLong(iM10633E11));
                        long j7 = gf4VarM11888b.getLong(iM10633E12);
                        long j8 = gf4VarM11888b.getLong(i);
                        long j9 = gf4VarM11888b.getLong(iM10633E14);
                        int i5 = iM10633E15;
                        long j10 = gf4VarM11888b.getLong(i5);
                        int i6 = iM10633E16;
                        boolean z = ((int) gf4VarM11888b.getLong(i6)) != 0;
                        iM10633E16 = i6;
                        int i7 = iM10633E17;
                        f63 f63VarM13002C = y70.m13002C((int) gf4VarM11888b.getLong(i7));
                        iM10633E17 = i7;
                        int i8 = iM10633E18;
                        int i9 = (int) gf4VarM11888b.getLong(i8);
                        iM10633E18 = i8;
                        int i10 = iM10633E19;
                        int i11 = (int) gf4VarM11888b.getLong(i10);
                        int i12 = iM10633E20;
                        long j11 = gf4VarM11888b.getLong(i12);
                        int i13 = iM10633E21;
                        int i14 = (int) gf4VarM11888b.getLong(i13);
                        int i15 = iM10633E22;
                        int i16 = (int) gf4VarM11888b.getLong(i15);
                        int i17 = iM10633E23;
                        String strMo5110b4 = gf4VarM11888b.isNull(i17) ? null : gf4VarM11888b.mo5110b(i17);
                        int i18 = iM10633E24;
                        Integer numValueOf = gf4VarM11888b.isNull(i18) ? null : Integer.valueOf((int) gf4VarM11888b.getLong(i18));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        iM10633E24 = i18;
                        int i19 = iM10633E25;
                        s03 s03VarM13001B = y70.m13001B((int) gf4VarM11888b.getLong(i19));
                        int i20 = iM10633E26;
                        p03 p03VarM13017R = y70.m13017R(gf4VarM11888b.getBlob(i20));
                        iM10633E25 = i19;
                        int i21 = iM10633E27;
                        boolean z2 = ((int) gf4VarM11888b.getLong(i21)) != 0;
                        iM10633E27 = i21;
                        int i22 = iM10633E28;
                        boolean z3 = ((int) gf4VarM11888b.getLong(i22)) != 0;
                        iM10633E28 = i22;
                        int i23 = iM10633E29;
                        boolean z4 = ((int) gf4VarM11888b.getLong(i23)) != 0;
                        iM10633E29 = i23;
                        int i24 = iM10633E30;
                        int i25 = iM10633E31;
                        int i26 = iM10633E32;
                        iM10633E31 = i25;
                        int i27 = iM10633E33;
                        iM10633E33 = i27;
                        iM10633E32 = i26;
                        arrayList2.add(new q25(strMo5110b, f25VarM13003D, strMo5110b2, strMo5110b3, zs0VarM77o, zs0VarM77o2, j4, j5, j6, new jl0(p03VarM13017R, s03VarM13001B, z2, z3, z4, ((int) gf4VarM11888b.getLong(i24)) != 0, gf4VarM11888b.getLong(i25), gf4VarM11888b.getLong(i26), y70.m13031k(gf4VarM11888b.getBlob(i27))), i2, enumC0887lwM13000A, j7, j8, j9, j10, z, f63VarM13002C, i9, i11, j11, i14, i16, strMo5110b4, boolValueOf));
                        iM10633E = i3;
                        iM10633E30 = i24;
                        iM10633E15 = i5;
                        iM10633E19 = i10;
                        iM10633E20 = i12;
                        iM10633E21 = i13;
                        iM10633E22 = i15;
                        iM10633E23 = i17;
                        arrayList = arrayList2;
                        iM10633E26 = i20;
                        iM10633E13 = i;
                        iM10633E2 = i4;
                        break;
                    }
                    return arrayList;
                } finally {
                    gf4VarM11888b.close();
                }
        }
    }
}
