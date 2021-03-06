package edu.hit.software.se160132.entity;

import edu.hit.software.se160132.entity.constraint.Immutable;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Permission implements Immutable {
    @Id
    @GeneratedValue
    private Long id;
    private Long target;
    private Integer targetType;
    private Long accountId;
    @CreatedDate
    private Instant created;
    private Long creator;

    public Permission(){

    }

    public Permission(Long accountId, Integer targetType,  Long target,Long creator){
        this.accountId = accountId;
        this.creator = creator;
        this.target = target;
        this.targetType = targetType;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Instant getCreated() {
        return created;
    }

    @Override
    public void setCreated(Instant created) {
        this.created = created;
    }

    @Override
    public Long getCreator() {
        return creator;
    }

    @Override
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getTarget() {
        return target;
    }

    public void setTarget(Long target) {
        this.target = target;
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }
}
