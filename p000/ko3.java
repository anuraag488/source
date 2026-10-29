package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ko3 extends at2 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f23288c = 1;

    /* JADX INFO: renamed from: d */
    public Context f23289d;

    public ko3(Context context, int i, int i2) {
        super(i, i2);
        this.f23289d = context;
    }

    @Override // p000.at2
    /* JADX INFO: renamed from: a */
    public final void mo3294a(uo1 uo1Var) {
        switch (this.f23288c) {
            case 0:
                if (this.f14859b >= 10) {
                    uo1Var.m11594k(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f23289d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                uo1Var.m11593j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f23289d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    uo1Var.m11589a();
                    try {
                        uo1Var.m11594k(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        uo1Var.m11594k(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        uo1Var.m11596q();
                        uo1Var.m11592g();
                    } catch (Throwable th) {
                        uo1Var.m11592g();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    uo1Var.m11589a();
                    try {
                        uo1Var.m11594k(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        uo1Var.m11594k(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        uo1Var.m11596q();
                        return;
                    } finally {
                        uo1Var.m11592g();
                    }
                }
                return;
        }
    }

    public /* synthetic */ ko3(int i, int i2) {
        super(i, i2);
    }
}
