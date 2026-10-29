package p000;

import android.net.NetworkRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends zc6 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ byte f28874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy0(byte b) {
        super((byte) 14);
        this.f28874j = b;
    }

    @Override // p000.zc6
    /* JADX INFO: renamed from: q */
    public final void mo10166q(gf4 gf4Var, Object obj) throws IOException {
        int i;
        int i2;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.f28874j) {
            case 0:
                oy0 oy0Var = (oy0) obj;
                gf4Var.mo5109a(1, oy0Var.f27204a);
                gf4Var.mo5109a(2, oy0Var.f27205b);
                return;
            case 1:
                sd3 sd3Var = (sd3) obj;
                gf4Var.mo5109a(1, sd3Var.f30183a);
                gf4Var.mo5117z(2, sd3Var.f30184b.longValue());
                return;
            case 2:
                ig4 ig4Var = (ig4) obj;
                gf4Var.mo5109a(1, ig4Var.f21408a);
                gf4Var.mo5117z(2, ig4Var.f21409b);
                gf4Var.mo5117z(3, ig4Var.f21410c);
                return;
            case 3:
                gf4Var.mo5109a(1, null);
                gf4Var.mo5109a(2, ((k25) obj).f22836a);
                return;
            case 4:
                q25 q25Var = (q25) obj;
                gf4Var.mo5109a(1, q25Var.f28162a);
                gf4Var.mo5117z(2, y70.m13016Q(q25Var.f28163b));
                gf4Var.mo5109a(3, q25Var.f28164c);
                gf4Var.mo5109a(4, q25Var.f28165d);
                zs0 zs0Var = zs0.f36338b;
                gf4Var.mo5108E(5, C0006a5.m57M(q25Var.f28166e));
                gf4Var.mo5108E(6, C0006a5.m57M(q25Var.f28167f));
                gf4Var.mo5117z(7, q25Var.f28168g);
                gf4Var.mo5117z(8, q25Var.f28169h);
                gf4Var.mo5117z(9, q25Var.f28170i);
                gf4Var.mo5117z(10, q25Var.f28172k);
                int iOrdinal = q25Var.f28173l.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return;
                    }
                    i = 1;
                }
                gf4Var.mo5117z(11, i);
                gf4Var.mo5117z(12, q25Var.f28174m);
                gf4Var.mo5117z(13, q25Var.f28175n);
                gf4Var.mo5117z(14, q25Var.f28176o);
                gf4Var.mo5117z(15, q25Var.f28177p);
                gf4Var.mo5117z(16, q25Var.f28178q ? 1L : 0L);
                int iOrdinal2 = q25Var.f28179r.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        C0670g.m5864c();
                        return;
                    }
                    i2 = 1;
                }
                gf4Var.mo5117z(17, i2);
                gf4Var.mo5117z(18, q25Var.f28180s);
                gf4Var.mo5117z(19, q25Var.f28181t);
                gf4Var.mo5117z(20, q25Var.f28182u);
                gf4Var.mo5117z(21, q25Var.f28183v);
                gf4Var.mo5117z(22, q25Var.f28184w);
                String str = q25Var.f28185x;
                if (str == null) {
                    gf4Var.mo5115m(23);
                } else {
                    gf4Var.mo5109a(23, str);
                }
                Boolean bool = q25Var.f28186y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    gf4Var.mo5115m(24);
                } else {
                    gf4Var.mo5117z(24, numValueOf.intValue());
                }
                jl0 jl0Var = q25Var.f28171j;
                s03 s03Var = jl0Var.f22382a;
                int iOrdinal3 = s03Var.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 == 2) {
                    i3 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i3 = 4;
                    } else {
                        if (s03Var != s03.f29793f) {
                            xy4.m12789r("Could not convert ", s03Var, " to int");
                            return;
                        }
                        i3 = 5;
                    }
                }
                gf4Var.mo5117z(25, i3);
                NetworkRequest networkRequest = (NetworkRequest) jl0Var.f22383b.f27261a;
                if (networkRequest == null) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            int[] transportTypes = networkRequest.getTransportTypes();
                            int[] capabilities = networkRequest.getCapabilities();
                            objectOutputStream.writeInt(transportTypes.length);
                            for (int i4 : transportTypes) {
                                objectOutputStream.writeInt(i4);
                            }
                            objectOutputStream.writeInt(capabilities.length);
                            for (int i5 : capabilities) {
                                objectOutputStream.writeInt(i5);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                lb5.m7941v(objectOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            lb5.m7941v(byteArrayOutputStream, th3);
                            throw th4;
                        }
                    }
                }
                gf4Var.mo5108E(26, byteArray);
                gf4Var.mo5117z(27, jl0Var.f22384c ? 1L : 0L);
                gf4Var.mo5117z(28, jl0Var.f22385d ? 1L : 0L);
                gf4Var.mo5117z(29, jl0Var.f22386e ? 1L : 0L);
                gf4Var.mo5117z(30, jl0Var.f22387f ? 1L : 0L);
                gf4Var.mo5117z(31, jl0Var.f22388g);
                gf4Var.mo5117z(32, jl0Var.f22389h);
                Set<il0> set = jl0Var.f22390i;
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (il0 il0Var : set) {
                                objectOutputStream2.writeUTF(il0Var.f21526a.toString());
                                objectOutputStream2.writeBoolean(il0Var.f21527b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                lb5.m7941v(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            lb5.m7941v(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                gf4Var.mo5108E(33, byteArray2);
                return;
            default:
                v25 v25Var = (v25) obj;
                gf4Var.mo5109a(1, v25Var.f32351a);
                gf4Var.mo5109a(2, v25Var.f32352b);
                return;
        }
    }

    @Override // p000.zc6
    /* JADX INFO: renamed from: y */
    public final String mo10167y() {
        switch (this.f28874j) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
