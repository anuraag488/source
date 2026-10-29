package p000;

import android.content.ContentValues;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z15 extends at2 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f35703c;

    /* JADX INFO: renamed from: d */
    public Object f35704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z15(int i, int i2, byte b) {
        super(i, i2);
        this.f35703c = b;
    }

    @Override // p000.at2
    /* JADX INFO: renamed from: b */
    public final void mo3295b(ve4 ve4Var) {
        switch (this.f35703c) {
            case 0:
                zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                zy5.m13843G(ve4Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                zy5.m13843G(ve4Var, "DROP TABLE `WorkSpec`");
                zy5.m13843G(ve4Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                o85 o85Var = (o85) this.f35704d;
                if (!(ve4Var instanceof ve4)) {
                    o85Var.getClass();
                    return;
                }
                uo1 uo1Var = ve4Var.f32560a;
                o85Var.getClass();
                uo1Var.m11593j("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                int i = 0;
                Object[] objArr = new Object[0];
                if (contentValues.size() == 0) {
                    C1077qn.m9987m("Empty values");
                    return;
                }
                int size = contentValues.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(uo1.f32021b[3]);
                sb.append("WorkSpec SET ");
                int i2 = 0;
                for (String str : contentValues.keySet()) {
                    sb.append(i2 > 0 ? "," : "");
                    sb.append(str);
                    objArr2[i2] = contentValues.get(str);
                    sb.append("=?");
                    i2++;
                }
                for (int i3 = size; i3 < length; i3++) {
                    objArr2[i3] = objArr[i3 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                bp1 bp1VarM11591e = uo1Var.m11591e(sb.toString());
                while (i < length) {
                    Object obj = objArr2[i];
                    i++;
                    if (obj == null) {
                        bp1VarM11591e.mo3105m(i);
                    } else if (obj instanceof byte[]) {
                        bp1VarM11591e.mo3103E(i, (byte[]) obj);
                    } else if (obj instanceof Float) {
                        bp1VarM11591e.mo3106o(i, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bp1VarM11591e.mo3106o(i, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bp1VarM11591e.mo3107z(i, ((Number) obj).longValue());
                    } else if (obj instanceof Integer) {
                        bp1VarM11591e.mo3107z(i, ((Number) obj).intValue());
                    } else if (obj instanceof Short) {
                        bp1VarM11591e.mo3107z(i, ((Number) obj).shortValue());
                    } else if (obj instanceof Byte) {
                        bp1VarM11591e.mo3107z(i, ((Number) obj).byteValue());
                    } else if (obj instanceof String) {
                        bp1VarM11591e.mo3104h(i, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        bp1VarM11591e.mo3107z(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                    }
                }
                bp1VarM11591e.f15477b.executeUpdateDelete();
                return;
            default:
                zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                zy5.m13843G(ve4Var, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                zy5.m13843G(ve4Var, "DROP TABLE `WorkSpec`");
                zy5.m13843G(ve4Var, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                ia5 ia5Var = (ia5) this.f35704d;
                if (!(ve4Var instanceof ve4)) {
                    ia5Var.getClass();
                    return;
                }
                uo1 uo1Var2 = ve4Var.f32560a;
                ia5Var.getClass();
                uo1Var2.m11593j("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
                return;
        }
    }
}
