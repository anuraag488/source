package p000;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b25 extends vq3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ WorkDatabase_Impl f15043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b25(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.f15043d = workDatabase_Impl;
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: a */
    public final void mo3412a(ve4 ve4Var) {
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        zy5.m13843G(ve4Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        zy5.m13843G(ve4Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        zy5.m13843G(ve4Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: b */
    public final void mo3413b(ve4 ve4Var) {
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `Dependency`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `WorkSpec`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `WorkTag`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `WorkName`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `WorkProgress`");
        zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: d */
    public final void mo3415d(ve4 ve4Var) {
        zy5.m13843G(ve4Var, "PRAGMA foreign_keys = ON");
        n72 n72VarM3064g = this.f15043d.m3064g();
        mq4 mq4Var = n72VarM3064g.f25491b;
        mq4Var.getClass();
        gf4 gf4VarM11888b = ve4Var.m11888b("PRAGMA query_only");
        try {
            gf4VarM11888b.mo5112g();
            boolean z = gf4VarM11888b.getLong(0) != 0;
            sc6.m10672m(gf4VarM11888b, null);
            if (!z) {
                zy5.m13843G(ve4Var, "PRAGMA temp_store = MEMORY");
                zy5.m13843G(ve4Var, "PRAGMA recursive_triggers = 1");
                zy5.m13843G(ve4Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (mq4Var.f25140a) {
                    zy5.m13843G(ve4Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    zy5.m13843G(ve4Var, od4.m9042W("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C1126rz c1126rz = (C1126rz) mq4Var.f25146g;
                ReentrantLock reentrantLock = (ReentrantLock) c1126rz.f29738b;
                reentrantLock.lock();
                try {
                    c1126rz.f29737a = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (n72VarM3064g.f25496g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sc6.m10672m(gf4VarM11888b, th2);
                throw th3;
            }
        }
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: f */
    public final void mo3417f(ve4 ve4Var) {
        sl2 sl2VarM7680G = kx5.m7680G();
        gf4 gf4VarM11888b = ve4Var.m11888b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (gf4VarM11888b.mo5112g()) {
            try {
                sl2VarM7680G.add(gf4VarM11888b.mo5110b(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    sc6.m10672m(gf4VarM11888b, th);
                    throw th2;
                }
            }
        }
        sc6.m10672m(gf4VarM11888b, null);
        ListIterator listIterator = kx5.m7740w(sl2VarM7680G).listIterator(0);
        while (true) {
            ow1 ow1Var = (ow1) listIterator;
            if (!ow1Var.hasNext()) {
                return;
            }
            String str = (String) ow1Var.next();
            if (od4.m9043X(str, "room_fts_content_sync_", false)) {
                zy5.m13843G(ve4Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: g */
    public final uq3 mo3418g(ve4 ve4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new qh4("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new qh4("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        linkedHashSet.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("prerequisite_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new sh4("index_Dependency_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        linkedHashSet2.add(new sh4("index_Dependency_prerequisite_id", false, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC")));
        th4 th4Var = new th4("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        th4 th4VarM8514x = n40.m8514x(ve4Var, "Dependency");
        if (!th4Var.equals(th4VarM8514x)) {
            return new uq3("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + th4Var + "\n Found:\n" + th4VarM8514x, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new qh4("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new qh4("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new qh4("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new qh4("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new qh4("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new qh4("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new qh4("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new qh4("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new qh4("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new qh4("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new qh4("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new qh4("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new qh4("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new qh4("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new qh4("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new qh4("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new qh4("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new qh4("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new qh4("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new qh4("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new qh4("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new qh4("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new qh4("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new qh4("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new qh4("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new qh4("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new qh4("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new qh4("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new qh4("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new qh4("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new qh4("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new qh4("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new qh4("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new sh4("index_WorkSpec_schedule_requested_at", false, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC")));
        linkedHashSet4.add(new sh4("index_WorkSpec_last_enqueue_time", false, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC")));
        th4 th4Var2 = new th4("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        th4 th4VarM8514x2 = n40.m8514x(ve4Var, "WorkSpec");
        if (!th4Var2.equals(th4VarM8514x2)) {
            return new uq3("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + th4Var2 + "\n Found:\n" + th4VarM8514x2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new qh4("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new qh4("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new sh4("index_WorkTag_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        th4 th4Var3 = new th4("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        th4 th4VarM8514x3 = n40.m8514x(ve4Var, "WorkTag");
        if (!th4Var3.equals(th4VarM8514x3)) {
            return new uq3("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + th4Var3 + "\n Found:\n" + th4VarM8514x3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new qh4("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new qh4("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new qh4("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        th4 th4Var4 = new th4("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        th4 th4VarM8514x4 = n40.m8514x(ve4Var, "SystemIdInfo");
        if (!th4Var4.equals(th4VarM8514x4)) {
            return new uq3("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + th4Var4 + "\n Found:\n" + th4VarM8514x4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new qh4("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new qh4("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new sh4("index_WorkName_work_spec_id", false, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC")));
        th4 th4Var5 = new th4("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        th4 th4VarM8514x5 = n40.m8514x(ve4Var, "WorkName");
        if (!th4Var5.equals(th4VarM8514x5)) {
            return new uq3("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + th4Var5 + "\n Found:\n" + th4VarM8514x5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new qh4("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new qh4("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new rh4("WorkSpec", "CASCADE", "CASCADE", Collections.singletonList("work_spec_id"), Collections.singletonList("id")));
        th4 th4Var6 = new th4("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        th4 th4VarM8514x6 = n40.m8514x(ve4Var, "WorkProgress");
        if (!th4Var6.equals(th4VarM8514x6)) {
            return new uq3("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + th4Var6 + "\n Found:\n" + th4VarM8514x6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new qh4("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new qh4("long_value", "INTEGER", false, 0, null, 1));
        th4 th4Var7 = new th4("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        th4 th4VarM8514x7 = n40.m8514x(ve4Var, "Preference");
        if (th4Var7.equals(th4VarM8514x7)) {
            return new uq3(null, true);
        }
        return new uq3("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + th4Var7 + "\n Found:\n" + th4VarM8514x7, false);
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: c */
    public final void mo3414c() {
    }

    @Override // p000.vq3
    /* JADX INFO: renamed from: e */
    public final void mo3416e() {
    }
}
