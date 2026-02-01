package com.harishdemo.usage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageRepo extends JpaRepository<UsageLog, Long> {}
